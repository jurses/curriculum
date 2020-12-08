package controladores;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Optional;

import org.hildan.fxgson.FxGson;

import com.google.gson.Gson;

import javafx.beans.property.SimpleObjectProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Tab;
import javafx.scene.layout.BorderPane;
import javafx.stage.FileChooser;

import app.Main;
import modelos.CV;

public class MainController {

	private ConocimientoController conocimiento_cont;
	private ContactController contact_cont;
	private ExperienciaController experiencia_cont;
	private FormacionController fomacion_cont;
	private PersonalController personal_cont;

	private Optional<File> selectedFile;

	private FileChooser fc;

	private SimpleObjectProperty<CV> cv;

	@FXML
	private BorderPane view;

	@FXML
	private Tab personalTab;

	@FXML
	private Tab contactoTab;

	@FXML
	private Tab formacionTab;

	@FXML
	private Tab experienciaTab;

	@FXML
	private Tab conocimientosTab;

	public MainController() {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/MainView.fxml"));
			loader.setController(this);
			loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}

		fc = new FileChooser();
		
		selectedFile = Optional.ofNullable(null);

		cv = new SimpleObjectProperty<>(new CV());

		conocimiento_cont = new ConocimientoController();
		contact_cont = new ContactController();
		experiencia_cont = new ExperienciaController();
		fomacion_cont = new FormacionController();
		personal_cont = new PersonalController();

		personalTab.setContent(personal_cont.getView());
		personal_cont.setPersona(cv.getValue().getPersonal().getValue());
	}

	public Parent getView() {
		return view;
	}

	@FXML
	void onAbrirAction(ActionEvent event) {
		selectedFile = Optional.ofNullable(fc.showOpenDialog(Main.getMain_stage()));
		if (selectedFile.isPresent()) {
			String line = "";
			String jsonString = "";
			BufferedReader jsonReader;

			try {
				jsonReader = new BufferedReader(new FileReader(selectedFile.get()));
				while ((line = jsonReader.readLine()) != null)
					jsonString += line;

				jsonReader.close();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			Gson fxGson = FxGson.create();
			cv.set(fxGson.fromJson(jsonString, CV.class));
		}
	}

	@FXML
	void onAcercaDeAction(ActionEvent event) {

	}

	@FXML
	void onGuardarAction(ActionEvent event) {
		if (!selectedFile.isPresent())
			onGuardarComoAction(event);
	}

	@FXML
	void onGuardarComoAction(ActionEvent event) {
		fc.setTitle("Guardar CV");
		try {
			File file = fc.showSaveDialog(Main.getMain_stage());
			FileWriter fw = new FileWriter(file);
			
			BufferedWriter bw = new BufferedWriter(fw);
			//Gson fxGson = FxGson.create(); // por ahora no funciona
			Gson gson = new Gson();
			
			bw.write(gson.toJson(cv));
			bw.close();
			fw.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@FXML
	void onNuevoAction(ActionEvent event) {

	}

	@FXML
	void onSalirAction(ActionEvent event) {

	}
}
