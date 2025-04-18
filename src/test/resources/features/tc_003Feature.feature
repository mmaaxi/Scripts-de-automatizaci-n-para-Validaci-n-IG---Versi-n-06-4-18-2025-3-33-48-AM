Feature: Validar la obligatoriedad de los campos de inicio de sesión

  Scenario: Intentar iniciar sesión dejando el campo de usuario vacío
    Given El usuario está en la página de inicio de sesión
    When Intenta iniciar sesión dejando el campo de usuario vacío
    Then Se muestra un mensaje solicitando el ingreso del usuario

  Scenario: Intentar iniciar sesión dejando el campo de contraseña vacío
    Given El usuario está en la página de inicio de sesión
    When Intenta iniciar sesión dejando el campo de contraseña vacío
    Then Se muestra un mensaje solicitando el ingreso de la contraseña