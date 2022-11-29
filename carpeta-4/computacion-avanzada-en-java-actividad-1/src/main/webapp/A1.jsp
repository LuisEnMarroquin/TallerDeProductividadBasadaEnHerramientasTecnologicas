<html>
	<body>
	
	<h1>Actividad 1</h1>

	<p>Fecha: <%= new java.util.Date() %></p>
	
	<p>Idioma: <%= request.getLocale() %></p>
	
	<p>Browser: <%= request.getHeader("User-Agent") %></p>
	
	<form action="A1Result.jsp">
		
		<p>
			<span>Base</span>
			<input type="text" name="base">
		</p>
		
		<p>
			<button type="submit">Calculate</button>
		</p>
		
	</form>
	
	</body>
</html>