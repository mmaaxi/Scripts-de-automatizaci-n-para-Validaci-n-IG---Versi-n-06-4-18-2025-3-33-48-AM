Feature: Validación de inicio de sesión con credenciales incorrectas

  Scenario: Intento de inicio de sesión con credenciales incorrectas
    Given estoy en la página de inicio de sesión
    When ingreso el nombre de usuario "usuario_valido"
    And ingreso la contraseña "contraseña_incorrecta"
    And hago clic en el botón 'Iniciar sesión'
    Then el sistema muestra un mensaje de error indicando que las credenciales son incorrectas