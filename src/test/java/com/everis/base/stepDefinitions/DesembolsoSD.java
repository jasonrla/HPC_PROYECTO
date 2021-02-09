package com.everis.base.stepDefinitions;

import com.everis.base.steps.DesembolsoSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class DesembolsoSD {

    @Steps
    DesembolsoSteps desembolsoSteps;

    //Desembolso
    @Given("un cliente {string}")
    public void unCliente(String CU){}

    @When("solicite un desembolso de {string}")
    public void soliciteUnDesembolsoDe(String producto){}

    @Then("ingresar al SDA {string} {string} {string}")
    public void ingresarAlSDA(String user, String password, String ambiente) {
        desembolsoSteps.openSDA();
        desembolsoSteps.RegistroLogin(user);
        desembolsoSteps.ContraLogin(password);
        desembolsoSteps.seleccionarAmbienteDePrueba(ambiente);
        desembolsoSteps.AceptarLogin();
    }

    @And("seleccionar grupo {string}")
    public void seleccionarGrupo(String grupo) {
        desembolsoSteps.clickGrupo(grupo);
    }

    @And("click en Operaciones")
    public void clickEnOperaciones() {
        desembolsoSteps.clickPestanaOperaciones();
    }

    @And("click en Creditos")
    public void clickEnCreditos() {
        desembolsoSteps.clickOpcionCreditos();
    }

    @And("click en Ingreso")
    public void clickEnIngreso() {
        desembolsoSteps.clickSubOpcionIngreso();
    }

    @And("click en Nuevo")
    public void clickEnNuevo() {
        desembolsoSteps.clickBtnNuevo();
    }


    //Consulta del Crédito
    @Given("capturar pantallas")
    public void capturarPantallas(){}

    @When("antes de operacion")
    public void antesDeOperacion(){}

    @And("click en Consultas")
    public void clickEnConsultas(){
        desembolsoSteps.clickOpcConsultas();
    }

    @And("click en Consulta del Credito")
    public void clickEnConsultaDelCredito(){
        desembolsoSteps.clickConsultaDelCredito();
    }

    @And("ingresar credito {string}")
    public void ingresarCredito(String credito){ //throws FindFailed
        desembolsoSteps.ingresarNroCredito(credito);
    }

    //PAGO DE CUOTAS
    @And("un credito")
    public void unCredito(){desembolsoSteps.unCredito();}

    @And("se requier hacer un pago de cuotas {string}")
    public void seRequierHacerUnPagoDeCuotas(String cantCuotas){desembolsoSteps.seRequiereHacerUnPagoDeCuotas(cantCuotas);}

    @And("click en Pago")
    public void clickEnPago(){desembolsoSteps.clickEnPagos();}

    @And("click en Pago de cuotas")
    public void clickEnPagoDeCuotas(){desembolsoSteps.clickEnPagoDeCuotas();}

    //And ingresar credito

    @And("seleccionar las cuotas {string}")
    public void seleccionarLasCuotas(String cantCuotas){desembolsoSteps.seleccionarLasCuotas(cantCuotas);}

    @And("guardar operacion")
    public void guardarOperacion(){desembolsoSteps.guardarOperacion();}

    @And("validar registro en la grilla")
    public void validarRegistroEnLaGrilla(){desembolsoSteps.validarRegistroEnLaGrilla();}








    /*
    @And("cerrar web")
    public void cerrarWeb() {
        bpeSteps.cerrarWeb();
    }
*/
}