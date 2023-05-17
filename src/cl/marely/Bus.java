package cl.marely;

/**
 * @author marely
 *
 */
public class Bus extends Vehiculo {
	private int cantAsientos = 40;

	public Bus(String color, String patente, int cantAsientos) {
		super(color, patente);
		this.cantAsientos = cantAsientos;
	}

	public Bus() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the cantAsientos
	 */
	public int getCantAsientos() {
		return cantAsientos;
	}

	/**
	 * @param cantAsientos the cantAsientos to set
	 */
	public void setCantAsientos(int cantAsientos) {
		this.cantAsientos = cantAsientos;
	}

	/*
	 * Método asientos disponibles: Retornar la cantidad de asientos disponibles
	 */
	public int asientosDisponibles() {
		return cantAsientos;
	}

	@Override
	public String toString() {
		return "Bus [cantAsientos=" + cantAsientos + ", getPatente()=" + getPatente() + ", getColor()=" + getColor()
				+ "]";
	}

}
