package controladores;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javafx.beans.property.SimpleObjectProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Tab;
import javafx.scene.layout.BorderPane;

import modelos.CV; 

public class MainController {

	private ConocimientoController conocimiento_cont;
	private ContactController contact_cont;
	private ExperienciaController experiencia_cont;
	private FormacionController fomacion_cont;
	private PersonalController personal_cont;
	
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
    	
    	cv = new SimpleObjectProperty<>(new CV());
    	
    	conocimiento_cont = new ConocimientoController();
		contact_cont = new ContactController();
		experiencia_cont = new ExperienciaController();
		fomacion_cont = new FormacionController();
		personal_cont = new PersonalController();
		
		personalTab.setContent(personal_cont.getView());
		personal_cont.setPersona(cv.getValue().getPersonal().getValue());
		

	}
    
    public Parent getView()
    {
    	return view;
    }

    @FXML
    void onAbrirAction(ActionEvent event) {

    }

    @FXML
    void onAcercaDeAction(ActionEvent event) {

    }

    @FXML
    void onGuardarAction(ActionEvent event) {

    }

    @FXML
    void onGuardarComoAction(ActionEvent event) {

    }

    @FXML
    void onNuevoAction(ActionEvent event) {

    }

    @FXML
    void onSalirAction(ActionEvent event) {

    }    
}
