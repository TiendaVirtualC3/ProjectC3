package modelo;

public class proveedor {

	int idproveedor;
	String direccion_p;
	String ciudad_p;
	String nombre_p;
	String telefono_p;
	
	public proveedor() {
		
	}

	public proveedor(int idproveedor, String direccion_p, String ciudad_p, String nombre_p, String telefono_p) {
		super();
		this.idproveedor = idproveedor;
		this.direccion_p = direccion_p;
		this.ciudad_p = ciudad_p;
		this.nombre_p = nombre_p;
		this.telefono_p = telefono_p;
	}

	public int getIdproveedor() {
		return idproveedor;
	}

	public void setIdproveedor(int idproveedor) {
		this.idproveedor = idproveedor;
	}

	public String getDireccion_p() {
		return direccion_p;
	}

	public void setDireccion_p(String direccion_p) {
		this.direccion_p = direccion_p;
	}

	public String getCiudad_p() {
		return ciudad_p;
	}

	public void setCiudad_p(String ciudad_p) {
		this.ciudad_p = ciudad_p;
	}

	public String getNombre_p() {
		return nombre_p;
	}

	public void setNombre_p(String nombre_p) {
		this.nombre_p = nombre_p;
	}

	public String getTelefono_p() {
		return telefono_p;
	}

	public void setTelefono_p(String telefono_p) {
		this.telefono_p = telefono_p;
	}

	
}
