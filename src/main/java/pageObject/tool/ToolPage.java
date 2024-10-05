package pageObject.tool;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import wrapClass.WrapClass;

import java.util.ArrayList;

public class ToolPage {

    private static final int SHORT_WAIT = 2000;
    private static final int LONG_WAIT = 20000;
    private int AVERAGE_WAIT = 5000;
    private static final String Monto = "1.000.000";
    private WebDriver driver;
    private JavascriptExecutor jsExecutor;

    public ToolPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.jsExecutor = (JavascriptExecutor) driver;
    }

    @CacheLookup
    @FindBy(linkText = "Herramientas")
    private WebElement btnHerramientas;
    @FindBy(xpath = "//body/app-root[1]/app-index-pages-tools[1]/div[2]/div[1]/div[1]/div[2]/app-bottom-cover-tools[1]/div[1]/div[1]/div[1]/app-remote-operations[1]/div[1]/div[1]/h2[1]/button[1]")
    private WebElement terminosyCondiciones;
    @FindBy(xpath = "//body/app-root[1]/app-index-pages-tools[1]/div[2]/div[1]/div[1]/div[2]/app-bottom-cover-tools[1]/div[1]/div[2]/div[1]/app-change-password[1]/div[1]/div[1]/h2[1]/button[1]")
    private WebElement cambioClave;

    @FindBy(xpath = "//h4[contains(text(),'Cambio de Clave')]")
    private WebElement contenidoCambioClave;

    @FindBy(xpath = "//input[@id='currentPass']")
    private WebElement claveActual;

    @FindBy(id = "newPass")
    private WebElement nuevaClave;
    @FindBy(xpath = "//body/app-root[1]/app-index-pages-tools[1]/div[2]/div[1]/div[1]/div[2]/app-bottom-cover-tools[1]/div[1]/div[2]/div[1]/app-change-password[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/span[1]/i[1]")
    private WebElement verContraseña;
    @FindBy(xpath = "//input[@id='newPass2']")
    private WebElement confirmarClave;
    @FindBy(xpath = "//button[contains(text(),'Cambiar clave')]")
    private WebElement btnCambiarClave;
    @FindBy(xpath = "//body/app-root[1]/app-index-pages-tools[1]/div[2]/div[1]/div[1]/div[2]/app-bottom-cover-tools[1]/div[1]/div[3]/div[1]/app-transactions-summary[1]/div[1]/div[1]/h2[1]/button[1]")
    private WebElement resumenTransacciones;

    @FindBy(xpath = "//body/app-root[1]/app-index-pages-tools[1]/div[2]/div[1]/div[1]/div[2]/app-bottom-cover-tools[1]/div[1]/div[6]/div[1]/app-payment-online[1]/div[1]/div[1]/h2[1]/button[1]")
    private WebElement pagoEnLinea;

    @FindBy(xpath = "//body/ngb-modal-window[1]/div[1]/div[1]/app-browser-modal[1]/section[1]/div[1]/button[1]")
    private WebElement cerrarPagoLinea;
    @FindBy(xpath = "//body/app-root[1]/app-index-pages-tools[1]/div[2]/div[1]/div[1]/div[2]/app-bottom-cover-tools[1]/div[1]/div[5]/div[1]/app-new-contributions[1]/div[1]/div[1]/h2[1]/button[1]")
    private WebElement nuevosAportes;
    @FindBy(xpath = "//body/app-root[1]/app-index-pages-tools[1]/div[2]/div[1]/div[1]/div[2]/app-bottom-cover-tools[1]/div[1]/div[5]/div[1]/app-new-contributions[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/p[1]/a[1]/i[1]")
    private WebElement tooltipCondiciones;
    @FindBy(xpath = "//body/ngb-modal-window[1]/div[1]/div[1]/app-service-conditions[1]/div[1]/div[1]/button[1]")
    private WebElement cerrarTooltip;
    @FindBy(xpath = "//select[@id='id-policy']")
    private WebElement productosList;
    @FindBy(xpath = "//input[@id='pesosAmount']")
    private WebElement montoAporte;
    @FindBy(xpath = "//body/app-root[1]/app-index-pages-tools[1]/div[2]/div[1]/div[1]/div[2]/app-bottom-cover-tools[1]/div[1]/div[5]/div[1]/app-new-contributions[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[2]/div[3]/button[1]")
    private WebElement siguiente;
    @FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-index-pages-tools[1]/div[2]/div[1]/div[1]/div[2]/app-bottom-cover-tools[1]/div[1]/div[5]/div[1]/app-new-contributions[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[7]/td[2]")
    private WebElement totalaPagar;
    @FindBy(xpath = "//button[contains(text(),'Atrás')]")
    private WebElement btnAtras;
    @FindBy(xpath = "//button[contains(text(),'Pagar en Línea')]")
    private WebElement btnPagarenLinea;
    @FindBy(xpath = "//button[contains(text(),'Ver estado de aportes')]")
    private WebElement verEstadoAportes;
    @FindBy(xpath = "//body/app-root[1]/app-index-pages-tools[1]/div[2]/div[1]/div[1]/div[2]/app-bottom-cover-tools[1]/div[1]/div[7]/div[1]/app-pat[1]/div[1]/div[1]/h2[1]/button[1]")
    private WebElement PAT;

    // Sucursal Virtual
    @FindBy(xpath = "//body/app-root[1]/app-index-pages-tools[1]/div[2]/div[1]/div[1]/div[2]/app-bottom-cover-tools[1]/div[1]/div[4]/div[1]/app-virtual-agency[1]/div[1]/div[1]/h2[1]/button[1]")
    private WebElement btnSucursalVirtual;
    @FindBy(xpath = "/html/body/app-root/app-index-pages-tools/div[2]/div/div/div[2]/app-bottom-cover-tools/div/div[4]/div/app-virtual-agency/div/div/div/div/div[3]/div/div[1]")
    private WebElement btnTramiteLinea;
    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-info-modal/section/div[1]/button")
    private WebElement btnCerrarCertificado;

    // Portabilidad Financiera
    @FindBy(xpath = "//body/app-root[1]/app-index-pages-tools[1]/div[2]/div[1]/div[1]/div[2]/app-bottom-cover-tools[1]/div[1]/div[5]/div[1]/app-financial-portability[1]/div[1]/div[1]/h2[1]/button[1]")
    private WebElement btnPortabilidadFinanciera;
    @FindBy(xpath = "/html/body/app-root/app-index-pages-tools/div[2]/div/div/div[2]/app-bottom-cover-tools/div/div[5]/div/app-financial-portability/div/div/div/div/div[2]/div/div/button")
    private WebElement btnIngresoSolicitud;

    @FindBy(xpath = "//body/ngb-modal-window[1]/div[1]/div[1]/app-modal-info[1]/section[1]/div[1]/button[1]")
    private WebElement closeTolls;

    public void initHerramienta() throws InterruptedException {
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(btnHerramientas);
        Thread.sleep(SHORT_WAIT);
    }

    public void terminosyCondiciones() throws InterruptedException {
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(terminosyCondiciones);
        Thread.sleep(5000);
        WrapClass.click(terminosyCondiciones);
    }

    public void cambiodeClave() throws InterruptedException {
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(cambioClave);
        Thread.sleep(2000);
        WrapClass.compareTexto(contenidoCambioClave, "Cambio de Clave");
        Thread.sleep(SHORT_WAIT);
        WrapClass.sendKeys(claveActual, "123456");
        Thread.sleep(SHORT_WAIT);
        WrapClass.sendKeys(nuevaClave, "12345678");
        Thread.sleep(SHORT_WAIT);
        WrapClass.sendKeys(confirmarClave, "12345678");
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(cambioClave);
    }

    public void resumendeTransacciones() throws InterruptedException {
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(resumenTransacciones);
        Thread.sleep(SHORT_WAIT);
        jsExecutor.executeScript("window.scrollBy(0, 100);");
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(resumenTransacciones);
    }

    public void sucursalVirtual() throws InterruptedException {
        int numeroActual = 1;
        WrapClass.click(btnSucursalVirtual);
        jsExecutor.executeScript("window.scrollBy(0, 200);");
        Thread.sleep(SHORT_WAIT);
        Actions accionRaton = new Actions(driver);

        // Base del XPath
        String xpathBase = "/html/body/app-root/app-index-pages-tools/div[2]/div/div/div[2]/app-bottom-cover-tools/div/div[4]/div/app-virtual-agency/div/div/div/div/div[3]/div/div[";

        // Bucle para realizar la acción la cantidad de veces especificada
        for (int i = 0; i < 17; i++) {
            // Construir el nuevo XPath
            Thread.sleep(SHORT_WAIT);
            String nuevoXPath = xpathBase + numeroActual + "]";

            try {
                // Intentar encontrar el nuevo elemento
                WebElement opcion = driver.findElement(By.xpath(nuevoXPath));
                accionRaton.moveToElement(opcion).perform();
                // Realiza la acción deseada, como un clic
                Thread.sleep(SHORT_WAIT);
                opcion.click();
                Thread.sleep(SHORT_WAIT);
                WrapClass.click(btnCerrarCertificado);
                Thread.sleep(SHORT_WAIT);

            } catch (NoSuchElementException e) {
                System.out.println("Elemento no encontrado: " + nuevoXPath);
                // Aquí puedes decidir si quieres salir del bucle o continuar
                break; // Sale del bucle si no encuentra el elemento
            }

            // Incrementar el número para el siguiente elemento
            numeroActual++;
        }

        WrapClass.click(btnSucursalVirtual);
    }

    public void portabilidadFinanciera() throws InterruptedException {
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(btnPortabilidadFinanciera);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(btnIngresoSolicitud);
        Thread.sleep(AVERAGE_WAIT);
        ArrayList<String> pentanas = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(pentanas.get(1));
        Thread.sleep(SHORT_WAIT);
        jsExecutor.executeScript("window.scrollBy(0, 200);");
        Thread.sleep(SHORT_WAIT);
        driver.close();
        pentanas = new ArrayList<String>(driver.getWindowHandles());
        Thread.sleep(SHORT_WAIT);
        driver.switchTo().window(pentanas.get(0));
        Thread.sleep(7000);
        WrapClass.click(btnPortabilidadFinanciera);
        Thread.sleep(SHORT_WAIT);
        jsExecutor.executeScript("window.scrollBy(0, -200);");
        Thread.sleep(SHORT_WAIT);
    }

    public void pagoenLinea() throws InterruptedException {
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(pagoEnLinea);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(cerrarPagoLinea);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(pagoEnLinea);
    }

    public void nuevosAportes() throws InterruptedException {
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(nuevosAportes);
        Thread.sleep(SHORT_WAIT);
        //WrapClass.click(cerrar);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(tooltipCondiciones);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(cerrarTooltip);
        Thread.sleep(SHORT_WAIT);
        jsExecutor.executeScript("window.scrollBy(0, 500);");
        Select select = new Select(productosList);
        select.selectByValue("1: CF0464935");
        Thread.sleep(SHORT_WAIT);
        WrapClass.sendKeys(montoAporte, Monto);
        Thread.sleep(5000);
        jsExecutor.executeScript("window.scrollBy(0, 500);");
        Thread.sleep(6000);
        WrapClass.click(siguiente);
        Thread.sleep(6000);
        WrapClass.compareTexto(totalaPagar, "$ " + Monto);
        //WrapClass.btnHabilitado(btnAtras);
        WrapClass.getText(totalaPagar);
        //WrapClass.btnHabilitado(btnPagarenLinea);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(verEstadoAportes);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(nuevosAportes);
    }

    public void pAT_InscripcionyEstados() throws InterruptedException {
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(PAT);
        jsExecutor.executeScript("window.scrollBy(0, 200);");
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(PAT);
    }

    public void seguroPensionado() throws InterruptedException {
        initHerramienta();
        terminosyCondiciones();
        cambiodeClave();
        resumendeTransacciones();
        sucursalVirtual();
        portabilidadFinanciera();
        pagoenLinea();
        pAT_InscripcionyEstados();
    }

    public void rentaVitalicia()throws InterruptedException{
        initHerramienta();
        terminosyCondiciones();
        cambiodeClave();
        resumendeTransacciones();
        sucursalVirtual();
        portabilidadFinanciera();
        Thread.sleep(1000);
        jsExecutor.executeScript("window.scrollBy(0, -200);");


    }

}


