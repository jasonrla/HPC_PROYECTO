@Desembolso
Feature: Desembolso

  @DesembolsoHipotecario
  Scenario Outline: Desembolso administrativo
    Given   un cliente "<CU>"
    When solicite un desembolso de "<producto>"
    Then ingresar al SDA "<user>" "<password>" "<ambiente>"
    And seleccionar grupo "<grupo>"
    And click en Operaciones
    And click en Creditos
    And click en Ingreso
    And click en Nuevo

    Examples:
      |CU     |producto       |user|password|ambiente|grupo|
      |5000029|Tradicional    |XT9103|Lunes15$|Pruebas|Hipotecario|
      |5000029|Prestamo facil |XT9103|Lunes15$|Pruebas|Hipotecario|

  @ConsultaCredito
  Scenario Outline: Consulta del Credito
    Given capturar pantallas
    When antes de operacion
    Then ingresar al SDA "<user>" "<password>" "<ambiente>"
    And seleccionar grupo "<grupo>"
    And click en Consultas
    And click en Consulta del Credito
    And ingresar credito "<credito>"
#prueba
    Examples:
      |user|password|ambiente|grupo|credito
      |XT9103|Lunes16%|Pruebas|Hipotecario|30000
      |XT9103|Lunes16%|Pruebas|Hipotecario|30001

  @PagoDeCuota_FechaDia
  Scenario Outline: Pago de cuotas con fecha dia
    Given un credito
    When se requiere hacer un pago de cuotas "<cuotas>"
    Then ingresar al SDA "<user>" "<password>" "<ambiente>"
    And seleccionar grupo "<grupo>"
    And click en Operaciones
    And click en Pagos
    And click en Pago de Cuotas
    And click en Nuevo
    And ingresar credito "<credito>"
    And seleccionar las cuotas "<cuotas>"
    And guardar operacion
    And validar registro en la grilla

    Examples:
      |user|password|ambiente|grupo|credito|cuotas
      |XT9103|Lunes16%|Pruebas|Hipotecario|38818|2
      #|XT9103|Lunes16%|Pruebas|Hipotecario|30001