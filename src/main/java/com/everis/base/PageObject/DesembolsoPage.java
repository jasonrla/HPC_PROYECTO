package com.everis.base.PageObject;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

@DefaultUrl ("http://intranetib/sda/")
public class DesembolsoPage extends PageObject {

    //OPCIONES GENERICAS

    @FindBy(id = "fpAnimswapImgFP1") //tblBarra_lnkNuevo
    public WebElementFacade btnNuevo;

    //@FindBy(id = "tblBarra_lnkNuevo")
    //public WebElementFacade btnNuevo;

    @FindBy(id = "tblBarra_lnkAbrir")
    public WebElementFacade btnAbrir;

    @FindBy(id = "tblBarra_lnkEliminar")
    public WebElementFacade btnEliminar;

    //@FindBy(id = "tblBarra_lnkCerrar")
    //public WebElementFacade btnSalir;

    @FindBy(xpath = "//img[@id='fpAnimswapImgFP6']")
    public WebElementFacade btnSalir;


    @FindBy(id = "lblFechaProceso")
    public WebElementFacade txtFechaProceso;

    @FindBy(xpath = "//*[@id=\"frmCabecera\"]")
    public WebElementFacade ifrCabecera;

    @FindBy(xpath = "//*[@id=\"frmcontent\"]")
    public WebElementFacade ifrContent;

    @FindBy(xpath = "//*[@id=\"frmMain\"]")
    public WebElementFacade ifrmMain;


    @FindBy(xpath = "//td[@id='Contenedor']/div/table/tbody/tr[1]/td/div")
    public WebElementFacade grilla;

    //LOGIN

    @FindBy(id = "inpuser")
    public WebElementFacade txtUserLogin;

    @FindBy(id = "inp_clave")
    public WebElementFacade txtPassLogin;

    @FindBy(name = "selambiente")
    public WebElementFacade cbAmbienteLogin;

    @FindBy(id = "Aceptar")
    public WebElementFacade btnAceptarLogin;


    //GRUPOS
    @FindBy(xpath="/html/body/table[1]/tbody/tr[4]/td[1]/table/tbody/tr[6]/td/p[1]/a")
    public WebElementFacade txtHipotecario;

    @FindBy(xpath="/html/body/table[1]/tbody/tr[4]/td[1]/table/tbody/tr[6]/td/p[2]/a")
    public WebElementFacade txtPPGH;

    @FindBy(xpath="/html/body/table[1]/tbody/tr[4]/td[1]/table/tbody/tr[6]/td/p[3]/a")
    public WebElementFacade txtPersonal;

    @FindBy(xpath="/html/body/table[1]/tbody/tr[4]/td[1]/table/tbody/tr[6]/td/p[4]/a")
    public WebElementFacade txtVehicular;

    @FindBy(xpath="/html/body/table[1]/tbody/tr[4]/td[1]/table/tbody/tr[6]/td/p[5]/a")
    public WebElementFacade txtRefinanciado;

    //PESTANAS----------------------------------------------------------------------------------------------------------
    @FindBy(xpath="//*[@id=\"WucMenuHpc_lblMenu\"]/table/tbody/tr/td[1]/a")
    public WebElementFacade opcOperaciones;

    @FindBy(xpath="//*[@id=\'WucMenuHpc_lblMenu\']/table/tbody/tr/td[2]/a")
    public WebElementFacade opcSimuladores;

    @FindBy(xpath="//span[@id='WucMenuHpc_lblMenu']/table/tbody/tr/td[3]/a")
    public WebElementFacade opcConsultas;

    @FindBy(xpath = "//div[@id='061']/a[1]")
    public WebElementFacade subOpcConsultaDelCredito;

    @FindBy(xpath = "//input[@id='ucBusquedaCredito_txtCodigo']")
    public WebElementFacade txtNroCredito;

    @FindBy(xpath = "//table[@id='tdContent']/tbody/tr[1]/td[2]/table/tbody/tr/td[4]/div")
    public WebElementFacade pestanaCronograma;

    @FindBy(xpath="//*[@id=\"WucMenuHpc_lblMenu\"]/table/tbody/tr/td[4]/a")
    public WebElementFacade opcReportes;


    //OPCIONES - PESTAÑA OPERACIONES--------------------------------------------------------------------------------

    @FindBy(xpath="//*[@id=\"021\"]/a[2]")
    public WebElementFacade opcCreditos;

    @FindBy(xpath="//*[@id=\"021\"]/a[3]")
    public WebElementFacade opcPagos;

    @FindBy(xpath="//*[@id=\"021\"]/a[4]")
    public WebElementFacade opcPagosCFV;

    @FindBy(xpath="//*[@id=\"021\"]/a[5]")
    public WebElementFacade opcAnulaciones;


    //SUB OPCIONES - PESTAÑA CONSULTAS----------------------------------------------------------------------------------

    @FindBy(xpath="//*[@id=\"061\"]/a[1]")
    public WebElementFacade opcConsultaCredito;



    //SUB OPCIONES - OPCION CREDITOS------------------------------------------------------------------------------------

    @FindBy(xpath="//*[@id=\"021_0066\"]/a[1]")
    public WebElementFacade opcIngreso;

    //SUB OPCIONES - OPCION PAGOS---------------------------------------------------------------------------------------

    @FindBy(xpath="//*[@id=\"021_0069\"]/a[3]")
    public WebElementFacade opcPagoCuotas;

    @FindBy(xpath="//*[@id=\"021_0069\"]/a[1]")
    public WebElementFacade opcPrepago;

    @FindBy(xpath="//*[@id=\"021_0069\"]/a[2]")
    public WebElementFacade opcCancelacion;


    @FindBy(id = "dgLista_ctl02_chkSeleccion")
    public WebElementFacade registro1;

    @FindBy(id="dgLista_ctl03_chkSeleccion")
    public WebElementFacade registro2;

    @FindBy(id="dgLista_ctl04_chkSeleccion")
    public WebElementFacade registro3;







    //OTROS
    //@FindBy(xpath = "/html/frameset/frame[1]")
    //public WebElementFacade ifrcabecera;

  //  @FindBy(xpath = "/html/frameset/frame[2]")
    //public WebElementFacade ifrlogin;

    @FindBy(name = "space")
    public WebElementFacade ifrlogin;

    @FindBy(xpath = "/html/body/div/div[1]")
    public WebElementFacade btnRegistro;

    @FindBy(xpath = "/html/body/div[1]/div[1]")
    public WebElementFacade btnCliente;

    @FindBy(xpath = "/html/body/div[2]")
    public WebElementFacade divNuevo;

    //@FindBy(xpath = "/html/body/div[2]/div[1]")
    //public WebElementFacade btnNuevo;

    //combo box TIPO DE DOCUMENTO
    //@FindBy(xpath = "/html/body/form/div[3]/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div[2]/div/div/div/table/tbody/tr[2]/td[1]/span/select")  //captura de Tipo de
    @FindBy(id = "ctl00_cphContenido_cboTipoDocNat")
    public WebElementFacade cbtipoDoc;

    @FindBy(xpath = "//*[@id=\"ctl00_cphContenido_cboTipoDocNat\"]/option[2]")
    public WebElementFacade cbdni;

    //ingresa el documento

    @FindBy(id = "ctl00_cphContenido_txtDocNat")
    public WebElementFacade txtNumDoc;

    @FindBy(id = "ctl00_cphContenido_BtnRNTClienteNat")//buscar base IBK
    public WebElementFacade btnBuscarBaseIBK;



    //@FindBy(id = "ctl00_cphContenido_txtApellidoPat")//Ingresa apellido paterno
    public WebElementFacade txtApellidoPaterno;

    //@FindBy(id = "ctl00_cphContenido_txtApellidoMat")//Ingresa apellido materno
    public WebElementFacade txtApellidoMaterno;

    // @FindBy(id = "ctl00_cphContenido_txtNombre1")//Ingresar Nombre1
    public WebElementFacade txtNombre1;

    //  @FindBy(id = " ctl00_cphContenido_txtNombre2 ")//Ingresar Nombre2
    public WebElementFacade txtNombre2;

    //  @FindBy(id = " ctl00_cphContenido_TxtFechaNac")//Ingresar Fecha de Nacimiento
    public WebElementFacade txtFechaNacimiento;


    // @FindBy(xpath= "//*[@id="ctl00_cphContenido_cboNivelEducativo"]")  //captura de Tipo de Niveleducativo
    public WebElementFacade cbNiveleduc ;

    // @FindBy(xpath= "//*[@id="ctl00_cphContenido_cboNivelEducativo"]/option[4]")  //selecciona nivel superior
    public WebElementFacade cbNivelSuperior ;


    //  @FindBy(xpath= "//*[@id="ctl00_cphContenido_cboProfesion"]")  //captura de Tipo de profesion
    public WebElementFacade cbtipoProf ;

    // @FindBy(xpath= "//*[@id="ctl00_cphContenido_cboProfesion"]/option[3]")  //captura de Tipo de profesion
    public WebElementFacade cbtipoMedico;


    @FindBy(id = "ctl00_cphContenido_TxtDependientes")//Ingresar numero dependientes
    public WebElementFacade txtDependientes ;

    @FindBy(id = "ctl00_cphContenido_txtNatRuc")//Ingresar el ruc
    public WebElementFacade txtRuc ;

    @FindBy(id ="ctl00_cphContenido_cboNivelEducativo")//Ingresar el ruc
    public WebElementFacade cbnivel ;

    @FindBy(id ="ctl00_cphContenido_cboProfesion")//Ingresar el ruc
    public WebElementFacade cbprofesion ;

    //@FindBy(id = "ctl00_cphContenido_txtCelular")//Ingresar el celular
    public WebElementFacade txtCelular ;

     @FindBy(id = "ctl00_cphContenido_txtEmail")//Ingresar el mail
    public WebElementFacade txtMail ;

     @FindBy(id="ctl00_cphContenido_txtAntiguedadCrediticia")//Ingresar Fecha Crediticia
    public WebElementFacade txtFechaCrediticia ;

    @FindBy(id= "ctl00_cphContenido_cboTelediscado")  //captura de Tipo de telediscado
    public WebElementFacade cbtipotele ;
    @FindBy(id= "ctl00_cphContenido_txtCelular")  //captura del celular
    public WebElementFacade txtcelular ;


    @FindBy(id="ctl00_cphContenido_BtnDireccion")
    public WebElementFacade btnDireccion ;


    @FindBy(id="ChkTipoDir_0")
    public WebElementFacade btnCobranza;

    @FindBy(id="ChkTipoDir_1")
    public WebElementFacade btnDomicilio;

    @FindBy(xpath="/html/body/form/div[3]/table[2]/tbody/tr/td/div/div/table[1]/tbody/tr[2]/td[2]/input")
    public WebElementFacade campoDomicilio;

    @FindBy(xpath = "/html/body/form/div[3]/table[2]/tbody/tr/td/div/div/table[1]/tbody/tr[2]/td[1]/select")
    public WebElementFacade tipoVia;

    @FindBy(id= "UcDireccion1_txtNroDireccion" )
    public WebElementFacade txtnumero;

    @FindBy(id = "UcDireccion1_txtNroLote" )
    public WebElementFacade txtlote;

    @FindBy(id ="UcDireccion1_txtManzana" )
    public WebElementFacade txtmanzana;

    @FindBy(id ="UcDireccion1_txtInterior" )
    public WebElementFacade txtinterior;

    @FindBy(id ="UcDireccion1_txtPiso")
    public WebElementFacade txtPiso;


    @FindBy(id ="UcDireccion1_txtUrbZona")
    public WebElementFacade txtUrbZona;

    @FindBy(id ="UcDireccion1_txtReferencia")
    public WebElementFacade txtReferencia;

    @FindBy(id ="txtTelefono")
    public WebElementFacade txtTelefFijo;

    @FindBy(id ="txtTelefono1")
    public WebElementFacade txtTelefOpcional;


    @FindBy(id ="UcDireccion1_UcUbigeo1_ddlDepartamento")
    public WebElementFacade txtDepartamento;

    @FindBy(id ="UcDireccion1_UcUbigeo1_ddlProvincia")
    public WebElementFacade txtProvincia;


    @FindBy(id ="UcDireccion1_UcUbigeo1_ddlDistrito")
    public WebElementFacade txtDistrito;

    @FindBy(id ="cboTipoVivienda")
    public WebElementFacade txtTipoVivienda;

    @FindBy(id ="txtViveDesdeMes")
    public WebElementFacade txtViveA ;

    @FindBy(id ="txtViveDesde")
    public WebElementFacade txtViveB ;

    @FindBy(xpath ="//*[@id=\"BtnOK\"]")
    public WebElementFacade btnAceptarDatos ;

    @FindBy(xpath ="//*[@id=\"UcDireccion1_cboDireccion\"]")
    public WebElementFacade cnbDir ;

    @FindBy(xpath="/html/body/form/div[3]/table[2]/tbody/tr/td/div/div/table[1]/tbody/tr[2]/td[2]/input")
    public WebElementFacade txtDirec ;

    @FindBy(xpath="/html/body/form/div[3]/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/table[2]/tbody/tr/td[2]/span[1]/input")
    public WebElementFacade BtnGrbar;


}
