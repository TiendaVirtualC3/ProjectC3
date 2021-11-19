<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
		<title>Gestion Proveedor</title>
</head>
<body>
	<div class="d-flex">
		<div style="border: none" class="card col-sm-4">
			<div class="card_body">
				<form action="controlador?menu=proveedor" method="post">
					<div class="form-group">
						<label>Nombre Proveedor</label>
						<input type="text" value="${proveedores.getNombre_p()}" name="txtnombrep" class="form-control">
					</div>
					<div class="form-group">
						<label>ID Proveedor</label>
						<input type="text" value="${proveedores.getIdproveedor()}" name="txtid" class="form-control">
					</div>
					<div class="form-group">
						<label>Ciudad Proveedor</label>
						<input type="text" value="${proveedores.getCiudad_p()}" name="txtciudadp" class="form-control">
					</div>
					<div class="form-group">
						<label>Direecion</label>
						<input type="text" value="${proveedores.getDireccion_p()}" name="txtdireccionp" class="form-control">
					</div>
					<div class="form-group">
						<label>Telefono</label>
						<input type="text" value="${proveedores.getTelefono_p()}" name="txttelefonop" class="form-control">
						<label></label>
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
						<th>ID</th>
						<th>CIUDAD</th>
						<th>DIRECCION</th>
						<th>TELEFONO</th>
						<th>ACCIONES</th>
					</tr> 
				</thead>
				<tbody>
					<c:forEach var="pr" items="${proveedor}">
					<tr>
						<td>${pr.getNombre_p()}</td>
						<td>${pr.getIdproveedor()}</td>
						<td>${pr.getDireccion_p()}</td>
						<td>${pr.getCiudad_p()}</td>
						<td>${pr.getTelefono_p()}</td>
						<td>
							<a class="btn btn-warning" href="controlador?menu=proveedor&accion=Editar&idproveedor=${pr.getIdproveedor()}">Editar</a>
							<a class="btn btn-warning" href="controlador?menu=proveedor&accion=Eliminar&idproveedor=${pr.getIdproveedor()}">Eliminar</a>
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