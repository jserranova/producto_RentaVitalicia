package pageObject.home;

import globalVariables.GlobalVariables;
import wrapClass.WrapClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;

public class HomePage {

    private int SHORT_WAIT = 1000;
    private int AVERAGE_WAIT = 2000;
    private JavascriptExecutor jsExecutor;
    private WebDriver driver;


    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.jsExecutor = (JavascriptExecutor) driver;
    }

    @CacheLookup

    // Cerrar encuesta de satisfaccion en home
    @FindBy(id = "btn-salir")
    private WebElement btnSalir;

    //Home Page Locators Barra Superior
    @FindBy(xpath = "//header/nav[1]/div[1]/div[1]/ul[1]/button[1]/li[1]/a[1]/span[1]")
    private WebElement barraInicio;

    //Mi Ejecutivo
    @FindBy(xpath = "//header/nav[1]/div[1]/div[1]/app-navbar-welcome[1]/div[1]/div[1]/div[1]/nav[1]/div[1]/button[1]")
    private WebElement miEjecutivo;

    @FindBy(xpath = "//header/nav[1]/div[1]/div[1]/app-navbar-welcome[1]/div[1]/div[1]/div[1]/nav[1]/div[1]/button[2]")
    private WebElement misDatos;

    //Datos Particulares
    @FindBy(id = "pAddress")
    private WebElement dpDireccion;
    @FindBy(id = "pPostalCode")
    private WebElement pCodigoPostal;
    @FindBy(id = "pProvince")
    private WebElement pProvincia;
    @FindBy(id = "pCommune")
    private WebElement pComuna;
    @FindBy(id = "pEmail")
    private WebElement pEmail;
    @FindBy(id = "pPhone")
    private WebElement pPhone;
    @FindBy(id = "pCellPhone")
    private WebElement pCellPhone;
    @FindBy(id = "")
    private WebElement btnModificarDatso;

    // Datos Comerciales
    @FindBy(xpath = "/html/body/app-root/app-index-pages-home/app-navbar/header/nav/div/div/app-navbar-welcome/div/div[2]/app-navbar-my-data/div[1]/div/button[2]")
    private WebElement btnDatosComerciales;
    @FindBy(id = "cAddress")
    private WebElement cDireccion;
    @FindBy(id = "cPostalCode")
    private WebElement cPostalCodigo;
    @FindBy(id = "cProvince")
    private WebElement cProvincia;
    @FindBy(id = "cCommune")
    private WebElement cComuna;
    @FindBy(id = "cEmail")
    private WebElement cEmail;
    @FindBy(id = "cPhone")
    private WebElement cPhone;
    @FindBy(id = "cCellPhone")
    private WebElement cCellphone;

    // Datos Cuenta Bancaria
    @FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-index-pages-home[1]/app-navbar[1]/header[1]/nav[1]/div[1]/div[1]/app-navbar-welcome[1]/div[1]/div[2]/app-navbar-my-data[1]/div[1]/div[1]/button[3]")
    private WebElement btnCb;
    @FindBy(xpath = "//*[@id=\"navbarScroll\"]/app-navbar-welcome/div/div[2]/app-navbar-my-data/div[2]/form/app-bank-account/app-form/form/table/tbody/tr[1]/td[2]/select")
    private  WebElement btnCbInstitucion;
    @FindBy(xpath = "//*[@id=\"navbarScroll\"]/app-navbar-welcome/div/div[2]/app-navbar-my-data/div[2]/form/app-bank-account/app-form/form/table/tbody/tr[2]/td[2]/select")
    private WebElement btnTipoCuenta;
    @FindBy(xpath = "//*[@id=\"navbarScroll\"]/app-navbar-welcome/div/div[2]/app-navbar-my-data/div[2]/form/app-bank-account/app-form/form/table/tbody/tr[3]/td[2]/input")
    private WebElement ncuenta;
    @FindBy(xpath = "//*[@id=\"navbarScroll\"]/app-navbar-welcome/div/div[2]/app-navbar-my-data/div[2]/form/app-bank-account/app-form/form/table/tbody/tr[4]/td[2]/div/input")
    private WebElement cConfirmaC;
    @FindBy(id = "confirmOwnerID") private WebElement btnclicConfirma;
    @FindBy(xpath = "//*[@id=\"navbarScroll\"]/app-navbar-welcome/div/div[2]/app-navbar-my-data/div[2]/form/app-bank-account/app-form/form/section[2]/button")
    private WebElement btnAbgregar;

    // Datos de Contacto
    @FindBy(xpath = "//header/nav[1]/div[1]/div[1]/app-navbar-welcome[1]/div[1]/div[1]/div[1]/nav[1]/div[1]/button[3]")
    private WebElement btnContacto;
    @FindBy(xpath = "//*[@id=\"navbarScroll\"]/app-navbar-welcome/div/div[2]/app-navbar-contact/div/div/div[2]/ul/li[1]/a")
    private WebElement  verSucursal;
    @FindBy(xpath = "/html/body/app-root/app-index-pages-home/app-navbar/header/nav/div/div/app-navbar-welcome/div/div[2]/app-navbar-contact/div/div/div[2]/ul/li[3]/a")
    private WebElement contactenos;


    // Home Page  ChatGlia
    @FindBy(className = "sm-tab-text")
    private WebElement chatGlia;
    @FindBy(className = "sm-close")
    private WebElement cerraChatGlia;
    @FindBy(xpath = "/html/body/div/div[1]/div[1]/div[1]/div/span/div/div/div[2]/div[3]/div/input")
    private WebElement nombreChat;
    @FindBy(xpath = "/html/body/div/div[1]/div[1]/div[1]/div/span/div/div/div[2]/div[3]/div/div[1]/input")
    private WebElement emailChat;
    @FindBy(xpath = "/html/body/div/div[1]/div[1]/div[1]/div/span/div/div/div[2]/div[3]/div/div[2]/div/div/input")
    private WebElement telefonoChat;
    @FindBy(xpath = "/html/body/div/div[1]/div[1]/div[1]/div/span/div/div/div[2]/div[3]/div/textarea")
    private WebElement mensajeChat;


    public void setMiEjecutivo() throws InterruptedException {
        Thread.sleep(AVERAGE_WAIT);
        WrapClass.click(miEjecutivo);
        Thread.sleep(AVERAGE_WAIT);
        WrapClass.click(miEjecutivo);
        Thread.sleep(SHORT_WAIT);
    }

    public void setDatosParticulares() throws InterruptedException {
        Thread.sleep(SHORT_WAIT);
        WrapClass.sendKeys(dpDireccion, GlobalVariables.pDireccion);
        Thread.sleep(SHORT_WAIT);
        WrapClass.sendKeys(pCodigoPostal, GlobalVariables.pCodioPostal);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(pProvincia);
        Thread.sleep(AVERAGE_WAIT);
        WrapClass.listaEstatica(driver, pProvincia);
        Thread.sleep(AVERAGE_WAIT);
        WrapClass.click(pComuna);
        Thread.sleep(AVERAGE_WAIT);
        WrapClass.listaEstatica(driver, pComuna);
        Thread.sleep(SHORT_WAIT);
        WrapClass.sendKeys(pEmail, GlobalVariables.pEmail);
        Thread.sleep(SHORT_WAIT);
        WrapClass.sendKeys(pPhone, GlobalVariables.pTelefono);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(pCellPhone);
        Thread.sleep(SHORT_WAIT);
    }

    public void setDatosComerciales() throws InterruptedException {
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(btnDatosComerciales);
        Thread.sleep(SHORT_WAIT);
        WrapClass.sendKeys(cDireccion, GlobalVariables.cDireccion);
        Thread.sleep(SHORT_WAIT);
        WrapClass.sendKeys(cPostalCodigo, GlobalVariables.cCodigoPostal);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(cProvincia);
        Thread.sleep(SHORT_WAIT);
        WrapClass.listaEstatica(driver, cProvincia);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(cComuna);
        Thread.sleep(SHORT_WAIT);
        WrapClass.listaEstatica(driver, cComuna);
        Thread.sleep(SHORT_WAIT);
        WrapClass.sendKeys(cEmail, GlobalVariables.cEmail);
        Thread.sleep(SHORT_WAIT);
        WrapClass.sendKeys(cPhone, GlobalVariables.cTelefono);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(cCellphone);
        //WrapClass.sendKeys(cCellphone, GlobalVariables.cCellPhone);
    }

    public void setCuentaBancaria()throws InterruptedException{
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(btnCb);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(btnCbInstitucion);
        Thread.sleep(SHORT_WAIT);
        WrapClass.listaEstatica(driver, btnCbInstitucion);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(btnTipoCuenta);
        Thread.sleep(AVERAGE_WAIT);
        WrapClass.listaEstatica(driver, btnTipoCuenta);
        Thread.sleep(AVERAGE_WAIT);
        WrapClass.sendKeys(ncuenta, GlobalVariables.nCuenta);
        Thread.sleep(AVERAGE_WAIT);
        WrapClass.sendKeys(cConfirmaC, GlobalVariables.nCuenta);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(btnclicConfirma);
        Thread.sleep(SHORT_WAIT);
        WrapClass.btnIsEnabled(btnAbgregar);
        Thread.sleep(SHORT_WAIT);
    }

    public void setContacto() throws InterruptedException {
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(btnContacto);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(verSucursal);
        Thread.sleep(2000);
        ArrayList<String> pentanas = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(pentanas.get(1)).close();
        Thread.sleep(AVERAGE_WAIT);
        driver.switchTo().window(pentanas.get(0));
        WrapClass.click(contactenos);
        Thread.sleep(2000);
        pentanas = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(pentanas.get(1)).close();
        Thread.sleep(AVERAGE_WAIT);
        driver.switchTo().window(pentanas.get(0));
        Thread.sleep(AVERAGE_WAIT);
        WrapClass.click(btnContacto);
        Thread.sleep(SHORT_WAIT);

    }

    public void chatGlia() throws InterruptedException{
        Thread.sleep(AVERAGE_WAIT);
        WrapClass.click(chatGlia);
        Thread.sleep(SHORT_WAIT);
        WrapClass.sendKeys(nombreChat, GlobalVariables.nombreChat);
        Thread.sleep(SHORT_WAIT);
        WrapClass.sendKeys(emailChat, GlobalVariables.cEmail);
        Thread.sleep(SHORT_WAIT);
        WrapClass.sendKeys(telefonoChat, GlobalVariables.cTelefono);
        Thread.sleep(SHORT_WAIT);
        WrapClass.sendKeys(mensajeChat, GlobalVariables.mensajeChat);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(cerraChatGlia);
        Thread.sleep(SHORT_WAIT);

    }

    public void homeReferido() throws InterruptedException {
        Thread.sleep(AVERAGE_WAIT);
        jsExecutor.executeScript("window.scrollTo(0, 1100);");
    }

    public void home_RV()throws InterruptedException{
       setMiEjecutivo();
       WrapClass.click(misDatos);
       setDatosParticulares();
       setDatosComerciales();
       WrapClass.click(misDatos);
       setContacto();

    }

    public void prueba() throws InterruptedException{


    }


}
