<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <title>Calculadora IMC</title>
  <link href="/css/main.css" rel="stylesheet">
</head>

<body>

  <h1>Historial de resultados</h1>

  <p>
    <%= com.luismarroquin.view.HelloController.metodoResults( request.getParameter("user"),
      request.getParameter("pass")) %>
  </p>

  <h2>Nueva medida</h2>

  <form action="resultsFinal">

    <p style="display: none;">
      <span>Usuario</span>
      <input type="text" name="user" required value='<%=request.getParameter("user")%>' />
    </p>

    <p style="display: none;">
      <span>Password</span>
      <input type="text" name="pass" required value='<%=request.getParameter("pass")%>' />
    </p>

    <p>
      <span>Masa corporal</span>
      <input type="text" name="masaCorporal" required>
    </p>

    <p>
      <button type="submit">Enviar</button>
    </p>

  </form>

</body>

</html>
