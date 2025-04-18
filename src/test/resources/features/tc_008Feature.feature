Feature: Verificar la correcta visualización de datos en el dashboard

  Scenario: Mostrar datos correctamente en el dashboard
    Given El usuario inicia sesión correctamente
    When El usuario navega al dashboard
    Then Se muestran los datos correspondientes
    And Los datos mostrados coinciden con los datos esperados