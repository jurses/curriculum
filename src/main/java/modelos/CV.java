package modelos;

import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleObjectProperty;

public class CV {
	private SimpleObjectProperty<Contacto> contacto;
	private SimpleListProperty<Experiencia> experiencias;
	private SimpleListProperty<Conocimiento> conocimientos;
	private SimpleListProperty<Titulo> titulos;
	private SimpleObjectProperty<Personal> personal;
}
