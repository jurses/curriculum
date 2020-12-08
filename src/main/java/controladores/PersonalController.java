package controladores;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.input.InputMethodEvent;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import modelos.Personal;
import modelos.Nacionalidad;

public class PersonalController {

	private ObjectProperty<Personal> personal;

	public ObjectProperty<Personal> getPersonal() {
		return personal;
	}

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private GridPane view;

	@FXML
	private TextField identificacionText;

	@FXML
	private TextField nombreText;

	@FXML
	private TextField apellidosText;

	@FXML
	private DatePicker fechaNacimientoDate;

	@FXML
	private TextArea direccionText;

	@FXML
	private TextField codigoPostalText;

	@FXML
	private TextField localidadText;

	@FXML
	private ListView<Nacionalidad> nacionalidadesList;

	@FXML
	private ComboBox<String> paisCombo;

	@FXML
	private Button nuevaNacionalidadButton;

	@FXML
	private Button quitarNacionalidadButton;

	@FXML
	void onNuevaNacionalidadAction(ActionEvent event) {

	}

	@FXML
	void onQuitarNacionalidadAction(ActionEvent event) {

	}

	public PersonalController() {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/PersonalView.fxml"));
			loader.setController(this);
			loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}

		personal = new SimpleObjectProperty<Personal>();

		personal.addListener((o, ov, nv) -> personalChanged(nv));

		try {
			BufferedReader csvReader = new BufferedReader(new FileReader("src/main/resources/csv/paises.csv"));
			String line = "";

			while ((line = csvReader.readLine()) != null)
				paisCombo.getItems().add(line);

			csvReader.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		paisCombo.getSelectionModel().select(0);
	}

	public void setPersona(Personal persona) {
		personal.set(persona);
	}

	private void personalChanged(Personal nv) {
		identificacionText.textProperty().bindBidirectional(nv.getIdentificacion());
		nombreText.textProperty().bindBidirectional(nv.getNombre());
		apellidosText.textProperty().bindBidirectional(nv.getApellidos());
		fechaNacimientoDate.valueProperty().bindBidirectional(nv.getFechaNacimiento());
		direccionText.textProperty().bindBidirectional(nv.getDireccion());
		codigoPostalText.textProperty().bindBidirectional(nv.getCodigoPostal());
		localidadText.textProperty().bindBidirectional(nv.getLocalidad());
		paisCombo.valueProperty().bindBidirectional(nv.getPais());
		nacionalidadesList.itemsProperty().bindBidirectional(nv.getNacionalidades());

		System.out.println("bindeados");
	}

	public Parent getView() {
		return view;
	}

	@FXML
	void initialize() {
		assert view != null : "fx:id=\"view\" was not injected: check your FXML file 'PersonalView.fxml'.";
		assert identificacionText != null
				: "fx:id=\"identificacionText\" was not injected: check your FXML file 'PersonalView.fxml'.";
		assert nombreText != null : "fx:id=\"nombreText\" was not injected: check your FXML file 'PersonalView.fxml'.";
		assert apellidosText != null
				: "fx:id=\"apellidosText\" was not injected: check your FXML file 'PersonalView.fxml'.";
		assert fechaNacimientoDate != null
				: "fx:id=\"fechaNacimientoDate\" was not injected: check your FXML file 'PersonalView.fxml'.";
		assert direccionText != null
				: "fx:id=\"direccionText\" was not injected: check your FXML file 'PersonalView.fxml'.";
		assert codigoPostalText != null
				: "fx:id=\"codigoPostalText\" was not injected: check your FXML file 'PersonalView.fxml'.";
		assert localidadText != null
				: "fx:id=\"localidadText\" was not injected: check your FXML file 'PersonalView.fxml'.";
		assert nacionalidadesList != null
				: "fx:id=\"nacionalidadesList\" was not injected: check your FXML file 'PersonalView.fxml'.";
		assert paisCombo != null : "fx:id=\"paisCombo\" was not injected: check your FXML file 'PersonalView.fxml'.";
		assert nuevaNacionalidadButton != null
				: "fx:id=\"nuevaNacionalidadButton\" was not injected: check your FXML file 'PersonalView.fxml'.";
		assert quitarNacionalidadButton != null
				: "fx:id=\"quitarNacionalidadButton\" was not injected: check your FXML file 'PersonalView.fxml'.";
	}

}
