package com.everis.base.PageObject;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.linio.com.pe/")
public class LinioPage extends PageObject {

    @FindBy(xpath="//*[@id=\"navbar\"]/div[2]/div[2]/div[4]/form/div/div/input")
    public WebElementFacade inputBuscador;

    @FindBy(xpath = "/html/body/header/nav/div[2]/div[2]/div[4]/form/div/div/div/button")
    public WebElementFacade btnBuscador;

}
