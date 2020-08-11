# new feature
# Tags: optional
#Feature: engloba todos los escenarios
Feature: Pagina Walmart
#ESCENARIO A
  @Walmart
  Scenario Outline: Busqueda de laptop en Walmart
    Given la pagina web de Walmart se encuentra abierta
    When doy click en el campo de Busque
    When escribo el producto de compra "<datos>"
    And presiono la lupa de busqueda
    And selecciono Una Marca procesador corefive
    Then verifico resultado busqueda corefive
    And selecciono Una Marca procesador coreseven
    Then verifico resultado busqueda coreseven

    Examples:
      | datos  |
      | laptop |
#ESCENARIO B
  @WalmartCarrito
  Scenario Outline: Agregar producto en el carrito
    Given la pagina web de Walmart se encuentra abierta
    When doy click en el campo de Busque
    When escribo el producto de compra "<datos>"
    And presiono la lupa de busqueda
    And selecciono el producto
    And agrego a Anadir al carrito
    Then verifico cantidad en el carrito
    Examples:
      | datos                             |
      | mascarilla  quirurgica desechable |
