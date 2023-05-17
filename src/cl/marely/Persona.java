package cl.marely;

/**
 * @author marely
 *
 */
public class Persona {
	private String rut;
	private String nombre;

	public Persona(String rut, String nombre) {
		super();
		this.rut = rut;
		this.nombre = nombre;
	}

	/**
	 * @return the rut
	 */
	public String getRut() {
		return rut;
	}

	/**
	 * @param rut the rut to set
	 */
	public void setRut(String rut) {
		this.rut = rut;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Persona [rut=" + rut + ", nombre=" + nombre + ", getRut()=" + getRut() + ", getNombre()=" + getNombre()
				+ "]";
	}
}
