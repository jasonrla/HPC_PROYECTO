Feature: Registro en la web de Linio

  @Linio
  Scenario Outline: Realizar una busqueda en Linio
    Given me encuentro en la pagina de Linio
    When selecciono el campo de busqueda
    And ingreso el "<dato>" de busqueda
    And selcciono el boton de buscar
    Examples:
      | dato        |
      | laptop      |
      | computadora |
