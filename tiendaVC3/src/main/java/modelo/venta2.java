package modelo;

public class venta2 {

	int item;
	int c_producto;
	int c_cliente;
	int c_usuario;
	String NumSerie;
	String nombre_p;
	String fecha;
	double precio;
	int cantidad;
	double subtotal;
	double ivaproducto;
	double monto;
	
	public venta2() {
		
	}

	

	public venta2(int item, int c_producto, int c_cliente, int c_usuario, String numSerie, String nombre_p,
			String fecha, double precio, int cantidad, double subtotal, double ivaproducto, double monto) {
		super();
		this.item = item;
		this.c_producto = c_producto;
		this.c_cliente = c_cliente;
		this.c_usuario = c_usuario;
		NumSerie = numSerie;
		this.nombre_p = nombre_p;
		this.fecha = fecha;
		this.precio = precio;
		this.cantidad = cantidad;
		this.subtotal = subtotal;
		this.ivaproducto = ivaproducto;
		this.monto = monto;
	}



	public int getC_producto() {
		return c_producto;
	}

	public void setC_producto(int c_producto) {
		this.c_producto = c_producto;
	}

	public int getC_cliente() {
		return c_cliente;
	}

	public void setC_cliente(int c_cliente) {
		this.c_cliente = c_cliente;
	}

	public int getC_usuario() {
		return c_usuario;
	}

	public void setC_usuario(int c_usuario) {
		this.c_usuario = c_usuario;
	}

	public String getNumSerie() {
		return NumSerie;
	}

	public void setNumSerie(String numSerie) {
		NumSerie = numSerie;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public int getItem() {
		return item;
	}

	public void setItem(int item) {
		this.item = item;
	}


	public String getNombre_p() {
		return nombre_p;
	}


	public void setNombre_p(String nombre_p) {
		this.nombre_p = nombre_p;
	}



	public double getIvaproducto() {
		return ivaproducto;
	}



	public void setIvaproducto(double ivaproducto) {
		this.ivaproducto = ivaproducto;
	}
	
	
	
}
