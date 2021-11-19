package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import config.conexion;

public class clienteDAO {
	conexion cn = new conexion();
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	int rsp;
	
	public cliente buscar(int c_cliente) {
		cliente cl=new cliente();
		String sql="select * from clientes where c_cliente="+c_cliente;
		try {
			con=cn.conexion();
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				cl.setC_cliente(rs.getInt(1));
				cl.setDireccion_c(rs.getString(2));
				cl.setEmail_c(rs.getString(3));
				cl.setNombre_c(rs.getString(4));
				cl.setTelefono_c(rs.getString(5));
			}
		}catch(Exception e) {
			
		}
		return cl;
	}
	public List listar() {
		String sql = "select * FROM clientes";
		List<cliente>lista=new ArrayList<>();
		try {
			con=cn.conexion();
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				cliente cl = new cliente();
				cl.setC_cliente(rs.getInt(1));
				cl.setDireccion_c(rs.getString(2));
				cl.setEmail_c(rs.getString(3));
				cl.setNombre_c(rs.getString(4));
				cl.setTelefono_c(rs.getString(5));
				lista.add(cl); 
			}
			
		}catch(Exception e){
			
		}
		
		return lista;
		
	}

	public int agregar(cliente cl) {
		String sql="insert into clientes(c_cliente, direccion_c, email_c, nombre_c, telefono_c)values(?,?,?,?,?)";
		try {
			con=cn.conexion();
			ps=con.prepareStatement(sql);
			ps.setInt(1, cl.getC_cliente());
			ps.setString(2, cl.getDireccion_c());
			ps.setString(3, cl.getEmail_c());
			ps.setString(4, cl.getNombre_c());
			ps.setString(5, cl.getTelefono_c());
			ps.executeUpdate();
		} catch(Exception e) {
		}
		
		return rsp;
	}
	
	public cliente listarCedula(int c_cliente) {
		cliente cl1 =new cliente();
		String sql="select * from clientes where c_cliente="+ c_cliente;
		try {
			con=cn.conexion();
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				cl1.setC_cliente(rs.getInt(1));
				cl1.setDireccion_c(rs.getString(2));
				cl1.setEmail_c(rs.getString(3));
				cl1.setNombre_c(rs.getString(4));
				cl1.setTelefono_c(rs.getString(5));
			}
		}catch (Exception e){
			
		}
		
		return cl1;
	}
	
	public int actualizar(cliente cl){
		String sql="update clientes set direccion_c=?, email_c=?, nombre_c=?, telefono_c=? where c_cliente=?";
		try {
			con=cn.conexion();
			ps=con.prepareStatement(sql);
			ps.setString(1, cl.getDireccion_c());
			ps.setString(2, cl.getEmail_c());
			ps.setString(3, cl.getNombre_c());
			ps.setString(4, cl.getTelefono_c());
			ps.setInt(5, cl.getC_cliente());
			ps.executeUpdate();
		} catch(Exception e) {
		}
		
		return rsp;
		
	}
	
	public void delete(int c_cliente) {
		String sql="delete from clientes where c_cliente="+c_cliente;
		try {
			con=cn.conexion();
			ps=con.prepareStatement(sql);
			ps.executeUpdate();
		}catch(Exception e){
			
		}
		
	}


}

