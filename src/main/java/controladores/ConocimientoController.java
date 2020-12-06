package controladores;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class ConocimientoController {

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
    private ListView<?> nacionalidadesList;

    @FXML
    private ComboBox<?> paisCombo;

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

}
