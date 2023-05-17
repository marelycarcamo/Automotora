package cl.marely;

/**
 * @author marely
 *
 */
public class Vendedor extends Persona {
	private String direccion;

	public Vendedor(String rut, String nombre, String direccion) {
		super(rut, nombre);
		this.setDireccion(direccion);
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

}