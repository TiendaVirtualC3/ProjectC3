package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import config.conexion;

public class usuarioDAO {
		conexion cn = new conexion();
		Connection con;
		PreparedStatement ps;
		ResultSet rs;
		int rsp;
		
	public usuario validar(String usuario, String pass) {
		usuario us = new usuario();
		String sql="select * FROM usuarios where usuario=? and pass=?";
		try {
			con =cn.conexion();
			ps =con.prepareStatement(sql);
			ps.setString(1, usuario);
			ps.setString(2, pass);
			rs= ps.executeQuery();
			
			while (rs.next()) {
				us.setC_usuario(rs.getInt("c_usuario"));
				us.setEmail_u(rs.getString("email_u"));
				us.setNombre_u(rs.getString("nombre_u"));
				us.setUsuario(rs.getString("usuario"));
				us.setPass(rs.getString("pass"));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return us;
		
	}
	
	//operaciones crud
	
	public List listar() {
		String sql = "select * FROM usuarios";
		List<usuario>lista=new ArrayList<>();
		try {
			con=cn.conexion();
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				usuario us = new usuario();
				us.setC_usuario(rs.getInt(1));
				us.setEmail_u(rs.getString(2));
				us.setNombre_u(rs.getString(3));
				us.setUsuario(rs.getString(4));
				us.setPass(rs.getString(5));
				lista.add(us); 
			}
			
		}catch(Exception e){
			
		}
		
		return lista;
		
	}

	public int agregar(usuario us) {
		String sql="insert into usuarios(c_usuario, email_u, nombre_u, usuario, pass)values(?,?,?,?,?)";
		try {
			con=cn.conexion();
			ps=con.prepareStatement(sql);
			ps.setInt(1, us.getC_usuario());
			ps.setString(2, us.getEmail_u());
			ps.setString(3, us.getNombre_u());
			ps.setString(4, us.getUsuario());
			ps.setString(5, us.getPass());
			ps.executeUpdate();
		} catch(Exception e) {
		}
		
		return rsp;
	}
	
	public usuario listarCedula(int c_usuario) {
		usuario usl =new usuario();
		String sql="select * from usuarios where c_usuario="+ c_usuario;
		try {
			con=cn.conexion();
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				usl.setC_usuario(rs.getInt(1));
				usl.setEmail_u(rs.getString(2));
				usl.setNombre_u(rs.getString(3));
				usl.setUsuario(rs.getString(5));
				usl.setPass(rs.getString(4));
			}
		}catch (Exception e){
			
		}
		
		return usl;
	}
	
	public int actualizar(usuario us) {
		String sql="update usuarios set email_u=?, nombre_u=?, usuario=?, pass=? where c_usuario=?";
		try {
			con=cn.conexion();
			ps=con.prepareStatement(sql);
			ps.setString(1, us.getEmail_u());
			ps.setString(2, us.getNombre_u());
			ps.setString(3, us.getUsuario());
			ps.setString(4, us.getPass());
			ps.setInt(5, us.getC_usuario());
			ps.executeUpdate();
		} catch(Exception e) {
		}
		
		return rsp;
		
	}
	
	public void delete(int c_usuario) {
		String sql="delete from usuarios where c_usuario="+c_usuario;
		try {
			con=cn.conexion();
			ps=con.prepareStatement(sql);
			ps.executeUpdate();
		}catch(Exception e){
			
		}
		
	}

}

