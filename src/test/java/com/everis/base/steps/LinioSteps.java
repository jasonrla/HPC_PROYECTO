package com.everis.base.steps;

import com.everis.base.PageObject.LinioPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LinioSteps {

    private static final Logger LOGGER = LoggerFactory.getLogger(LinioSteps.class);

    private LinioPage page;

    public void open() {
        LOGGER.info("Abro la pagina linio");
        page.open();
    }

    public void selecionoCampoTexto() {
        LOGGER.info("Selecciono campo de texto");
        page.inputBuscador.click();
    }

    public void ingresoTextoBusqueda(String busqueda) {
        LOGGER.info("Ingreso información de busqueda");
        page.inputBuscador.sendKeys(busqueda);
    }

    public void seleccionoBotonBuscar() {
        page.btnBuscador.click();
    }
}
