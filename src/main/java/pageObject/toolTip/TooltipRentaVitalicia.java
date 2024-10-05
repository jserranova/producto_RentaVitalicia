package pageObject.toolTip;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import wrapClass.WrapClass;

import java.util.ArrayList;

public class TooltipRentaVitalicia {

    private WebDriver driver;
    private static final int SHORT_WAIT = 2000; // 1 second
    private static final int LONG_WAIT = 10000;  // 5 seconds
    private int AVERAGE_WAIT = 5000;
    private JavascriptExecutor jsExecutor;

    public TooltipRentaVitalicia(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.jsExecutor = (JavascriptExecutor) driver;
    }
    @FindBy(xpath = "//body/ngb-modal-window[1]/div[1]/div[1]/app-modal-info[1]/section[1]/div[1]/button[1]")
    private WebElement cerrarTooltip;

    @FindBy(xpath = "//body/app-root[1]/app-index-pages-home[1]/div[2]/div[2]/div[1]/div[2]/app-bottom-cover-home[1]/div[1]/app-master-card[1]/div[1]/app-card[1]/div[1]/div[1]/div[1]/div[2]/span[2]/i[1]")
    private WebElement tooltipPoliza_RV;
    @FindBy(xpath = "//body/app-root[1]/app-index-pages-home[1]/div[2]/div[2]/div[1]/div[2]/app-bottom-cover-home[1]/div[1]/app-master-card[1]/div[1]/app-card[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]/i[1]")
    private WebElement tooltipMontoDePension;

    @FindBy(xpath = "//body/app-root[1]/app-index-pages-home[1]/div[2]/div[2]/div[1]/div[2]/app-bottom-cover-home[1]/div[1]/app-master-card[1]/div[1]/app-card[1]/div[1]/div[1]/div[3]/div[1]/div[1]/span[2]")
    private WebElement tooltipPagosDePension;

    @FindBy(xpath = "//body/app-root[1]/app-index-pages-home[1]/div[2]/div[2]/div[1]/div[2]/app-bottom-cover-home[1]/div[1]/app-master-card[1]/div[1]/app-card[1]/div[1]/div[1]/div[3]/div[2]/div[1]/span[2]")
    private WebElement tooltipDatosDeMiPoliza;

    @FindBy(xpath = "//body/app-root[1]/app-index-pages-home[1]/div[2]/div[2]/div[1]/div[2]/app-bottom-cover-home[1]/div[1]/app-master-card[1]/div[1]/app-card[1]/div[1]/div[1]/div[3]/div[2]/div[4]/div[1]/div[1]/span[1]/i[1]")
    private WebElement tooltipPeriodoGarantizado;

    @FindBy(xpath = "//body/app-root[1]/app-index-pages-home[1]/div[2]/div[2]/div[1]/div[2]/app-bottom-cover-home[1]/div[1]/app-master-card[1]/div[1]/app-card[1]/div[1]/div[1]/div[3]/div[2]/div[5]/div[1]/div[1]/span[1]/i[1]")
    private WebElement tooltipPeriodoDiferido;

    @FindBy(xpath = "/html/body/app-root/app-index-pages-home/div[2]/div[2]/div[1]/div[2]/app-bottom-cover-home/div/app-master-card/div/app-card/div[1]/div/div[3]/div[3]/button")
    private WebElement masInformaciones_RV;

    @FindBy(linkText = "Descargar")
    private WebElement linkDescargaLiquidacion;


    // Home Page Locators Chat de Glia
    @FindBy(className = "sm-tab-text")
    private WebElement chatGlia;
    @FindBy(className = "sm-close")
    private WebElement cerraChatGlia;



    public void resumenRentaVitalicia() throws InterruptedException {
        Thread.sleep(SHORT_WAIT);
        jsExecutor.executeScript("window.scrollBy(0, 600);");
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(tooltipPoliza_RV);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(cerrarTooltip);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(tooltipMontoDePension);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(cerrarTooltip);
        Thread.sleep(SHORT_WAIT);
        clickAndCloseTooltip(tooltipPagosDePension);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(tooltipDatosDeMiPoliza);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(cerrarTooltip);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(linkDescargaLiquidacion);
        Thread.sleep(LONG_WAIT);
        ArrayList<String> pentanas = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(pentanas.get(1)).close();
        Thread.sleep(SHORT_WAIT);
        pentanas = new ArrayList<String>(driver.getWindowHandles());
        Thread.sleep(SHORT_WAIT);
        driver.switchTo().window(pentanas.get(0));
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(tooltipPeriodoGarantizado);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(cerrarTooltip);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(tooltipPeriodoDiferido);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(cerrarTooltip);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(masInformaciones_RV);
        Thread.sleep(7000);
        WrapClass.backPage(driver);
        Thread.sleep(AVERAGE_WAIT);
        jsExecutor.executeScript("window.scrollBy(0, -600);");


    }

    private void clickAndCloseTooltip(WebElement tooltip) throws InterruptedException {
        WrapClass.click(tooltip);
        Thread.sleep(SHORT_WAIT); // Espera 1 segundo
        WrapClass.click(cerrarTooltip);
        Thread.sleep(SHORT_WAIT); // Espera 1 segundo
    }


}
