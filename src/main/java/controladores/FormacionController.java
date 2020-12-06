package controladores;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.GridPane;

public class FormacionController {

    @FXML
    private GridPane view;

    @FXML
    private TableView<?> tableFormacion;

    @FXML
    private TableColumn<?, ?> columnDesde;

    @FXML
    private TableColumn<?, ?> columnHasta;

    @FXML
    private TableColumn<?, ?> columnDenominacion;

    @FXML
    private TableColumn<?, ?> columnOrganizador;

    @FXML
    private Button btnAgregar;

    @FXML
    private Button btnEliminar;

    @FXML
    void agregarFormacion(ActionEvent event) {

    }

    @FXML
    void eliminarTitulo(ActionEvent event) {

    }

}
