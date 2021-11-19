package modelo;

public class producto {
	
	int c_producto;
	double ivaproducto;
	int idproveedor;
	String n_producto;
	double p_compra;
	double p_venta;

	public producto() {

	}

	public producto(int c_producto, double ivaproducto, int idproveedor, String n_producto, double p_compra,
			double p_venta) {
		super();
		this.c_producto = c_producto;
		this.ivaproducto = ivaproducto;
		this.idproveedor = idproveedor;
		this.n_producto = n_producto;
		this.p_compra = p_compra;
		this.p_venta = p_venta;
	}

	public int getC_producto() {
		return c_producto;
	}

	public void setC_producto(int c_producto) {
		this.c_producto = c_producto;
	}

	public double getIvaproducto() {
		return ivaproducto;
	}

	public void setIvaproducto(double ivaproducto) {
		this.ivaproducto = ivaproducto;
	}

	public int getIdproveedor() {
		return idproveedor;
	}

	public void setIdproveedor(int idproveedor) {
		this.idproveedor = idproveedor;
	}

	public String getN_producto() {
		return n_producto;
	}

	public void setN_producto(String n_producto) {
		this.n_producto = n_producto;
	}

	public double getP_compra() {
		return p_compra;
	}

	public void setP_compra(double p_compra) {
		this.p_compra = p_compra;
	}

	public double getP_venta() {
		return p_venta;
	}

	public void setP_venta(double p_venta) {
		this.p_venta = p_venta;
	}

	
}
