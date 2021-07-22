#language: es
@historias
Característica: : UTest Registro
  Como usuario, deseo realizar el ingreso de mis datos y registro en la página UTest.com
  @escenario1
  Escenario: Registrar usuario en UTest.com
    Dado que Andres desea registrarse en la pagina UTest
    Cuando realiza el registro en la pagina
      |Contrasena         | Nombre            |  Apellido         | Correo                         | Dia   | Mes   | Annio   | Ciudad   | ZIP   | Pais     | OS
      |ChoucairTesting2021| Andres Felipe     |  Yanquen Niño     | andresqqw@hotmail.com          | 23    |  June | 1996    | Medellin | 050015| Colombia | Windows
    Entonces el verifica que se realizo el registro con la pantalla Welcome to the world's largest community of freelance software testers!
