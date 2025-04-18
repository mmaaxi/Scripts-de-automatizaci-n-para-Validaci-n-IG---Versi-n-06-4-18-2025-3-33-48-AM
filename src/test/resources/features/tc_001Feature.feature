Feature: Validar inicio de sesión con credenciales correctas

  Scenario: Usuario inicia sesión exitosamente con credenciales válidas
    Given el usuario está en la página de inicio de sesión
    When el usuario ingresa "usuario_valido" en el campo de usuario
    And el usuario ingresa "contraseña_correcta" en el campo de contraseña
    And el usuario hace clic en el botón 'Iniciar sesión'
    Then el usuario es redirigido al panel principal