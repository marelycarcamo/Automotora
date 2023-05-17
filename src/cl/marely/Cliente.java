package cl.marely;

public class Cliente extends Persona {
	private int edad;

	public Cliente(String rut, String nombre, int edad) {
		super(rut, nombre);
		this.setEdad(edad);
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

}
