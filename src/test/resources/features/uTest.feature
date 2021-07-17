#language: es
@historias
Característica: : UTest Registro
  Como usuario, deseo realizar el ingreso de mis datos y registro en la página UTest.com
  @escenario1
  Escenario: Registrar usuario en UTest.com
    Dado que Andres desea registrarse en la pagina UTest
    Cuando realiza el registro en la pagina
    Entonces el verifica que se realizo el registro con la pantalla de registro exitoso
