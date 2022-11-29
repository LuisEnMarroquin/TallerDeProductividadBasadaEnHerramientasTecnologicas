<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <title>Calculadora IMC</title>
  <link href="/css/main.css" rel="stylesheet">
</head>

<body>
  <h3>Hello ${name}</h3>

  <h1>Calculadora IMC</h1>

  <h2>Iniciar sesion</h2>

  <form action="results">

    <p>
      <span>Usuario</span>
      <input type="text" name="user" required>
    </p>

    <p>
      <span>Password</span>
      <input type="text" name="pass" required>
    </p>

    <p>
      <button type="submit">Enviar</button>
    </p>

  </form>

  <h2>
    Crear cuenta
  </h2>

  <form action="homePageFinal">

    <p>
      <span>Nombre completo</span>
      <input type="text" name="fullName" required>
    </p>

    <p>
      <span>Edad</span>
      <input type="number" name="age" min="15" max="150" required>
    </p>

    <p>
      <span>Genero</span>
      <select name="gender" required>
        <option value=""></option>
        <option value="M">Mujer</option>
        <option value="H">Hombre</option>
      </select>
    </p>

    <p>
      <span>Estatura (centimetros)</span>
      <input type="number" name="tall" min="100" max="250" required>
    </p>

    <p>
      <span>Usuario</span>
      <input type="text" name="user" required>
    </p>

    <p>
      <span>Password</span>
      <input type="text" name="pass" required>
    </p>

    <p>
      <button type="submit">Enviar</button>
    </p>

  </form>

  <h2>
    Usuarios registrados <%= com.luismarroquin.view.HelloController.metodoHelloCount() %>
  </h2>

  <p>
    <%= com.luismarroquin.view.HelloController.metodoHello() %>
  </p>

</body>

</html>
