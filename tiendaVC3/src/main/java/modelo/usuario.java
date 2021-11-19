package modelo;

public class usuario {

	int c_usuario;
	String email_u;
	String nombre_u;
	String pass;
	String usuario;
	
	public usuario(){
		
	}
	public usuario(int c_usuario, String email_u, String nombre_u, String pass, String usuario) {
		super();
		this.c_usuario = c_usuario;
		this.email_u = email_u;
		this.nombre_u = nombre_u;
		this.pass = pass;
		this.usuario = usuario;
	}
	
	public int getC_usuario() {
		return c_usuario;
	}
	public void setC_usuario(int c_usuario) {
		this.c_usuario = c_usuario;
	}
	public String getEmail_u() {
		return email_u;
	}
	public void setEmail_u(String email_u) {
		this.email_u = email_u;
	}
	public String getNombre_u() {
		return nombre_u;
	}
	public void setNombre_u(String nombre_u) {
		this.nombre_u = nombre_u;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	
	
}
