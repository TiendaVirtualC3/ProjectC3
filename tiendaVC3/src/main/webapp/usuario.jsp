<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
		<title>Gestion Usuario</title>
</head>
<body>
	<div class="d-flex">
		<div style="border: none" class="card col-sm-4">
			<div class="card_body">
				<form action="controlador?menu=usuario" method="post">
					<div class="form-group">
						<label>Nombre Usuario</label>
						<input type="text" value="${usuarios.getNombre_u()}" name="txtnombreu" class="form-control">
					</div>
					<div class="form-group">
						<label>Cedula Usuario</label>
						<input type="text" value="${usuarios.getC_usuario()}" name="txtcedulau" class="form-control">
					</div>
					<div class="form-group">
						<label>Correo Usuario</label>
						<input type="text" value="${usuarios.getEmail_u()}" name="txtemailu" class="form-control">
					</div>
					<div class="form-group">
						<label>Usuario</label>
						<input type="text" value="${usuarios.getUsuario()}" name="txtusuario" class="form-control">
					</div>
					<div class="form-group">
						<label>Contraseña</label>
						<input type="password" value="${usuarios.getPass()}" name="txtpass" class="form-control">
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
						<th>USUARIO</th>
						<th>CONTRASEÑA</th>
						<th>ACCIONES</th>
					</tr> 
				</thead>
				<tbody>
					<c:forEach var="us" items="${usuario}">
					<tr>
						<td>${us.getNombre_u()}</td>
						<td>${us.getC_usuario()}</td>
						<td>${us.getEmail_u()}</td>
						<td>${us.getPass()}</td>
						<td>${us.getUsuario()}</td>
						<td>
							<a class="btn btn-warning" href="controlador?menu=usuario&accion=Editar&c_usuario=${us.getC_usuario()}">Editar</a>
							<a class="btn btn-warning" href="controlador?menu=usuario&accion=Eliminar&c_usuario=${us.getC_usuario()}">Eliminar</a>
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