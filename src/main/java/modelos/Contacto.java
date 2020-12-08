package modelos;

import javafx.beans.property.SimpleListProperty;

public class Contacto {
	private SimpleListProperty<Telefono> telefonos;
	private SimpleListProperty<Email> emails;
	private SimpleListProperty<Web> webs;
	
	public Contacto()
	{
		System.out.println("Creado contacto");
		telefonos = new SimpleListProperty<Telefono>();
		emails = new SimpleListProperty<Email>();
		webs = new SimpleListProperty<Web>();
	}
}
