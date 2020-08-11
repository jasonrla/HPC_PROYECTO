package com.everis.base.steps;

import com.everis.base.PageObject.WalmartPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WalmartSteps {

    private static final Logger LOGGER = LoggerFactory.getLogger(WalmartSteps.class);

    private WalmartPage page;

    public void open() {
        LOGGER.info("la pagina web de Walmart se encuentra abierta");
        page.open();
    }

    public void doyClickEnElCampoDeBusque() {
        LOGGER.info("doy click en el campo de Busque");
        page.txtBusqueda.click();
    }

    public void escriboElproductoDeCompra(String datos) {
        LOGGER.info("escribo el producto de compra datos");
        page.txtBusqueda.type(datos); //type escribir
    }

    public void presionoLaLupaDeBusqueda() {
        LOGGER.info("presiono la lupa de busqueda");
        page.btnLupa.click();
    }

    public void seleccionoUnaMarcaProcesadorCorefive() {
        LOGGER.info("selecciono Una Marca procesador corefive");
        page.checkboxProcesadorCoreFive.click();
    }

    public void verificoResultadoBusquedaCorefive() {
        LOGGER.info("verifico resultado busqueda corefive"); //resultados
        page.txtResultadoBusqueda.waitUntilVisible();
    }

    public void seleccionoUnaMarcaprocesadorcoreseven() {
        LOGGER.info("selecciono una marca");
        page.checkboxProcesadorCoreSeven.click();
    }

    public void verificoresultadobusquedacoreseven() {
        LOGGER.info("verifico resultado busqueda coreseven");
        page.txtResultadoBusqueda.waitUntilVisible();
    }
    public void seleccionoElProducto(){
       LOGGER.info("selecciono el producto");
       page.lblProducto.click();
    }
    public void agregoAAnadirAlCarrito() {
        LOGGER.info ("agrego a Anadir al carrito");
        page.btnAnadircarrito.click();
    }

//    public void ingresoalCarrito() {
  //      LOGGER.info("ingreso al carrito");
    //    page.btnCarrito.click();
    //}

    public void verificocantidadEnElCarrito() {
      LOGGER.info("verifico cantidad en el carrito");
      page.txtCantidad.getText();
    }
}