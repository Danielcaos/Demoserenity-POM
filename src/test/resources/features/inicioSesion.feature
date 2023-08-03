#language:es
  Característica: Inicio de sesion usuario
    Yo como usuario quiero loguarme en la pagina demo
    para administrar mi cuenta.

    @smokeTest @sesionExitosa
    Esquema del escenario: Inicio de sesion exitoso.
      Dado que el usuario abre la pagina demo
      Cuando el usuario ingresa las credenciales
        | usuario   | clave   |
        | <Usuario> | <Clave> |
      Y de clic en ingresar
      Entonces el usuario podra ver un mensaje de plataforma.
      Ejemplos:
        | Usuario | Clave     |
        | admin   | serenity  |
        | admin   | serenity1 |