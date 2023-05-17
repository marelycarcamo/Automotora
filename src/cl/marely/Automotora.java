package cl.marely;

/**
 * @author marely
 *
 */
public class Automotora {

	public static void main(String[] args) {

		System.out.println("\n------- PAGO DE PASAJE TAXI --------");

		Taxi taxi = new Taxi();
		taxi.pagarPasaje(5000);

		System.out.println("\n-----ASIENTOS DISPONIBLES BUS ------");

		Bus bus = new Bus();
		System.out.println("Asientos disponibles " + bus.getCantAsientos());

		System.out.println("\n-----IMPRIME ATRIBUTOS MINIBUS------");

		MiniBus miniBus = new MiniBus();
		miniBus.imprimeBus();

		System.out.println("\n-------EXISTE STOCK EN TIENDA-------");
		Tienda tienda = new Tienda();
		System.out.println(tienda.existeStock());

	}

}
