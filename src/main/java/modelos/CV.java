package modelos;

import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;

public class CV {
	
	public SimpleObjectProperty<Contacto> getContacto() {
		return contacto;
	}
	public SimpleListProperty<Experiencia> getExperiencias() {
		return experiencias;
	}
	public SimpleListProperty<Conocimiento> getConocimientos() {
		return conocimientos;
	}
	public SimpleListProperty<Titulo> getTitulos() {
		return titulos;
	}
	public SimpleObjectProperty<Personal> getPersonal() {
		return personal;
	}
	
	private SimpleListProperty<Experiencia> experiencias;
	private SimpleListProperty<Conocimiento> conocimientos;
	private SimpleListProperty<Titulo> titulos;
	private SimpleObjectProperty<Personal> personal;
	private SimpleObjectProperty<Contacto> contacto;
	
	public CV()
	{
		experiencias = new SimpleListProperty<Experiencia>(FXCollections.observableArrayList());
		conocimientos = new SimpleListProperty<Conocimiento>(FXCollections.observableArrayList());
		titulos = new SimpleListProperty<Titulo>(FXCollections.observableArrayList());
		personal = new SimpleObjectProperty<Personal>(new Personal());
		contacto = new SimpleObjectProperty<Contacto>(new Contacto());
		
		System.out.println("Creado un cv.");
	}
}
