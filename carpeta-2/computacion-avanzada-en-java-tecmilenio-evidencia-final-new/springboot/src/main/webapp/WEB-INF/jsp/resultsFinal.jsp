<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <title>Calculadora IMC</title>
  <link href="/css/main.css" rel="stylesheet">
</head>

<body>

  <h1>Se ha guardado la informacion</h1>

  <form action="results">

    <p style="display: none;">
      <span>Usuario</span>
      <input type="text" name="user" required value='<%=request.getParameter("user")%>' />
    </p>

    <p style="display: none;">
      <span>Password</span>
      <input type="text" name="pass" required value='<%=request.getParameter("pass")%>' />
    </p>

    <p>
      <button type="submit">Regresar a la pagina anterior</button>
    </p>

  </form>

</body>

</html>
