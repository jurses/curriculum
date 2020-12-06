package controladores;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

public class ContactController {

    @FXML
    private AnchorPane view;

    @FXML
    private TableView<?> tableTelefono;

    @FXML
    private TableColumn<?, ?> columnNumero;

    @FXML
    private TableColumn<?, ?> columnTipo;

    @FXML
    private Button btnAgregarTelefono;

    @FXML
    private Button btnEliminarTelefono;

    @FXML
    private TableView<?> tableEmail;

    @FXML
    private TableColumn<?, ?> columnEmail;

    @FXML
    private Button btnAgregarEmail;

    @FXML
    private Button btnEliminarEmail;

    @FXML
    private TableView<?> tableUrl;

    @FXML
    private TableColumn<?, ?> columnUrl;

    @FXML
    private Button btnAgregarUrl;

    @FXML
    private Button btnEliminarUrl;

    @FXML
    void agregarEmail(ActionEvent event) {

    }

    @FXML
    void agregarTelefono(ActionEvent event) {

    }

    @FXML
    void agregarUrl(ActionEvent event) {

    }

    @FXML
    void eliminarEmail(ActionEvent event) {

    }

    @FXML
    void eliminarTelefono(ActionEvent event) {

    }

    @FXML
    void eliminarUrl(ActionEvent event) {

    }

}
