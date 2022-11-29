<html>

<body>

  <h1>Actividad 1 Resultado</h1>

  <p>
    Area:
    <%= luisenmarroquin.Triangulo.metodoArea( Integer.parseInt(request.getParameter("base")),
      Integer.parseInt(request.getParameter("base")) ) %>
  </p>

  <p>
    Perimetro:
    <%= luisenmarroquin.Triangulo.metodoPerimetro( Integer.parseInt(request.getParameter("base")),
      Integer.parseInt(request.getParameter("base")), Integer.parseInt(request.getParameter("base")) ) %>
  </p>

</body>

</html>
