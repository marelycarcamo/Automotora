package cl.marely;

/**
 * @author marely
 *
 */
public class Taxi extends Vehiculo {
	private int valorPasaje = 3000;

	/**
	 * @return the valorPasaje
	 */
	public int getValorPasaje() {
		return valorPasaje;
	}

	/**
	 * @param valorPasaje the valorPasaje to set
	 */
	public void setValorPasaje(int valorPasaje, int tarifa) {
		this.valorPasaje = valorPasaje;

	}

	/*
	 * Método pagarPasaje: Ingresar el monto por parámetro, antes de pagar el
	 * pasaje se debe validar que este monto sea mayor al valor del pasaje inicial.
	 * Si se cumple, devolver el vuelto. ○ Si no se cumple, devolver el pasaje
	 * original.
	 */

	public void pagarPasaje(int monto) {
		System.out.println("\tPasaje $" + valorPasaje);
		System.out.println("\tMonto  $" + monto);
		System.out.println((monto >= valorPasaje) ? "\tVuelto $" + (monto - valorPasaje)
				: "\tSe devuelve el monto pagado  $" + monto);
	}

}
