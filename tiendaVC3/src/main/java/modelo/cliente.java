package modelo;

public class cliente {

	int c_cliente;
	String direccion_c;
	String email_c;
	String nombre_c;
	String telefono_c;
	
	public cliente() {

	}

	public cliente(int c_cliente, String direccion_c, String email_c, String nombre_c, String telefono_c) {
		super();
		this.c_cliente = c_cliente;
		this.direccion_c = direccion_c;
		this.email_c = email_c;
		this.nombre_c = nombre_c;
		this.telefono_c = telefono_c;
	}

	public int getC_cliente() {
		return c_cliente;
	}

	public void setC_cliente(int c_cliente) {
		this.c_cliente = c_cliente;
	}

	public String getDireccion_c() {
		return direccion_c;
	}

	public void setDireccion_c(String direccion_c) {
		this.direccion_c = direccion_c;
	}

	public String getEmail_c() {
		return email_c;
	}

	public void setEmail_c(String email_c) {
		this.email_c = email_c;
	}

	public String getNombre_c() {
		return nombre_c;
	}

	public void setNombre_c(String nombre_c) {
		this.nombre_c = nombre_c;
	}

	public String getTelefono_c() {
		return telefono_c;
	}

	public void setTelefono_c(String telefono_c) {
		this.telefono_c = telefono_c;
	}

	
}
