package com.everis.base.stepDefinitions;

import com.everis.base.steps.WalmartSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class WalmartSD {
    @Steps
    WalmartSteps walmartSteps;

    @Given("la pagina web de Walmart se encuentra abierta")
    public void lapaginawebdeWalmartseencuentraabierta(){walmartSteps.open();
    }
    @When("doy click en el campo de Busque")
     public void doyClickEnElCampoDeBusque() {walmartSteps.doyClickEnElCampoDeBusque();
    }
    @When("escribo el producto de compra {string}")
    public void escriboElproductoDeCompra(String datos) {walmartSteps.escriboElproductoDeCompra(datos);
    }
    @And("presiono la lupa de busqueda")
    public void presionoLaLupaDeBusqueda() {walmartSteps.presionoLaLupaDeBusqueda();
    }
      @And("selecciono Una Marca procesador corefive")
    public void seleccionoUnaMarcaProcesadorCorefive() {walmartSteps.seleccionoUnaMarcaProcesadorCorefive();
    }

    @Then("verifico resultado busqueda corefive")
    public void verificoResultadoBusquedaCorefive() {walmartSteps.verificoResultadoBusquedaCorefive();
    }
    @And("selecciono Una Marca procesador coreseven")
    public void seleccionoUnaMarcaprocesadorcoreseven() {walmartSteps.seleccionoUnaMarcaprocesadorcoreseven();
    }
    @Then("verifico resultado busqueda coreseven")
    public void verificoResultadoBusquedaCoreseven() {walmartSteps.verificoresultadobusquedacoreseven();
    }
    @And("selecciono el producto")
    public void seleccionoElProducto() {walmartSteps.seleccionoElProducto();
    }

    @And("agrego a Anadir al carrito")
    public void agregoAAnadirAlCarrito() {walmartSteps.agregoAAnadirAlCarrito();
    }

    @Then("verifico cantidad en el carrito")
    public void verificocantidadEnElCarrito() {walmartSteps.verificocantidadEnElCarrito();
    }
}
