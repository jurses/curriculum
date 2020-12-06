package modelos;

import java.time.LocalDate;

import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;

public class Titulo {
	private SimpleObjectProperty<LocalDate> desde;
	private SimpleObjectProperty<LocalDate> hasta;
	private SimpleStringProperty denominacion;
	private SimpleStringProperty organizador;
}
