package wrapClass;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.testng.Assert;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WrapClass {

    private WebDriver driver;

    // Contructor
    public WrapClass(WebDriver driver) {
        this.driver = driver;
    }

    public static void click(WebElement webE) {
        webE.click();
    }


    public static void sendKeys(WebElement webSendKeys, String textToSend) {
        webSendKeys.clear();
        webSendKeys.sendKeys(textToSend);
    }


    public static String getText(WebElement webE) {
        return webE.getText();
    }

    public static void compareTexto(WebElement elemento, String textoEsperado) {
        String textoActual = elemento.getText();
        Assert.assertEquals(textoActual, textoEsperado, "El texto no coincide");
    }

    public static boolean btnIsEnabled(WebElement webE) {
        return webE.isEnabled();
    }
    // Tomar Foto del Error
    public static void takeScreenshot(WebDriver driver) {
        // Tomar el screenshot
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        // Usar una ruta absoluta para guardar el archivo
        String filePath = System.getProperty("user.dir") + "/ErrorTest.png";

        try {
            Files.copy(scrFile.toPath(), Paths.get(filePath));
            System.out.println("Captura de pantalla guardada en: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void selectFromDropdown(WebElement webE, String valueToSelect) {
        Select dropDown = new Select(webE);
        dropDown.selectByValue(valueToSelect);
    }

    public static void refreshPage(WebDriver driver) {
        driver.navigate().refresh();
    }

    public static void setImplicitWait(WebDriver driver, int timeout) {
        driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
    }

    public static void listaEstatica(WebDriver driver, WebElement webE) throws InterruptedException {
        Select listaSeleccionada = new Select(webE);
        listaSeleccionada.selectByIndex(2);
        //Metodo 2
        /**
         System.out.println(listaSeleccionada.getFirstSelectedOption().getText());
         Thread.sleep(3000);
         listaSeleccionada.selectByVisibleText("Customer service");**/

        //Metodo 3
        /**
         System.out.println(listaSeleccionada.getFirstSelectedOption().getText());
         Thread.sleep(3000);
         listaSeleccionada.selectByValue("0");
         System.out.println(listaSeleccionada.getFirstSelectedOption().getText());
         Thread.sleep(3000);
         **/
    }

    public static void backPage(WebDriver driver){
        driver.navigate().back();
    }

    public void forwardPage(WebDriver driver){
        driver.navigate().forward();
    }

    }

