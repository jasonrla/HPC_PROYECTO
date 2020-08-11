package com.everis.base.stepDefinitions;

import com.everis.base.steps.LinioSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LinioSD {

    @Steps
    LinioSteps linioSteps;

    @Given("me encuentro en la pagina de Linio")
    public void meEncuentroEnLaPaginaDeLinio() {
    }

    @When("selecciono el campo de busqueda")
    public void seleccionoElCampoDeBusqueda() {
        linioSteps.selecionoCampoTexto();
    }

    @And("ingreso el {string} de busqueda")
    public void ingresoElDeBusqueda(String busqueda) {
        linioSteps.ingresoTextoBusqueda(busqueda);
    }

    @And("selcciono el boton de buscar")
    public void selccionoElBotonDeBuscar() {
        linioSteps.seleccionoBotonBuscar();
    }
}
