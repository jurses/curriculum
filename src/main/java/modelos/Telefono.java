package modelos;

import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;

public class Telefono {
	private SimpleStringProperty numero;
	private SimpleObjectProperty<TipoTelefono> tipo;
}
