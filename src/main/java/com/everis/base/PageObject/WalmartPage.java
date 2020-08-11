package com.everis.base.PageObject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

    @DefaultUrl("https://www.walmart.com/")
    public class WalmartPage extends PageObject {

        @FindBy(id = "global-search-input")
        public WebElementFacade txtBusqueda;  //WebElemen el senke
        @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/section/div[2]/div/div[3]/div[2]/div/form/button[3]/span/img")
        public WebElementFacade btnLupa;
        @FindBy(id = "Intel-Core-i5-0-processor_type")
        public WebElementFacade checkboxProcesadorCoreFive;

        @FindBy(xpath = "//*[@id=\"SearchContainer\"]/div/div[2]/div/div[1]/div") //
        public WebElementFacade txtResultadoBusqueda; //texto de resultados de busqueda

        @FindBy(id = "Intel-Core-i7-1-processor_type")
        public WebElementFacade checkboxProcesadorCoreSeven;

        @FindBy(xpath = "//*[@id=\"searchProductResult\"]/div/div[1]/div/div/div[2]/div[2]/div[1]/div[1]/a/span")
        public WebElementFacade lblProducto;
        @FindBy(xpath = "//*[@id=\"add-on-atc-container\"]/div[1]/section/div[1]/div[3]/button/span/span") //ingles
        // //*[@id="add-on-atc-container"]/div[1]/section/div[1]/div[3]/button/span/span/font/font // español
        public WebElementFacade btnAnadircarrito;
      //  @FindBy(xpath = "//*[@id=\"hf-cart\"]/span/span/span[1]/img")
       // public WebElementFacade btnCarrito;
        @FindBy(xpath= "//*[@id=\"header-cart-tooltip\"]")
        public WebElementFacade txtCantidad;
    }