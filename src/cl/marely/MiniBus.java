package cl.marely;

/**
 * @author marely
 *
 */
public class MiniBus extends Bus {

	private String tipoViaje;

	public MiniBus(String patente, String color, int cantAsientos, String tipoViaje) {
		super(color, patente, cantAsientos);
		this.tipoViaje = tipoViaje;
	}

	public MiniBus() {
		// constructor vacio
	}

	/**
	 * @return the tipoViaje
	 */
	public String getTipoViaje() {
		return tipoViaje;
	}

	/**
	 * @param tipoViaje the tipoViaje to set
	 */
	public void setTipoViaje(String tipoViaje) {
		this.tipoViaje = tipoViaje;
	}

	/* Método imprime Bus:Imprimir todos los atributos de las clases. */
	public void imprimeBus() {
		MiniBus miniBus = new MiniBus("TRTD54", "verde", 40, "interurbano");
		System.out.println(miniBus);
	}

	@Override
	public String toString() {
		return "MiniBus [tipoViaje=" + tipoViaje + ", getCantAsientos()=" + getCantAsientos() + ", getPatente()="
				+ getPatente() + ", getColor()=" + getColor() + "]";
	}
}
