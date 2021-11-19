package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import config.conexion;

public class proveedorDAO {
	conexion cn = new conexion();
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	int rsp;
	
	public List listar() {
		String sql = "select * FROM proveedores";
		List<proveedor>lista=new ArrayList<>();
		try {
			con=cn.conexion();
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				proveedor pr = new proveedor();
				pr.setIdproveedor(rs.getInt(1));
				pr.setDireccion_p(rs.getString(2));
				pr.setCiudad_p(rs.getString(3));
				pr.setNombre_p(rs.getString(4));
				pr.setTelefono_p(rs.getString(5));
				lista.add(pr); 
			}
			
		}catch(Exception e){
			
		}
		
		return lista;
		
	}

	public int agregar(proveedor pr) {
		String sql="insert into proveedores(idproveedor, ciudad_p, direccion_p, nombre_p, telefono_p)values(?,?,?,?,?)";
		try {
			con=cn.conexion();
			ps=con.prepareStatement(sql);
			ps.setInt(1, pr.getIdproveedor());
			ps.setString(2, pr.getCiudad_p());
			ps.setString(3, pr.getDireccion_p());
			ps.setString(4, pr.getNombre_p());
			ps.setString(5, pr.getTelefono_p());
			ps.executeUpdate();
		} catch(Exception e) {
		}
		
		return rsp;
	}
	
	public proveedor listarId(int idproveedor) {
		proveedor pr1 =new proveedor();
		String sql="select * from proveedores where idproveedor="+ idproveedor;
		try {
			con=cn.conexion();
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				pr1.setIdproveedor(rs.getInt(1));
				pr1.setDireccion_p(rs.getString(3));
				pr1.setCiudad_p(rs.getString(2));
				pr1.setNombre_p(rs.getString(4));
				pr1.setTelefono_p(rs.getString(5));
			}
		}catch (Exception e){
			
		}
		
		return pr1;
	}
	
	public int actualizar(proveedor pr){
		String sql="update proveedores set ciudad_p=?, direccion_p=?, nombre_p=?, telefono_p=? where idproveedor=?";
		try {
			con=cn.conexion();
			ps=con.prepareStatement(sql);
			ps.setString(1, pr.getCiudad_p());
			ps.setString(2, pr.getDireccion_p());
			ps.setString(3, pr.getNombre_p());
			ps.setString(4, pr.getTelefono_p());
			ps.setInt(5, pr.getIdproveedor());
			ps.executeUpdate();
		} catch(Exception e) {
		}
		
		return rsp;
		
	}
	
	public void delete(int idproveedor) {
		String sql="delete from proveedores where idproveedor="+idproveedor;
		try {
			con=cn.conexion();
			ps=con.prepareStatement(sql);
			ps.executeUpdate();
		}catch(Exception e){
			
		}
		
	}


}


