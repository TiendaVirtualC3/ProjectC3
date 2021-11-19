<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
		<title>Gestion Cliente</title>
</head>
<body>
	<div class="d-flex">
		<div style="border: none" class="card col-sm-4">
			<div class="card_body">
				<form action="controlador?menu=cliente" method="post">
					<div class="form-group">
						<label>Nombre Cliente</label>
						<input type="text" value="${clientes.getNombre_c()}" name="txtnombrec" class="form-control">
					</div>
					<div class="form-group">
						<label>Cedula cliente</label>
						<input type="text" value="${clientes.getC_cliente()}" name="txtcedulac" class="form-control">
					</div>
					<div class="form-group">
						<label>Correo cliente</label>
						<input type="text" value="${clientes.getEmail_c()}" name="txtemailc" class="form-control">
					</div>
					<div class="form-group">
						<label>Direecion</label>
						<input type="text" value="${clientes.getDireccion_c()}" name="txtdireccionc" class="form-control">
					</div>
					<div class="form-group">
						<label>Telefono</label>
						<input type="text" value="${clientes.getTelefono_c()}" name="txttelefonoc" class="form-control">
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
						<th>CEDULA</th>
						<th>CORREO</th>
						<th>DIRECCION</th>
						<th>TELEFONO</th>
						<th>ACCIONES</th>
					</tr> 
				</thead>
				<tbody>
					<c:forEach var="cl" items="${cliente}">
					<tr>
						<td>${cl.getNombre_c()}</td>
						<td>${cl.getC_cliente()}</td>
						<td>${cl.getEmail_c()}</td>
						<td>${cl.getDireccion_c()}</td>
						<td>${cl.getTelefono_c()}</td>
						<td>
							<a class="btn btn-warning" href="controlador?menu=cliente&accion=Editar&c_cliente=${cl.getC_cliente()}">Editar</a>
							<a class="btn btn-warning" href="controlador?menu=cliente&accion=Eliminar&c_cliente=${cl.getC_cliente()}">Eliminar</a>
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