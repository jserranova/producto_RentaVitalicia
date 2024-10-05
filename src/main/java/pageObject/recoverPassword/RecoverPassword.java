package pageObject.recoverPassword;

import wrapClass.WrapClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class RecoverPassword {
    private static final int SHORT_WAIT = 2000;
    private WebDriver driver;

    public RecoverPassword(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    // Recovery Page Locators
    @FindBy(xpath = "//u[contains(text(),'¿Olvidaste tu clave?')]")
    private WebElement linkRecovery;

    @FindBy(id = "rut")
    private WebElement textBoxRut;

    @FindBy(id = "inlineRadio1")
    private WebElement checkBoxEmail;

    @FindBy(id = "inlineRadio2")
    private WebElement checkBoxSMS;

    @FindBy(xpath = "//button[@id='btnEnviar']")
    private WebElement btnEnviar;

    @FindBy(xpath= "//button[@class='btn btn-outline-secondary']")
    private WebElement btnVolver;


    public void codeEmail(String textRut) throws InterruptedException {
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(linkRecovery);
        Thread.sleep(SHORT_WAIT);
        WrapClass.sendKeys(textBoxRut, textRut);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(checkBoxEmail);
        Thread.sleep(SHORT_WAIT);
        WrapClass.btnIsEnabled(btnEnviar);
        Thread.sleep(SHORT_WAIT);
        WrapClass.refreshPage(driver);
    }

    public void codeSMS(String textToSend) throws InterruptedException{
        Thread.sleep(SHORT_WAIT);
        WrapClass.sendKeys(textBoxRut, textToSend);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(checkBoxSMS);
        Thread.sleep(SHORT_WAIT);
        WrapClass.btnIsEnabled(btnEnviar);
        WrapClass.click(btnVolver);

    }



}
