Feature: Validar resistencia a ataques de inyección SQL en el inicio de sesión

  Scenario: Intento de inyección SQL en el inicio de sesión
    Given El usuario está en la página de inicio de sesión
    When Ingresa un comando SQL en el campo de "usuario" o "contraseña"
    And Hace clic en 'Iniciar sesión'
    Then El sistema valida la entrada y evita la ejecución de códigos maliciosos
    And El sistema muestra un mensaje de error sin exponer detalles internos