# new feature
# Tags: optional

Feature: Login desde la url de Wio
  @Wio  #nombre del escenario

  Scenario Outline: Aprobacion de instrucciones
    Given Inicializando la pagina de wio
    When ingresar el "<Usuario>"
    And seleccionar el "<Perfil>"
    And presiono el boton Ingresar
    And posicionarse en MenuWio
    And ingresar a IntruccionOperativa
    And posicionar en MenuNuevo
    And ingresar a NuevaInstruccionOperativa
    And ingresar el "<CUCliente>"
  # And dar enter
    And dar clic en Continuar lista popup
    And seleccionar el "<Producto>"
    And seleccionar la "<FormadeOperacion1>"
    And seleccionar la "<FormadeOperacion2>"
    And seleccionar tipo de "<Moneda>"
    And ingresar el "<Importe>"
    And ingresar a la pestaña Doc Adjuntos
  # And Pagare doc obligatorio dar check en Conforme Doc.
  # And Pagare doc obligatorio dar check en Firmas y Poderes
  # And Pagare doc obligatorio dar check en Doc Digitales
    And dar clic en Grabar y Enviar
    And dar clic en Aceptar Grabar y Enviar la instrucción

    Examples:
      | Usuario | Perfil        | CUCliente | Producto           | FormadeOperacion1   | FormadeOperacion1 | Moneda | Importe  |
      | b10988  | Recepcionista | 60309819  | Mediano Plazo      | Mediano - Solicitud | Reactiva          | Soles  | 20000000 |
      | b10988  | Recepcionista | 60309819  | Descuento de Letras | Mediano - Solicitud | Reactiva          | Soles  | 20000000 |