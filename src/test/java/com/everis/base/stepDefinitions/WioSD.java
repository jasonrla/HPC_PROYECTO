package com.everis.base.stepDefinitions;
import com.everis.base.steps.WioSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class WioSD {
    @Steps
    WioSteps wioSteps;

    @Given("Inicializando la pagina de wio")
    public void Inicializandolapaginadewio() {
        wioSteps.openWio();
    }
    @When("ingresar el {string}")
    public void ingresarEl(String txtUsuario) {
        wioSteps.ingresarelUsuario(txtUsuario);
    }
    @And("seleccionar el {string}")
    public void seleccionarel(String perfil) {
        wioSteps.selecionarelperfil(perfil);
    }
    @And("presionar el btnIngresar")
    public void presionarelbtningresar(){wioSteps.presionoelbotonIngresar();}
    @And("posicionar en MenuWio")
    public void posicionarEnMenuWio() {         // mover mouse
        wioSteps.posicionarEnMenuWio();
    }
    @And("ingresar a IntruccionOperativa")
    public void ingresarAIntruccionOperativa() {
        wioSteps.ingresaraIntruccionOperativa();
    }
    @And("posicionar en menuNuevo")
    public void posicionarenmenuNuevo() {
        wioSteps.posicionarenmenuNuevo();
    }

    @And("ingresar a NuevaInstruccionOperativa")
    public void ingresarANuevaInstruccionOperativa() {
        wioSteps.ingresarANuevaInstruccionOperativa();
    }

  // @And("ingresar el {string}")
    //  public void ingresarelCUCliente(String CUCliente) {
    //       wioSteps.ingresarelCUCliente(CUCliente);         //enter
    //}

    @And("dar clic en Continuar lista popup")
    public void darClicEnContinuarlistaPopup() {
        wioSteps.darClicEnContinuarlistaPopup();
    }

    @And("dar clic en el desplegableproducto")
    public void darClicEnElDesplegableproducto() {
        wioSteps.darClicEnElDesplegableproducto();
    }
//@And("seleccionar el {string}")                            //1
//public void seleccionarelProducto(String Producto) {          //2
  //  wioSteps.seleccionarelProducto(Producto);                   //6
//}
    @And("dar clic en el desplegableFormadeOperacion1")
    public void darcliceneldesplegableFormadeOperacion1(){
    wioSteps.darcliceneldesplegableFormadeOperacion1();
    }


    @And("seleccionar la {string}")
    public void seleccionarLa(String arg0) {
    }

    @And("dar clic en el desplegableFormadeOperacion{int}")
    public void darClicEnElDesplegableFormadeOperacion(int arg0) {
    }

    @And("dar clic en el desplegablemoneda")
    public void darClicEnElDesplegablemoneda() {
    }

    @And("ingresar a la pestaña Doc Adjuntos")
    public void ingresaralapestañaDocAdjuntos() {
    }

    @And("Pagare doc obligatorio dar check en Conforme Doc.")
    public void pagareDocObligatorioDarCheckEnConformeDoc() {
    }

    @And("Pagare doc obligatorio dar check en Firmas y Poderes")
    public void pagareDocObligatorioDarCheckEnFirmasYPoderes() {
    }

    @And("Pagare doc obligatorio dar check en Doc Digitales")
    public void pagareDocObligatorioDarCheckEnDocDigitales() {
    }

    @And("dar clic en Grabar y Enviar")
    public void darClicEnGrabarYEnviar() {
    }

    @And("presiono el boton Ingresar")
    public void presionoElBotonIngresar() {
    }
}
