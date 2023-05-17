package cl.marely;

/**
 * @author marely
 *
 */
public class Tienda {
	private Cliente cliente;
	private Vendedor vendedor;
	private int stock = 44;

	public Tienda(Cliente cliente, Vendedor vendedor, int stock) {
		this.setCliente(cliente);
		this.setVendedor(vendedor);
		this.setStock(stock);

	}

	public Tienda() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/**
	 * @return the vendedor
	 */
	public Vendedor getVendedor() {
		return vendedor;
	}

	/**
	 * @param vendedor the vendedor to set
	 */
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	/**
	 * @return the stock
	 */
	public int getStock() {
		return stock;
	}

	/**
	 * @param stock the stock to set
	 */
	public void setStock(int stock) {
		this.stock = stock;
	}

	
	public String existeStock() {
		String existencia = "La cantidad de stock es " + getStock();
		return existencia;
	}
}