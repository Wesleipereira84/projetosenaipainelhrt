<%@page import="org.senai.dao.UsuarioDao"%>
<%@page import="org.senai.model.Usuario"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Área de Acesso</title>
<link rel="stylesheet" href="css/estilo.css">
</head>
<body>


<%@ include file="menu.jsp" %>

<form action="loginServlet" method="post">

 <fieldset>
             
        <legend><b> Acessar Painel </b></legend>
        <label for="email">Usuário</label>
        		<input type="text" id="email" name="email" autocomplete="off" /> 
        <label for="senha">Senha</label>
        		<input type="password" name="senha" id="senha">
        <input type="submit" class="bt" value="Acessar">

	
	<% String erro = request.getParameter("erro");
    if(erro != null) {
    
	%>
	<script type="text/javascript">
		alert("Usuário ou senha incorretos");
	</script>
	<%
	}
	%>
	
	 	
    </fieldset>
 </form>
</body>
</html>