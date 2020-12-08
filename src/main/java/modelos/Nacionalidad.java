package modelos;

import javafx.beans.property.SimpleStringProperty;

public class Nacionalidad {
	private SimpleStringProperty denominacion;
	
	public Nacionalidad()
	{
		denominacion = new SimpleStringProperty();
	}
	
	public Nacionalidad(String nacionalidad)
	{
		denominacion = new SimpleStringProperty();
		denominacion.set(nacionalidad);
	}
	
	@Override
	public String toString()
	{
		return denominacion.get();
	}
	
}
