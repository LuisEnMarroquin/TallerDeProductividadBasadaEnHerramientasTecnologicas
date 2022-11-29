<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>IMC</title>
</head>

<body>

  <h1>Registro</h1>

  <form action="A1Result.jsp">

    <p>
      <span>Nombre completo</span>
      <input type="text" name="fullName">
    </p>

    <p>
      <span>Edad</span>
      <input type="number" name="age" min="15" max="150">
    </p>

    <select name="gender">
      <option value="">Genero</option>
      <option value="M">Mujer</option>
      <option value="H">Hombre</option>
    </select>

    <p>
      <span>Estatura (metros)</span>
      <input type="number" name="tall" min="1" max="2.5">
    </p>

    <p>
      <span>Usuario</span>
      <input type="text" name="user">
    </p>

    <p>
      <span>Contraseña</span>
      <input type="text" name="pass">
    </p>

    <p>
      <button type="submit">Enviar</button>
    </p>

  </form>

  <h2>
    <a href="calculos.jsp">Iniciar sesión</a>
  </h2>

</body>

</html>
