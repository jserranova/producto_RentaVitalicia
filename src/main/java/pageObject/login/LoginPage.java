package pageObject.login;

import globalVariables.GlobalVariables;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import wrapClass.WrapClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private int LONG_WAIT= 35000;
    private int SHORT_WAIT = 2000;
    private WebDriver driver;
    private JavascriptExecutor  jsExecutor;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.jsExecutor = (JavascriptExecutor) driver;
    }

    @CacheLookup

    // ToolPage de Acceso a Usuario
    @FindBy(className = "//*[@id=\"loginForm\"]/div[1]/span")
    private WebElement tooltipRut;
    @FindBy(xpath = "//*[@id=\"loginForm\"]/div[2]/span")
    private WebElement tooltipPass;
    @FindBy(xpath = "//*[@id=\"modal-tooltip\"]/div/div/div[2]/button")
    private WebElement btnCerrar;

    //Modal Problema cuenta
    @FindBy(css = "#headingOne > button:nth-child(1)")
    private WebElement btn1;
    @FindBy(css = "#headingTwo > button") private WebElement btn2;
    @FindBy(css = "#headingThree > button") private WebElement btn3;
    @FindBy(css = "#headingFour > button") private WebElement btn4;
    @FindBy(xpath = "/html/body/app-root/app-login/div/div/div[2]/app-mod-ayuda/article/button[1]")
    private WebElement btncerraModal;

    // Acceso Usuario
    @FindBy(id = "usuario") private WebElement textBoxRut;
    @FindBy(id = "password") private WebElement textBoxPass;
    @FindBy(id = "cod_387116") private WebElement buttonLogin;



    public void toolLogin () throws InterruptedException {
        Thread.sleep(SHORT_WAIT);
        actionMouse1();
        Thread.sleep(SHORT_WAIT);
        actionMouse2();
        Thread.sleep(SHORT_WAIT);
    }


    public void loginUsuario(String textToSend) throws InterruptedException{
        Thread.sleep(SHORT_WAIT);
        WrapClass.sendKeys(textBoxRut, textToSend);
        Thread.sleep(SHORT_WAIT);
    }

    public void loginPassword(String textToSend) throws InterruptedException {
        Thread.sleep(SHORT_WAIT);
        WrapClass.sendKeys(textBoxPass, textToSend);
        Thread.sleep(SHORT_WAIT);

    }

    public void loginButton() throws InterruptedException {
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(buttonLogin);
        Thread.sleep(LONG_WAIT);
    }

    public void actionMouse1(){
        Actions accionRaton = new Actions(driver);
        WebElement opcion = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[1]/span"));
        accionRaton.moveToElement(opcion).perform();
    }

    public void actionMouse2(){
        Actions accionRaton = new Actions(driver);
        WebElement opcion = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[2]/span"));
        accionRaton.moveToElement(opcion).perform();
    }

    public void modal()throws InterruptedException{
        WrapClass.click(btn1);
        Thread.sleep(SHORT_WAIT);
        jsExecutor.executeScript("window.scrollTo(0, 100);");
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(btn1);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(btn2);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(btn2);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(btn3);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(btn3);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(btn4);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(btn4);
        Thread.sleep(SHORT_WAIT);
        jsExecutor.executeScript("window.scrollTo(0, -100)");
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(btncerraModal);
        Thread.sleep(SHORT_WAIT);
    }

    public void login() throws InterruptedException {
        toolLogin();
        modal();
        loginUsuario(GlobalVariables.USER_VI);
        loginPassword(GlobalVariables.PASS_QA);
        loginButton();
    }


}

