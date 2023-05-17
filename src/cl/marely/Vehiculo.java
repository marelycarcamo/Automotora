package cl.marely;

/**
 * @author marely
 *
 */
public class Vehiculo {
	private String patente;
	private String color;

	public Vehiculo() {
		// constructor vacio
	}

	public Vehiculo(String color, String patente) {
		this.color = color;
		this.patente = patente;

	}

	/**
	 * @return the patente
	 */
	public String getPatente() {
		return patente;
	}

	/**
	 * @param patente the patente to set
	 */
	public void setPatente(String patente) {
		this.patente = patente;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

}
