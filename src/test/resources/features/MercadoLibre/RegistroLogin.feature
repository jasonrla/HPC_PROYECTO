@web
Feature: Registro en Mercado Libre

  @imperativo
  Scenario: Cliente ingresa su información 1
    Given que Cesar acceda a la web de Mercadolibre
    When selecciona crear cuenta
    And escribe nombre de usuario "Cesar"
    And escribe apellido de usuario "Gutierrez"
    And escribe email de usuario "cgutierrez@yopmail.com"
    Then escribe clave de usuario "123456"

  @declarativo
  Scenario: Cliente ingresa su información 2
    Given que Jesus acceda a la web de Mercadolibre
    When ingresa sus datos de registro
    Then valida sus datos

