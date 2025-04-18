Feature: Validar proceso de envío y recepción de formularios

  Scenario: Completar y enviar formulario con datos válidos
    Given que el usuario está en la página del formulario
    When el usuario completa el formulario con información válida
    And hace clic en el botón "Enviar"
    Then el sistema muestra un mensaje de confirmación indicando que la información fue procesada correctamente