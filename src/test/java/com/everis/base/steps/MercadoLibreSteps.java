package com.everis.base.steps;

import com.everis.base.PageObject.MercadoLibrePage;
import net.thucydides.core.annotations.Step;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author jovallep
 */
public class MercadoLibreSteps {

    private static final Logger LOGGER = LoggerFactory.getLogger(MercadoLibreSteps.class);

    private MercadoLibrePage page;

    @Step
    public void crearCliente() {
        LOGGER.info("Ingresa la información del cliente");
        selectAccountCreation();
        writeName("111");
        writeApellido("111");
        writeEmail("asd@asd.com");
        writePassword("123456");
    }

    public void open() {
        LOGGER.info("Abre la pagina web");
        page.open();
    }

    public void selectAccountCreation() {

        LOGGER.info("Selecciona el boton Crear Cuenta");
        page.btnCrearCuenta.click();
    }

    public void writeName(String var) {
        LOGGER.info("Escribe el Nombre");
        page.textoNombre.sendKeys(var);
    }

    public void writeApellido(String var) {
        LOGGER.info("Escribe el Apellido");
        page.textoApellido.sendKeys(var);
    }

    public void writeEmail(String var) {
        LOGGER.info("Escribe el Correo");
        page.textoCorreo.sendKeys(var);
    }

    public void writePassword(String var) {
        LOGGER.info("Escribe el Password");
        page.textoClave.sendKeys(var);
    }

}
