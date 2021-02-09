package com.everis.base.steps;

import com.everis.base.PageObject.DesembolsoPage;
import com.everis.base.utils.WebDriverUtils;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.asm.SpringAsmInfo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;


public class DesembolsoSteps {
    private static final Logger logger = LoggerFactory.getLogger(DesembolsoSteps.class);
    private DesembolsoPage desembolsoPage;
    public static WebDriver driver;
    private String parentWinHandle;

    public void pause(Integer seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    @Step

    public void cliente() { }

    public void tipoProducto() {  }

    //LOGIN
    public void openSDA() {
        desembolsoPage.open();
        logger.info("Ingreso al SDA");
    }

    public void RegistroLogin(String user) {
        desembolsoPage.txtUserLogin.sendKeys(user);
        logger.info("ingreso de registro");
    }

    public void ContraLogin(String password) {
        desembolsoPage.txtPassLogin.sendKeys(password);
        logger.info("ingreso de contrasena");
    }
    public void seleccionarAmbienteDePrueba(String Ambiente) {
        desembolsoPage.cbAmbienteLogin.selectByVisibleText(Ambiente);
        logger.info("Selecionar ambiente");
    }

    public void AceptarLogin() {
        desembolsoPage.btnAceptarLogin.click();
        logger.info("clic boton aceptar login");
    }

    //INGRESAR A GRUPO
    public void clickGrupo(String Grupo) {

        switch (Grupo)
        {
            case "Hipotecario":
                desembolsoPage.txtHipotecario.click(); logger.info("click en grupo Hipotecario");
                break;
            case "PPGH":
                desembolsoPage.txtPPGH.click(); logger.info("click en grupo PPGH");
                break;
            case "Personal":
                desembolsoPage.txtPersonal.click(); logger.info("click en grupo Personal");
                break;
            case "Vehicular":
                desembolsoPage.txtVehicular.click(); logger.info("click en grupo Vehicular");
                break;
            case "Refinanciado":
                desembolsoPage.txtRefinanciado.click(); logger.info("click en grupo Refinanciado");
                break;
        }
        pause(2);

    }

    public void clickPestanaOperaciones() {
        desembolsoPage.opcOperaciones.click(); logger.info("click en Operaciones");
    }

    public void clickOpcionCreditos() {
        desembolsoPage.opcCreditos.click(); logger.info("click en Creditos");
    }

    public void clickSubOpcionIngreso() {
        desembolsoPage.opcIngreso.click(); logger.info("click en Ingreso");
    }

    public void clickBtnNuevo() {
        pause(5);
        getDriver().switchTo().frame("frmcontent");
        desembolsoPage.txtFechaProceso.click();
        desembolsoPage.btnNuevo.click(); logger.info("click en Nuevo");
    }



    
    
    //------------------------------------------------------------------------------------------------------------------
    /*
    @Step
    public void cerrarWeb(){
        pause(7);
        Alert alert= desembolsoPage.getDriver().switchTo().alert();
        alert.accept();
        logger.info("Seleccionar: ACEPTAR");
    }
*/
    public void seleccionoRegistro() {
        //pause(2);
        //pause(5);
        logger.info("presiono select registro");
        String handle = WebDriverUtils.getHandle(desembolsoPage.getDriver(), parentWinHandle);
        getDriver().switchTo().window(handle);
        ///desembolsoPage.getDriver().switchTo().frame(desembolsoPage.ifrcabecera.getElement()); //name del iframe  "navig"
        Actions builder = new Actions(desembolsoPage.getDriver());
        builder.moveToElement(desembolsoPage.btnRegistro).perform();
        //pause(5);
        pause(2);
    }
      public void seleccionoCliente() {
        logger.info("selecciono cliente");
        getDriver().switchTo().defaultContent();
       // desembolsoPage.getDriver().switchTo().frame(desembolsoPage.ifrlogin.getElement());
          desembolsoPage.getDriver().switchTo().frame("space");   //identificado del 2do iframe
        Actions builder = new Actions(desembolsoPage.getDriver());         // accion de moverse
        builder.moveToElement(desembolsoPage.btnCliente).perform();   //   mover hacia el la 1ra opcion del desplegable "Cliente"
        pause(5);
    }
    public void seleccionoNuevo() {
        logger.info("selecciono nuevo");
        pause(5);
        desembolsoPage.btnNuevo.click();
      pause(3);
    }


    //COMBO BOX TIPO DE DOCUMENTO - DNI

    public void seleccionarTipoDeDocumento(String doc) {
        logger.info("selecciona el tipo documento");  //
         desembolsoPage.cbtipoDoc.selectByVisibleText(doc); //
         pause(6);
    }


    public void ingresoElNumeroDeDoc(String NumDoc) {
        desembolsoPage.txtNumDoc.sendKeys(NumDoc);
        logger.info("ingreso de el numero de doc "+NumDoc);
        pause(2);
    }

    public void doyClickABuscarBaseIBK() {
        desembolsoPage.btnBuscarBaseIBK.click();
        logger.info("Click BuscarBaseIBK");
        pause(5);
    }
//CODIGO HELLEN
    public void ingresoElNumeroDeDependientes(String Dependi) {
        desembolsoPage.txtDependientes.sendKeys(Dependi);
        logger.info("ingreso de el numero de dependientes "+Dependi);
        pause(3);
    }

    public void ingresoElNumeroDeRuc(String NumRuc) {
        desembolsoPage.txtRuc.sendKeys(NumRuc);
        logger.info("ingreso de el numero de ruc "+NumRuc);
        pause(3);

    }
    public void ingresoElCorreo(String Correo){
        desembolsoPage.txtMail.sendKeys(Correo);
        logger.info("ingreso de Correo "+Correo);
        pause(3);
    }
    public void ingresoElFechaCrediticia(String Crediticia) {
        desembolsoPage.txtFechaCrediticia.sendKeys(Crediticia);
        logger.info("ingreso de Fecha Crediticia "+Crediticia);
        pause(3);
    }


    public void seleccionarNivel(String Nivel) {
        logger.info("selecciona el nivel");
        desembolsoPage.cbnivel.selectByVisibleText(Nivel);
        pause(2);
    }

    public void seleccionarLaProfesion(String Profesion) {
        logger.info("selecciona la profesion");
        desembolsoPage.cbprofesion.selectByVisibleText(Profesion);
        pause(2);

    }
    public void ingresoDelTelediscado(String Telediscado){
        logger.info("selecciona el Telesdicado");
        desembolsoPage.cbtipotele.selectByVisibleText(Telediscado);
        pause(2);
    }

    public void ingresoElNumeroCelular(String Celular) {
        desembolsoPage.txtcelular.sendKeys(Celular);
        logger.info("ingreso de Fecha Crediticia "+Celular);
        pause(3);
    }

    String paginaActual;
    String cuadroDeDialogo;

    public void seleccionarAgregarDireccion() {
        desembolsoPage.btnDireccion.click();
        logger.info("Click Botton de Agregar Direccion");
        for(String e: desembolsoPage.getDriver().getWindowHandles()){
            logger.info("Pagina -> " + e);
            desembolsoPage.getDriver().switchTo().window(e);
        }

        // desde aqui estas en el cuadro de dialogo
       // desembolsoPage.tipoVia.selectByVisibleText("Avenida");
        //desembolsoPage.campoDomicilio.sendKeys("HOLAAAAAAAAAAAAAAAAA");
       // pause(5);

//seleccionar direccion


    }

    public void seleccionarAgregarCobranza() {
        desembolsoPage.btnCobranza.click();
        logger.info("Click Botton Cobranza");
        pause(5);

    }
    public void seleccionarAgregarDomicilio(){
        desembolsoPage.btnDomicilio.click();
        logger.info("Click Botton Domicilio");
        pause(5);
    }


    //Codigo hellen 1210

    public void ingresoElNumeroDeLote(String Numero ) {
        desembolsoPage.txtnumero.sendKeys(Numero);
        logger.info("ingreso de el numero de Lote  "+Numero);
        pause(3);
    }
    public void ingresoElLote(String Lote) {
        desembolsoPage.txtlote.sendKeys(Lote);
        logger.info("ingreso el Lote  "+Lote);
        pause(3);
    }
    public void ingresoLaManzana(String Manzana) {
        desembolsoPage.txtmanzana.sendKeys(Manzana);
        logger.info("ingreso la manzana  "+Manzana);
        pause(3);
    }
    public void ingresoElInterior(String Interior) {
        desembolsoPage.txtinterior.sendKeys(Interior);
        logger.info("ingreso el interior  "+Interior);
        pause(3);
    }
    public void ingresoelpiso(String Piso) {
      desembolsoPage.txtPiso.sendKeys(Piso);
        logger.info("ingreso el Piso  "+Piso);
        pause(3);

    }
    public void ingresoDeLaUrbanizacionZona(String Urbanizacion) {
        desembolsoPage.txtUrbZona.sendKeys(Urbanizacion);
        logger.info("ingreso la urbanizacion "+Urbanizacion);
        pause(3);

    }
    public void ingresoDeReferencias(String Refe) {
        desembolsoPage.txtReferencia.sendKeys(Refe);
        logger.info("ingreso la referencia "+Refe);
        pause(3);
    }

    public void ingresoTelefonoFijo(String Fijo) {
        desembolsoPage.txtTelefFijo.sendKeys(Fijo);
        logger.info("ingreso el telefono  "+Fijo);
        pause(3);
    }
    public void ingresoTelefonoFijoOpcional(String TeleOpc) {
        desembolsoPage.txtTelefOpcional.sendKeys(TeleOpc);
    }


    public void seleccionarDepartamento(String Departamento) {
        logger.info("selecciona departamento");
        desembolsoPage.txtDepartamento.selectByVisibleText(Departamento);
        pause(2);

    }
    public void seleccionarLaProvincia(String Provincia) {
        logger.info("selecciona la provincia");
        desembolsoPage.txtProvincia.selectByVisibleText(Provincia);
        pause(2);

    }

    public void seleccionarLaDistrito(String Distrito) {
        logger.info("selecciona el distrito");
        desembolsoPage.txtDistrito.selectByVisibleText(Distrito);
        pause(2);
    }

    public void ingresarElTipoDeVivienda(String TipoVivienda) {
        logger.info("selecciona el tipo de vivienda");
        desembolsoPage.txtTipoVivienda.selectByVisibleText(TipoVivienda);
        pause(2);
    }
    public void ingresoDeViveDesdeA(String VivedesdeA) {
        desembolsoPage.txtViveA.sendKeys(VivedesdeA);
        logger.info("ingreso el Vive desde A  "+VivedesdeA);
        pause(3);


    }
    public void ingresoDeViveDesdeB(String VivedesdeB) {
        desembolsoPage.txtViveB.sendKeys(VivedesdeB);
        logger.info("ingreso el Vive desde B  "+VivedesdeB);
        pause(5);

    }
    public void seleccionarAceptarDatos() {
        desembolsoPage.btnAceptarDatos.click();
        logger.info("Click aceptar datos");
        pause(5);
    }


    public void seleccionarLaDireccion(String Direccion) {
        logger.info("seleccionar la Direccion");
        desembolsoPage.cnbDir.selectByVisibleText(Direccion);
        pause(5);

    }

    public void ingresarLaDireccion(String DireccionExacta) {
        logger.info("Ingresar la direccion Exacta");
        desembolsoPage.txtDirec.sendKeys(DireccionExacta);
        pause(5);
    }
    public void seleccionarGrabar() {
        for(String e: desembolsoPage.getDriver().getWindowHandles()){
            logger.info("Pagina -> " + e);
            desembolsoPage.getDriver().switchTo().window(e);
        }
        desembolsoPage.BtnGrbar.click();
        logger.info("Click en grabas registo de cliente");
        pause(8);
    }


    public void clickOpcConsultas() {
        desembolsoPage.opcConsultas.click();
        logger.info("Click opción Consultas");
    }

    public void clickConsultaDelCredito() {
        desembolsoPage.opcConsultaCredito.click();
        logger.info("Click opción Consulta del Credito");
        cambioDeFrame();
    }

    public void cambioDeFrame(){
        pause(5);
        getDriver().switchTo().frame("frmcontent");
        logger.info("Cambio de frame: frmcontent");
    }
    public void ingresarNroCredito(String nroCredito) { //throws FindFailed

        desembolsoPage.txtNroCredito.click();
        desembolsoPage.txtNroCredito.sendKeys(nroCredito);
        logger.info("Ingresar nro. de Credito");

        /*SIKULI--------------------
        //Screen s = new Screen();
        //s.click("src\\test\\resources\\img\\campoNroCredito.PNG");
        //s.type("30000");
        desembolsoPage.txtNroCredito.click();
        desembolsoPage.txtNroCredito.sendKeys(nroCredito);
        //desembolsoPage.txtNroCredito.sendKeys("30000");
        logger.info("Ingresar nro. de Credito");
        //pause(5);
        //desembolsoPage.txtNroCredito.sendKeys(Keys.ENTER);
        //logger.info("Enter");
        desembolsoPage.pestanaCronograma.click();
        logger.info("Click en Pestaña Cronogramas");

        Screen hpc = new Screen();
        hpc.keyDown(Key.ALT);
        hpc.type(Key.F1);
        hpc.keyUp(Key.ALT);
        hpc.dragDrop("src\\test\\resources\\img\\esquinaSuperior.PNG","src\\test\\resources\\img\\esquinaInferior.PNG");
        hpc.click("src\\test\\resources\\img\\capturaSnagit.PNG");
        hpc.click("src\\test\\resources\\img\\winLogo.PNG");
        pause(5);
        hpc.type("winword");
        hpc.type(Key.ENTER);
        pause(5);
        hpc.type("Evidencias - 30000" + Key.ENTER);
        hpc.type("Cronograma antes" + Key.ENTER);
        hpc.click("src\\test\\resources\\img\\iconoPegar.PNG");
        hpc.type(Key.ENTER);

        hpc.click("src\\test\\resources\\img\\iconoGuardar.PNG");
        hpc.click("src\\test\\resources\\img\\iconoEquipo.PNG");
        hpc.click("src\\test\\resources\\img\\iconoExaminar.PNG");
        hpc.click("src\\test\\resources\\img\\iconoEscritorio.PNG");
        hpc.click("src\\test\\resources\\img\\btnGuardar.PNG");

        hpc.keyDown(Key.ALT);
        hpc.type(Key.F4);
        hpc.keyUp(Key.ALT);
        /*
         Screen s = new Screen();
        //s.click("C:\\Users\\xt9103\\Desktop\\movimientos.PNG");
        s.click("src\\test\\resources\\img\\winLogo.PNG");
        pause(5);
        s.type("winword");
        s.type(Key.ENTER);
        //Screen s1 = new Screen();
        //s1.click("C:\\Users\\xt9103\\Desktop\\Word.PNG");
        pause(5);
        s.type("holaa mundo xD");
        s.click("src\\test\\resources\\img\\iexplorer.PNG");
        Screen s2 = new Screen();
        s2.click("src\\test\\resources\\img\\wordLogo.PNG");
        //s2.type("c", Key.C_CTRL);

        s2.keyDown(Key.ALT);
        s2.type(Key.F1);
        s2.keyUp(Key.ALT);

        s2.click();
        pause(5);
        s2.click("src\\test\\resources\\img\\wordLogo.PNG");
        Screen s3 = new Screen();
        s3.click("src\\test\\resources\\img\\hola.PNG");

        s2.keyDown(Key.CTRL);
        s2.type("V");
        s2.keyUp(Key.CTRL);

        Match as = s.find("src\\test\\resources\\img\\hola.PNG");

        if (as.equals("src\\test\\resources\\img\\hola.PNG")){

        }


//probando condiciones
       /*
        Screen sa = new Screen();
        sa.click("src\\test\\resources\\img\\winLogo.PNG");
        pause(2);
        sa.type("winword");
        sa.type(Key.ENTER);
        sa.click("src\\test\\resources\\img\\iexplorer.PNG");

        pause(5);
        Screen sa2 = new Screen();
        sa2.find("src\\test\\resources\\img\\wordLogo.PNG");

        if (sa2.equals(1)){
            sa.click("src\\test\\resources\\img\\wordLogo.PNG");
            pause(2);
            sa.type("hola Word");
        }
        else{
            sa.click("src\\test\\resources\\img\\winLogo.PNG");
            pause(5);
            sa.type("excel");
            sa.type(Key.ENTER);
        }
*/

        /*s2.type("V", KeyModifier.CTRL);
        s2.type(Key.ALT + Key.F1);
        s2.click();
        s.click("C:\\Users\\xt9103\\Desktop\\iexplorer.PNG");

        s2.type("V", KeyModifier.CTRL);]*/

        //SIKULI--------------------*/
    }


    public void unCredito(){}

    public void seRequiereHacerUnPagoDeCuotas(String nroCuotas){}

    //Click en operaciones

    public void clickEnPagos(){
        desembolsoPage.opcPagos.click(); logger.info("Click en Pagos");
    }

    public void clickEnPagoDeCuotas(){
        desembolsoPage.opcPagoCuotas.click(); logger.info("Click en Pago de Cuotas");
        cambioDeFrame();
    }

    //click boton nuevo

    public void ingresarCredito(String nroCredito) { //throws FindFailed
        desembolsoPage.txtNroCredito.click();
        desembolsoPage.txtNroCredito.sendKeys(nroCredito);
        desembolsoPage.txtNroCredito.sendKeys(Keys.ENTER);
        logger.info("Ingresar nro. de Credito");
    }

    public void seleccionarLasCuotas(String cantCuotas) {

        int nroCuotas = Integer.parseInt(cantCuotas);
        nroCuotas = nroCuotas+1 ;


        switch (nroCuotas) {
            case 1:
                desembolsoPage.registro1.click();
                break;
            case 2:
                desembolsoPage.registro1.click();
                desembolsoPage.registro2.click();
                break;
            case 3:
                desembolsoPage.registro1.click();
                desembolsoPage.registro2.click();
                desembolsoPage.registro3.click();
                break;
        }


        for(int i =2;i<=nroCuotas;i++){
            if(i<=9){

                String NroChecks = "dgLista_ctl0"+i+"_chkSeleccion";
                //Element CantChecks =  new Element("id", NroChecks);
                this.efa.executeAction(Action.Click, CantChecks);
                logger.info("se ejecuto >9: " + NroChecks);
                //this.efa.executeAction(Action.Click, CantChecks);

            }
            else if(i>=10){
                String NroChecks = "dgLista_ctl"+i+"_chkSeleccion";
                //Element CantChecks =  new Element("id", NroChecks);
                this.efa.executeAction(Action.Click, CantChecks);
                logger.info("se ejecuto >9: " + NroChecks);
            }
        }
    }

    public void guardarOperacion(){

    }

    public void validarRegistroEnLaGrilla(){

    }
}



