<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
		<title>Tienda Virtual</title>
	</head>
	<body>
		<div class="container mt-4 col-lg-4">
			<div class="card col-sm-10 ">
				<div class="card-body form-control">
					<form class="form-sign" action="validar" method="POST">
						<div class="form-group text-center">
							<h5>INICIAR SESIÓN</h5>
							<img alt="100" width="280" src="img/moe.png">
						</div>
						<div class="form-group">
							<label>Usuario:</label>
							<input type="text" name="txtuser" class="form-control">
						
						</div>
						<div class="form-group">
							<label>Contraseña:</label>
							<input type="password" name="txtpass" class="form-control">
							<label></label>
						</div>
							<input type="submit" name="accion" value="Ingresar" class="btn btn-primary form-control"> 
						
					</form>
				
				</div>
			
			</div>
		
		</div>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
	</body>
</html>