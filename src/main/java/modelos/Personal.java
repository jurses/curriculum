package modelos;

import java.time.LocalDate;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleObjectProperty;


public class Personal {
	public SimpleStringProperty getIdentificacion() {
		return identificacion;
	}
	public SimpleStringProperty getNombre() {
		return nombre;
	}
	public SimpleStringProperty getApellidos() {
		return apellidos;
	}
	public ObjectProperty<LocalDate> getFechaNacimiento() {
		return fechaNacimiento;
	}
	public SimpleStringProperty getDireccion() {
		return direccion;
	}
	public SimpleStringProperty getCodigoPostal() {
		return codigoPostal;
	}
	public SimpleStringProperty getPais() {
		return pais;
	}
	public SimpleListProperty<Nacionalidad> getNacionalidades() {
		return nacionalidades;
	}
	
	@Override
	public String toString() {
		return "Personal [identificacion=" + identificacion + ", nombre=" + nombre + ", apellidos=" + apellidos
				+ ", fechaNacimiento=" + fechaNacimiento + ", direccion=" + direccion + ", codigoPostal=" + codigoPostal
				+ ", pais=" + pais + ", nacionalidades=" + nacionalidades + ", localidad=" + localidad + "]";
	}
	
	private SimpleStringProperty identificacion;
	private SimpleStringProperty nombre;
	private SimpleStringProperty apellidos;
	private ObjectProperty<LocalDate> fechaNacimiento;
	private SimpleStringProperty direccion;
	private SimpleStringProperty codigoPostal;
	private SimpleStringProperty pais;
	private SimpleListProperty<Nacionalidad> nacionalidades;
	private SimpleStringProperty localidad;
	
	public Personal()
	{
		System.out.println("creado personal.");
		identificacion = new SimpleStringProperty();
		nombre = new SimpleStringProperty("sin nombre");
		apellidos = new SimpleStringProperty();
		fechaNacimiento = new SimpleObjectProperty<LocalDate>();
		direccion = new SimpleStringProperty();
		codigoPostal = new SimpleStringProperty();
		pais = new SimpleStringProperty();
		nacionalidades = new SimpleListProperty<Nacionalidad>(FXCollections.observableArrayList());
		localidad = new SimpleStringProperty();
	}
	
	public SimpleStringProperty getLocalidad() {
		return localidad;
	}
}
