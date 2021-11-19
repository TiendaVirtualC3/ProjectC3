<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
	<title>Registrar Venta</title>
</head>
	<body>
		<div class="d-flex">
			<div class="col-sm-5">
				<div class="card">
					<form action="controlador?menu=venta" method="post">
					<div class="card-body">
						<div class="form-group">
							<label>DATOS CLIENTE</label>
						</div>
						<div class="form-group d-flex">
							<div class="col-sm-3">
								<input type="text" name="cedulacliente" value="${clienteB.getC_cliente()}" class="form-control col-sm-4" placeholder="cedula">
							</div>
							<div class="col-sm-3">
								<input type="submit" name="accion" value="BuscarCliente" class="btn btn-outline-info">
							</div>
							<div class="col-sm-6">
								<input type="text" name="nombrecliente" value="${clienteB.getNombre_c()}" class="form-control col-sm-6" placeholder="Nombre cliente">
							</div>
						</div>
						<div class="form-group">
							<label>DATOS PRODUCTO</label>
						</div>
						<div class="form-group d-flex">
							<div class="col-sm-4">
								<input type="text" name="codigoproducto" value="${productoB.getC_producto()}" class="form-control col-sm-4" placeholder="Codigo">
							</div>
							<div class="col-sm-2">
								<button type="submit" name="accion" value="BuscarProducto" class="btn btn-outline-info">Buscar</button>
							</div>
							<div class="col-sm-6">
								<input type="text" name="nombreproducto" value="${productoB.getN_producto()}" class="form-control col-sm-6" placeholder="Datos producto">
							</div>
						</div>
						<div class="form-group">
							<label></label>
						</div>
						<div class="form-group d-flex">
							<div class="col-sm-6 d-flex">
								<input type="text" name="precio" value="${productoB.getP_venta()}" class="form-control col-sm-4" placeholder="Precio">
							</div>
							<div class="col-sm-2">
								<input type="text" name="Iva" value="${productoB.getIvaproducto()}" class="form-control col-sm-2" placeholder="Iva">
							</div>
							<div class="col-sm-4">
								<input type="number" name="cant" value="1" class="form-control" placeholder="Cant">
							</div>
						</div>
						<div class="form-group">
							<label></label>
						</div>
						<div class="form-group">
							<button type="submit" name="accion" value="Agregar" class="btn btn-outline-info">Agregar</button>
						</div>
						<div class="form-group">
						
						</div>
					</div>
					</form>
				</div>
			</div>
			<div class="col-sm-7">
				<div class="card">
					<div class="card-body">
						<table class="table table-hover">
							<thead>
								<tr>
									<th>Nro</th>
									<th>Codigo</th>
									<th>Descripcion</th>
									<th>Precio</th>
									<th>Cantidad</th>
									<th>SubTotal</th>
									<th>IvaProducto</th>
									<th>Acciones</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="list" items="${lista}">
								<tr>
									<td>${list.getItem()}</td>
									<td>${list.getC_producto()}</td>
									<td>${list.getNombre_p()}</td>
									<td>${list.getPrecio()}</td>
									<td>${list.getCantidad()}</td>
									<td>${list.getSubtotal()}</td>
									<td>${list.getIvaproducto()}</td>
									<td>
										<a class="btn btn-warning" href="controlador?menu=usuario&accion=Editar&c_usuario=${us.getC_usuario()}">Editar</a>
										<a class="btn btn-warning" href="controlador?menu=usuario&accion=Eliminar&c_usuario=${us.getC_usuario()}">Eliminar</a>
									</td>
								</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
					<div class="card-footer d-flex">
					<div class="col-sm-6">
						<br>
						<input type="submit" name="accion" value="Generar Venta" class="btn btn-success">
						<input type="submit" name="accion" value="Cancelar" class="btn btn-danger">
					</div>
					<div class="col-sm-3 ml-auto">
						<label>TOTAL</label>
						<input type="text" name="txtTotal" value="${total}" class="form-control">
					
					</div>
					<div class="col-sm-3 ml-auto">
						<label>TOTAL IVA</label>
						<input type="text" name="txtTotaliva" value="${totaliva}" class="form-control">
					
					</div>
					</div>
					</div>
					
				</div>
			</div>
					
			</div>
			<div class="col-sm-8">
			
			</div>
	
	
	<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
	</body>
</html>