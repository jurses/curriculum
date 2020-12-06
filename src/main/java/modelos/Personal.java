package modelos;

import java.time.LocalDate;
import java.util.List;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleListProperty;


public class Personal {
	private SimpleStringProperty identificacion;
	private SimpleStringProperty nombre;
	private SimpleStringProperty apellidos;
	private ObjectProperty<LocalDate> fechaNacimiento;
	private SimpleStringProperty direccion;
	private SimpleStringProperty codigoPostal;
	private SimpleStringProperty pais;
	private SimpleListProperty<Nacionalidad> nacionalidades;
}
