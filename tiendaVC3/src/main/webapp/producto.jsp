<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
		<title>Gestion Productos</title>
</head>
<body>
	<div class="d-flex">
		<div style="border: none" class="card col-sm-4">
			<div class="card_body">
				<form action="controlador?menu=producto" method="post">
					<div class="form-group">
						<label>Nombre Producto</label>
						<input type="text" value="${productos.getN_producto()}" name="txtnombrepd" class="form-control">
					</div>
					<div class="form-group">
						<label>Codigo Producto</label>
						<input type="text" value="${productos.getC_producto()}" name="txtcodigop" class="form-control">
					</div>
					<div class="form-group">
						<label>Iva producto</label>
						<input type="text" value="${productos.getIvaproducto()}" name="txtiva" class="form-control">
					</div>
					<div class="form-group">
						<label>ID Proveedor</label>
						<input type="text" value="${productos.getIdproveedor()}" name="txtidp" class="form-control">
					</div>
					<div class="form-group">
						<label>Precio Compra</label>
						<input type="text" value="${productos.getP_compra()}" name="txtpcompra" class="form-control">
					</div>
					<div class="form-group">
						<label>Precio Venta</label>
						<input type="text" value="${productos.getP_venta()}" name="txtpventa" class="form-control">
					</div>
					<input type="submit" name="accion" value="Agregar" class="btn btn-info">
					<input type="submit" name="accion" value="Actualizar" class="btn btn-success">

				</form>
			</div>
		</div>
		<div class="col-sm-8">
			<div style="border: none" class="form-control">
			<table class="table table-hover">
				<thead>
					<tr>
						<th>NOMBRE</th>
						<th>CODIGO</th>
						<th>IVA</th>
						<th>ID PROVEEDOR</th>
						<th>P. COMPRA</th>
						<th>P. VENTA</th>
						<th>ACCIONES</th>
					</tr> 
				</thead>
				<tbody>
					<c:forEach var="pd" items="${producto}">
					<tr>
						<td>${pd.getN_producto()}</td>
						<td>${pd.getC_producto()}</td>
						<td>${pd.getIvaproducto()}</td>
						<td>${pd.getIdproveedor()}</td>
						<td>${pd.getP_compra()}</td>
						<td>${pd.getP_venta()}</td>
						<td>
							<a class="btn btn-warning" href="controlador?menu=producto&accion=Editar&c_producto=${pd.getC_producto()}">Editar</a>
							<a class="btn btn-warning" href="controlador?menu=producto&accion=Eliminar&c_producto=${pd.getC_producto()}">Eliminar</a>
						</td>
					</tr>
					</c:forEach>
				</tbody>	
			</table>
		</div>
		</div>
	</div>
	
	
	<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
</body>
</html>