<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>App Aula</title>
	<link rel="stylesheet" href="../resources/bootstrap/css/bootstrap.min.css">
	<script src="../resources/jquery/jquery-3.6.0.min.js"></script>
	<script src="../resources/bootstrap/js/bootstrap.min.js"></script>
	<link href="../resources/fontawesome/css/all.css" rel="stylesheet">

	<link href="../resources/smartmenus/css/sm-core-css.css" rel="stylesheet" type="text/css"/>
	<link href="../resources/smartmenus/css/sm-mint/sm-mint.css" rel="stylesheet" type="text/css" />	
	
	<link href="../resources/estilos.css" rel="stylesheet">
	
</head>
<body>
    <h3>Aplicação de aula...</h3>
    
	<nav class="main-nav">
	  <!-- Sample menu definition -->
	  <ul id="main-menu" class="sm sm-mint">
	    <li><a href="../Home/Home.jsp">Home</a></li>
	    <li><a href="#">Cadastros</a>
	      <ul>
	        <li><a href="../Pessoa/PessoaCon">Pessoas</a></li>
	        <li><a href="../Cidade/CidadeCon">Cidades</a></li>
	        <li><a href="../Usuario/UsuarioCon">Usuario</a></li>
	        
	        <li><a href="#">Básicos</a>
	          <ul>
	            <li><a href="#">Estado ...</a></li>
	            <li><a href="http://vadikom.com/projects/">Projects</a></li>
	          </ul>
	        </li>
	      </ul>
	    </li>
	    <li><a href="#">Sair</a></li>
	  </ul>
	</nav>


	<!-- jQuery -->
	<script type="text/javascript"
		src="../resources/smartmenus/libs/jquery/jquery.js"></script>
	<!-- SmartMenus jQuery plugin -->
	<script type="text/javascript"
		src="../resources/smartmenus/jquery.smartmenus.js"></script>
	<!-- SmartMenus jQuery init -->
	<script type="text/javascript">
		$(function() {
			$('#main-menu').smartmenus({
				subMenusSubOffsetX : 1,
				subMenusSubOffsetY : -8
			});
		});
	</script>



</body>
</html>