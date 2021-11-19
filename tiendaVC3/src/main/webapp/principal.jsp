<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
		<title>Tienda Virtual Principal</title>
	</head>
	<body>
		<nav class="navbar navbar-expand-lg navbar-light" style="background-color: #FFD700;">
		   <div class="container-fluid">
		    <div class="collapse navbar-collapse" id="navbarNav">
		      <ul class="navbar-nav">
		        <li class="nav-item">
		          <a class="nav-link active" aria-current="page" href="#">MARKET-ANIME</a>
		        </li>
		        <li class="nav-item">
		          <a style="border: none" class="btn btn-outline-dark" href="controlador?menu=usuario&accion=Listar" target="myframe">Usuarios</a>
		        </li>
		        <li class="nav-item">
		          <a style="border: none" class="btn btn-outline-dark" href="controlador?menu=cliente&accion=Listar" target="myframe">Clientes</a>
		        </li>
		        <li class="nav-item">
		          <a style="border: none" class="btn btn-outline-dark" href="controlador?menu=proveedor&accion=Listar" target="myframe">Proveedores</a>
		        </li>
		         <li class="nav-item">
		          <a style="border: none" class="btn btn-outline-dark" href="controlador?menu=producto&accion=Listar" target="myframe">Productos</a>
		        </li>
		        <li class="nav-item">
		          <a style="border: none" class="btn btn-outline-dark" href="controlador?menu=venta&accion=default" target="myframe">Ventas</a>
		        </li>
		        <li class="nav-item">
		          <a style="border: none" class="btn btn-outline-dark" href="controlador?menu=reporte" target="myframe">Reportes</a>
		        </li>
		      </ul>
		      </div>
		      </div>
		      <div class="btn-group">
				  <button style="border: none" class="btn btn-outline-dark btn-lg dropdown-toggle" type="button" data-bs-toggle="dropdown" aria-expanded="false">
				    ${usuario.getNombre_u()}
				  </button>
				  <div class="dropdown-menu text-center">
				    <a class="dropdown-item" href="#">
				        	<img alt="100" width="100" src="img/perfil2.png">
				      	</a>
				        <a class="dropdown-item" href="#">${usuario.getUsuario()}</a>
				        <a class="dropdown-item" href="#">${usuario.getEmail_u()}</a>
				        <div class="dropdown-divider"></div>
				        <form action="validar" method="post">
				        	<button name="accion" value="salir" class="dropdown-item" href="#">Salir</button>
				        </form>
				  </div>
				</div>
				 <div class="btn-group">
				 <button class="btn btn-sm">
    				</button>
			</div>
		</nav>
				<div class="m-2" style="height: 550px;">
					<iframe name="myframe" style="height: 100%; width: 100%"></iframe>
				</div>
		<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
	</body>
</html>