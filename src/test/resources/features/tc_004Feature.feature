Feature: Recuperación de contraseña

  Scenario: Verificar funcionalidad de 'Olvidé mi contraseña'
    Given el usuario está en la pantalla de inicio de sesión
    When el usuario hace clic en el enlace 'Olvidé mi contraseña'
    Then el sistema redirige a la página de recuperación de contraseña

    When el usuario ingresa un correo electrónico válido "usuario@example.com"
    Then el sistema acepta la entrada y muestra el correo ingresado

    When el usuario hace clic en el botón 'Enviar'
    Then el sistema muestra un mensaje confirmando el envío del correo de recuperación