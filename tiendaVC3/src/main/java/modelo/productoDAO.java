package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import config.conexion;

public class productoDAO {
	conexion cn = new conexion();
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	int rsp;
	
	public producto buscar(int c_producto) {
		producto pd=new producto();
		String sql="select * from productos where c_producto="+c_producto;
		try {
			con=cn.conexion();
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				pd.setC_producto(rs.getInt(1));
				pd.setIvaproducto(rs.getDouble(2));
				pd.setIdproveedor(rs.getInt(3));
				pd.setN_producto(rs.getString(4));
				pd.setP_compra(rs.getDouble(5));
				pd.setP_venta(rs.getDouble(6));
			}
		}catch(Exception e) {
			
		}
		return pd;
	}
	public List listar() {
		String sql = "select * FROM productos";
		List<producto>lista=new ArrayList<>();
		try {
			con=cn.conexion();
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				producto pd = new producto();
				pd.setC_producto(rs.getInt(1));
				pd.setIvaproducto(rs.getDouble(2));
				pd.setIdproveedor(rs.getInt(3));
				pd.setN_producto(rs.getString(4));
				pd.setP_compra(rs.getDouble(5));
				pd.setP_venta(rs.getDouble(6));
				lista.add(pd); 
			}
			
		}catch(Exception e){
			
		}
		
		return lista;
		
	}

	public int agregar(producto pd) {
		String sql="insert into productos(c_producto, iva_producto, idproveedor, n_producto, p_compra, p_venta)values(?,?,?,?,?,?)";
		try {
			con=cn.conexion();
			ps=con.prepareStatement(sql);
			ps.setInt(1, pd.getC_producto());
			ps.setDouble(2, pd.getIvaproducto());
			ps.setInt(3, pd.getIdproveedor());
			ps.setString(4, pd.getN_producto());
			ps.setDouble(5, pd.getP_compra());
			ps.setDouble(6, pd.getP_venta());
			ps.executeUpdate();
		} catch(Exception e) {
		}
		
		return rsp;
	}
	
	public producto listarCodigo(int c_producto) {
		producto pd1 =new producto();
		String sql="select * from productos where c_producto="+ c_producto;
		try {
			con=cn.conexion();
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				pd1.setC_producto(rs.getInt(1));
				pd1.setIvaproducto(rs.getDouble(2));
				pd1.setIdproveedor(rs.getInt(3));
				pd1.setN_producto(rs.getString(4));
				pd1.setP_compra(rs.getDouble(5));
				pd1.setP_venta(rs.getDouble(6));
			}
		}catch (Exception e){
			
		}
		
		return pd1;
	}
	
	public int actualizar(producto pd){
		String sql="update productos set iva_producto=?, idproveedor=?, n_producto=?, p_compra=?, p_venta=? where c_producto=?";
		try {
			con=cn.conexion();
			ps=con.prepareStatement(sql);
			ps.setDouble(1, pd.getIvaproducto());
			ps.setInt(2, pd.getIdproveedor());
			ps.setString(3, pd.getN_producto());
			ps.setDouble(4, pd.getP_compra());
			ps.setDouble(5, pd.getP_venta());
			ps.setInt(6, pd.getC_producto());
			ps.executeUpdate();
		} catch(Exception e) {
		}
		
		return rsp;
		
	}
	
	public void delete(int c_producto) {
		String sql="delete from productos where c_producto="+c_producto;
		try {
			con=cn.conexion();
			ps=con.prepareStatement(sql);
			ps.executeUpdate();
		}catch(Exception e){
			
		}
		
	}


}

