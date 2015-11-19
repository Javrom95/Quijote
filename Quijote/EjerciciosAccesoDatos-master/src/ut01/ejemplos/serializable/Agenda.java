package ut01.ejemplos.serializable;

import java.io.Serializable;

/*public class unaClase implements Serializable;

 De esta forma, declaramos que todos los objetos instanciados de "unaClase" ser�n serializados.
 Ahora veamos un ejemplo sencillo. Crearemos una clase llamada Agenda, la cual ser� serializable:
 */

/**
 *  @descrition Clase que representa una Agenda
 *	@author Laura
 *  @version 1.0
 *  @license GPLv3
 */
public class Agenda implements Serializable {
	
	//Es necesario generarlo ya que sino es autogenerado y no hay garant�a de que se genere el mismo
	//Si no es el mismo salta la Excepci�n java.io.InvalidClassExcepction: local class incompatible
	//Si yo envio el objeto serializado entre un origen y un destino, y la versi�n del .class no es la misma
	//ser� imposible la conversi�n sin el UUID
	private static final long serialVersionUID = 6529685098267757690L;

	/**
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * 
	 * @return
	 */
	public String getP_Apellido() {
		return p_Apellido;
	}

	/**
	 * 
	 * @param p_Apellido
	 */
	public void setP_Apellido(String p_Apellido) {
		this.p_Apellido = p_Apellido;
	}

	/**
	 * 
	 * @return
	 */
	public String getS_Apellido() {
		return s_Apellido;
	}

	/**
	 * 
	 * @param s_Apellido
	 */
	public void setS_Apellido(String s_Apellido) {
		this.s_Apellido = s_Apellido;
	}

	private String nombre;
	private String p_Apellido;
	private transient String s_Apellido;

	/**
	 * 
	 * @param nombre
	 * @param p_Apellido
	 * @param s_Apellido
	 */
	public Agenda(String nombre, String p_Apellido, String s_Apellido) {
		this.nombre = nombre;
		this.p_Apellido = p_Apellido;
		this.s_Apellido = s_Apellido;
	}
}