package com.everis.base.stepDefinitions;

import com.everis.base.steps.MercadoLibreSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author jovallep
 */
public class MercadoLibreSD {

    @Steps
    MercadoLibreSteps mercadoLibreSteps;

    @Given("que Cesar acceda a la web de Mercadolibre")
    public void que_Cesar_acceda_a_la_web_de_Mercadolibre() {
        mercadoLibreSteps.open();
    }

    @When("selecciona crear cuenta")
    public void selecciona_crear_cuenta() {
        mercadoLibreSteps.selectAccountCreation();
    }

    @And("escribe nombre de usuario {string}")
    public void escribe_nombre_de_usuario(String var) {
        mercadoLibreSteps.writeName(var);
    }

    @And("escribe apellido de usuario {string}")
    public void escribe_apellido_de_usuario(String var) {

        mercadoLibreSteps.writeApellido(var);
    }

    @And("escribe email de usuario {string}")
    public void escribe_email_de_usuario(String var) {
        mercadoLibreSteps.writeEmail(var);
    }

    @Then("escribe clave de usuario {string}")
    public void escribe_clave_de_usuario(String var) {
        mercadoLibreSteps.writePassword(var);
    }

    @Given("que Jesus acceda a la web de Mercadolibre")
    public void QueJesusAccedaALaWebDeMercadolibre() {
        mercadoLibreSteps.open();
    }

    @When("ingresa sus datos de registro")
    public void ingresaSusDatosDeRegistro() {
        mercadoLibreSteps.crearCliente();
    }

    @Then("valida sus datos")
    public void validaSusDatos() {

    }



}
