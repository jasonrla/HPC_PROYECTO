package com.everis.base.steps;

import com.everis.base.PageObject.WioPage;
import org.slf4j.LoggerFactory;

import java.util.logging.Logger;

public class WioSteps {
    private static final Logger
            logger = (Logger) LoggerFactory.getLogger(WioSteps.class);

    private WioPage wioPage;

    public void openWio() {
        logger.info("Inicializando la pagina de wio");
        wioPage.open();
    }

    public void ingresarelUsuario(String Usuario) {
        logger.info("ingresar el Usuario");
        wioPage.txtUsuario.sendKeys(Usuario);
    }

    public void selecionarelperfil(String perfil) {
        logger.info("selecionar el perfil");
        wioPage.cbxRecepcionista.sendKeys(perfil);
    }

    public void presionoelbotonIngresar() {
        logger.info("presiono el boton Ingresar");
        wioPage.btnIngresar.click();
    }

    public void posicionarseEnMenuwio() {         // mover mouse
        logger.info("posicionarse en Menuwio");
        wioPage.moveTo("MenuWio"); //
          wioPage.MenuWio.click();
    }

    public void ingresaraIntruccionOperativa() {
        logger.info("ingresar a IntruccionOperativa");
        wioPage.IntruccionOperativa.click();
    }
    public void posicionarenmenuNuevo() {
        logger.info("posicionar en menuNuevo");
        wioPage.menuNuevo.click();
    }
    public void ingresarANuevaInstruccionOperativa(){
            logger.info("ingresar a NuevaInstruccionOperativa");
            wioPage.NuevaInstruccionOperativa.click();
    }
    public void ingresarelCUCliente(String CUCliente){
            logger.info("ingresar el CUCliente");
            wioPage.CUCliente.sendKeys(CUCliente);
            wioPage.enter("CUCliente");             //enter
    }

      public void darClicEnContinuarlistaPopup(){
        logger.info("dar clic en Continuar lista popup");
        wioPage.Continuar.click();
    }
    public void darClicEnElDesplegableproducto(){
        logger.info("dar Clic en el Desplegableproducto");
        wioPage.desplegableproducto.click();
    }
    public void seleccionarelProducto(String Producto){   //3
        logger.info("seleccionar el Producto");             //4
        wioPage.Producto.click();                //5
    }
    public void darcliceneldesplegableFormadeOperacion1(){
        logger.info("dar clic en el desplegableFormadeOperacion1");
        wioPage.desplegableFormadeOperacion1.click();
    }


    //    public void selecionarelperfil(String perfil) {
    //        logger.info("selecionar el perfil");
    //        wioPage.perfil.sendKeys(perfil);
}




