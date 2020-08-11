package com.everis.base.PageObject;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://s129va1/WDC/INDEX.ASPX")
public class WioPage<Seleccione, Solicitud> extends

PageObject {
    @FindBy(id = "txtUsuario")
    public WebElementFacade txtUsuario;
    @FindBy(xpath = "//*[@id=\"ddlPerfil\"]/option[2]")
    public WebElementFacade cbxRecepcionista;
    @FindBy(xpath = "//*[@id=\"ddlPerfil\"]/option[3]")
    public WebElementFacade cbxAsistenteComercial;
    @FindBy(xpath = "//*[@id=\"ddlPerfil\"]/option[4]")
    public WebElementFacade cbxEjecutivodeNegocio;
    @FindBy(xpath = "///*[@id=\"ddlPerfil\"]/option[5]")
    public WebElementFacade cbxSupervisordeControldeCreditos;
    @FindBy(xpath = "//*[@id=\"ddlPerfil\"]/option[6]")
    public WebElementFacade cbxAsistentedeControldeCreditos;
    @FindBy(xpath = "//*[@id=\"ddlPerfil\"]/option[7]")
    public WebElementFacade cbxJefedeControldeCreditos;
    @FindBy(xpath = "//*[@id=\"ddlPerfil\"]/option[8]")
    public WebElementFacade cbxAsistentedeGestiondeProcesos;
    @FindBy(xpath = "//*[@id=\"ddlPerfil\"]/option[11]")
    public WebElementFacade cbxAsistentedeBovedaLetras;
    @FindBy(id = "btnIngresar")
    public WebElementFacade btnIngresar;
    @FindBy(xpath = "//*[@id=\"ctl00_Menu1n1\"]/table/tbody/tr/td[1]/a")
    public WebElementFacade btnMenuWio;
    @FindBy(xpath = "//*[@id=\"ctl00_Menu1n5\"]/td/table/tbody/tr/td/a")
    public WebElementFacade btnIntruccionOperativa;
    @FindBy(xpath = "//*[@id=\"ctl00_ContentPlaceHolder1_mnuNuevon0\"]/table/tbody/tr/td[1]/a")
    public WebElementFacade btnMenuNuevo;
    @FindBy(xpath = "//*[@id=\"ctl00_ContentPlaceHolder1_mnuNuevon1\"]/td/table/tbody/tr/td/a")
    public WebElementFacade btnNuevaInstruccionOperativa;
    @FindBy(id = "txtCodCliente")
    public WebElementFacade txtCUCliente;
    //enter
    @FindBy(id = "btnConfirmar")
    public WebElementFacade btnContinuar;
    @FindBy(xpath = "//*[@id=\"tbContenedor_tbpnInfoGeneral_ddlProdServ\"]/option[18]")
    public WebElementFacade cbxproductoMedianoPlazo;
    @FindBy(xpath = "//*[@id=\"tbContenedor_tbpnInfoGeneral_ddlProdServ\"]/option[20]")
    public WebElementFacade cbxproductoPagareTasaVencida;
    @FindBy(xpath = "//*[@id=\"tbContenedor_tbpnInfoGeneral_ddlProdServ\"]/option[6]")
    public WebElementFacade cbxproductoDescuentodeLetras;
    @FindBy(xpath = "//*[@id=\"tbContenedor_tbpnInfoGeneral_ddlProdServ\"]/option[7]")
    public WebElementFacade cbxproductoDescuentoElectrónicodeFacturas;
    @FindBy(xpath = "//*[@id=\"tbContenedor_tbpnInfoGeneral_ddlProdServ\"]/option[8]")
    public WebElementFacade cbxproductoFactoringElectrónicodeFacturas;
    @FindBy(xpath = "//*[@id=\"tbContenedor_tbpnInfoGeneral_ddlProdServ\"]/option[9]")
    public WebElementFacade cbxproductoFactoringFísicodeFacturas;
    //Forma de operacion 1
    //Mediano Plazo
    @FindBy(xpath = "//*[@id=\"tbContenedor_tbpnInfoGeneral_ddlFormaOper\"]/option[1]")
    public WebElementFacade cbxMPSeleccione;
    @FindBy(xpath = "//*[@id=\"tbContenedor_tbpnInfoGeneral_ddlFormaOper\"]/option[2]")
    public WebElementFacade cbxMedianoPlazoSolicitud;
    @FindBy(xpath = "//*[@id=\"tbContenedor_tbpnInfoGeneral_ddlFormaOper\"]/option[3]")
    public WebElementFacade cbxMedianoPlazoModificación;
    @FindBy(xpath = "//*[@id=\"tbContenedor_tbpnInfoGeneral_ddlFormaOper\"]/option[4]")
    public WebElementFacade cbxMedianoPlazoPrórroga;
    @FindBy(xpath = "//*[@id=\"tbContenedor_tbpnInfoGeneral_ddlFormaOper\"]/option[5]")
    public WebElementFacade cbxMedianoPlazoRenovación;
    //Pagare Tasa Vencida
    @FindBy(xpath = "//*[@id=\"tbContenedor_tbpnInfoGeneral_ddlFormaOper\"]/option[1]")
    public WebElementFacade cbxTVSeleccione;
    @FindBy(xpath = "//*[@id=\"tbContenedor_tbpnInfoGeneral_ddlFormaOper\"]/option[2]")
    public WebElementFacade cbxPagareTVencSolicitud;
    @FindBy(xpath = "//*[@id=\"tbContenedor_tbpnInfoGeneral_ddlFormaOper\"]/option[3]")
    public WebElementFacade cbxPagareTVencRenovación;
    @FindBy(xpath = "//*[@id=\"tbContenedor_tbpnInfoGeneral_ddlFormaOper\"]/option[4]")
    public WebElementFacade cbxPagareTVencModificación;
    @FindBy(xpath = "//*[@id=\"tbContenedor_tbpnInfoGeneral_ddlFormaOper\"]/option[5]")
    public WebElementFacade cbxPagareTVencPrórroga;
    //Forma de operacion 2
    @FindBy(xpath = "//*[@id=\"tbContenedor_tbpnInfoGeneral_ddlReactiva\"]/option[1]")
    public WebElementFacade cbxSeleccionNormal;
    @FindBy(xpath = "//*[@id=\"tbContenedor_tbpnInfoGeneral_ddlReactiva\"]/option[2]")
    public WebElementFacade cbxCrecer;
    @FindBy(xpath = "//*[@id=\"tbContenedor_tbpnInfoGeneral_ddlReactiva\"]/option[3]")
    public WebElementFacade cbxReactiva;
    @FindBy(xpath = "//*[@id=\"tbContenedor_tbpnInfoGeneral_ddlReactiva\"]/option[4]")
    public WebElementFacade cbxReactiva2;
    @FindBy(xpath = "//*[@id=\"tbContenedor_tbpnInfoGeneral_ddlMoneda\"]/option[2]")
    public WebElementFacade cbxMonedaSoles;
    @FindBy(xpath = "//*[@id=\"tbContenedor_tbpnInfoGeneral_ddlMoneda\"]/option[3]")
    public WebElementFacade cbxMonedaDolares;
    @FindBy(id = "tbContenedor_tbpnInfoGeneral_txtImporte")
    public WebElementFacade txtImporte;
    @FindBy(id = "btnEnviarProc")
    public WebElementFacade btnGrabaryEnviar;
}

