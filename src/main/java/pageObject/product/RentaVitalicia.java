package pageObject.product;

import com.beust.ah.A;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import wrapClass.WrapClass;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class RentaVitalicia {

    private int SHORT_WAIT = 2000;
    private int AVERAGE_WAIT = 3000;
    private int LONG_WAIT = 5000;
    private JavascriptExecutor jsExecutor;
    private WebDriver driver;

    public RentaVitalicia(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.jsExecutor = (JavascriptExecutor) driver;
    }


    @CacheLookup

    @FindBy(xpath = "//header/nav[1]/div[1]/div[1]/ul[1]/button[1]/li[1]/a[1]/span[1]")
    private WebElement barraInicio;

    // Inicio para realizar la ejecucion del producto
    @FindBy(linkText = "Productos")
    private WebElement btnProduct;
    @FindBy(xpath = "//header/nav[1]/div[1]/div[1]/ul[1]/button[2]/li[1]/div[1]/div[1]/span[1]")
    private WebElement rentabitalicia;


    //Datos de   la poliza
    @FindBy(xpath = "//body/app-root[1]/app-index-pages-product[1]/div[2]/div[1]/div[1]/div[2]/app-bottom-cover-products[1]/div[1]/div[1]/div[1]/app-data-policy-rv[1]/div[1]/div[1]/h2[1]/button[1]")
    private WebElement btnDatosPoliza;
    @FindBy(xpath = "/html/body/app-root/app-index-pages-product/div[2]/div/div/div[2]/app-bottom-cover-products/div/div[1]/div/app-data-policy-rv/div/div[1]/div/div/div[2]/div[2]/div/div[2]/div[2]/button")
    private WebElement btnCammbioViaPago;
    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-change-payment-method/div[1]/button")
    private WebElement btnCerrarPago;
    @FindBy(id = "flexCheckDefault")
    private WebElement clic;
    @FindBy(xpath = "/html/body/app-root/app-index-pages-product/div[2]/div/div/div[2]/app-bottom-cover-products/div/div[1]/div/app-data-policy-rv/div/div[1]/div/div/div[2]/div[2]/div/div[2]/div[4]/div/div/div/form/div/button[1]")
    private WebElement cancelar;
    @FindBy(xpath = "/html/body/app-root/app-index-pages-product/div[2]/div/div/div[2]/app-bottom-cover-products/div/div[1]/div/app-data-policy-rv/div/div[1]/div/div/div[2]/div[2]/div/div[2]/div[5]/div/div/table/tbody/tr/td[2]/div/button")
    private WebElement btnConsulta;
    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-no-pay-pension/div/div/button")
    private WebElement btncerraConsulta;

    // Certiicados
    @FindBy(xpath = "//body/app-root[1]/app-index-pages-product[1]/div[2]/div[1]/div[1]/div[2]/app-bottom-cover-products[1]/div[1]/div[2]/div[1]/app-certificates[1]/div[1]/div[1]/h2[1]/button[1]")
    private WebElement btnCertificado;

    // Certificado para pensionados
    @FindBy(xpath = "/html/body/app-root/app-index-pages-product/div[2]/div/div/div[2]/app-bottom-cover-products/div/div[2]/div/app-certificates/div/div/div/div/div[1]/ul/li[1]/button")
    private WebElement btnCertificadoPensionado;
    @FindBy(xpath = "//body/app-root[1]/app-index-pages-product[1]/div[2]/div[1]/div[1]/div[2]/app-bottom-cover-products[1]/div[1]/div[2]/div[1]/app-certificates[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/span[1]/h4[1]/em[1]")
    private WebElement tooltipCertificadoTributario;
    @FindBy(xpath = "//thead/tr[1]/td[2]/span[1]/a[1]/i[1]")
    private WebElement toolipcertificadoTriPension;

    //Certificado Tributario
    @FindBy(xpath = "/html/body/app-root/app-index-pages-product/div[2]/div/div/div[2]/app-bottom-cover-products/div/div[2]/div/app-certificates/div/div/div/div/div[1]/ul/li[2]/button")
    private WebElement btnCertificadoTributaro;
    @FindBy(xpath = "//body/app-root[1]/app-index-pages-product[1]/div[2]/div[1]/div[1]/div[2]/app-bottom-cover-products[1]/div[1]/div[2]/div[1]/app-certificates[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]/h4[1]/em[1]")
    private WebElement tolltipCertificadoPensiones;
    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-date-parameters-modal/div/div[1]/button")
    private WebElement btnCerrar_obtenerCertificado;

    @FindBy(xpath = "//body/ngb-modal-window[1]/div[1]/div[1]/app-certificates-for-pensioners[1]/section[1]/div[1]/button[1]")
    private WebElement cerrarTooltip;
    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-tax-certificates/section/div[1]/button")
    private WebElement cerrarTooltip_CertificadoTributario;
    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-pension-tributaries-certificate/section/div[1]/button")
    private WebElement cerrarTooltip_CertificadoTriPension;
    //Liquidacion de Pensiones
    @FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-index-pages-product[1]/div[2]/div[1]/div[1]/div[2]/app-bottom-cover-products[1]/div[1]/div[3]/div[1]/app-pension-payments[1]/div[1]/div[1]/h2[1]/button[1]")
    private WebElement btnLiquidacionPension;

    public void initProduct() throws InterruptedException {
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(btnProduct);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(rentabitalicia);
        Thread.sleep(LONG_WAIT);
        jsExecutor.executeScript("window.scrollBy(0, 400);");
    }

    public void datosPoliza() throws InterruptedException {
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(btnDatosPoliza);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(btnCammbioViaPago);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(btnCerrarPago);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(clic);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(cancelar);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(btnConsulta);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(btncerraConsulta);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(btnDatosPoliza);
    }

    public void certificado() throws InterruptedException {
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(btnCertificado);
        Thread.sleep(LONG_WAIT);
        WrapClass.click(tolltipCertificadoPensiones);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(cerrarTooltip);

        int numeroActual = 1;
        // Base del XPath
        String xpathBase = "//body/app-root[1]/app-index-pages-product[1]/div[2]/div[1]/div[1]/div[2]/app-bottom-cover-products[1]/div[1]/div[2]/div[1]/app-certificates[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/app-life-annuity[1]/div[";
        // Bucle para realizar la acción la cantidad de veces especificada
        for (int i = 0; i < 5; i++) {
            // Construir el nuevo XPath
            Thread.sleep(SHORT_WAIT);
            String nuevoXPath = xpathBase + numeroActual + "]/figure[1]/div[1]/button[1]";
            System.out.println("Este es el numero del xpath " + numeroActual);
            System.out.println("**********************************************************\n");
            try {
                // Intentar encontrar el nuevo elemento
                WebElement descarga = driver.findElement(By.xpath(nuevoXPath));
                // Realiza la acción deseada, como un clic
                //
                descarga.click();
                Thread.sleep(12000);
                ArrayList<String> pentanas = new ArrayList<String>(driver.getWindowHandles());
                driver.switchTo().window(pentanas.get(1)).close();
                Thread.sleep(SHORT_WAIT);
                pentanas = new ArrayList<>(driver.getWindowHandles());
                driver.switchTo().window(pentanas.get(0));
                //
                System.out.println("este es el numero por ejecucio " + numeroActual);
                System.out.println("********************************\n");


            } catch (NoSuchElementException e) {
                System.out.println("Elemento no encontrado: " + nuevoXPath);
                // Aquí puedes decidir si quieres salir del bucle o continuar
                break; // Sale del bucle si no encuentra el elemento
            }


            // Incrementar el número para el siguiente elemento
            numeroActual++;

            System.out.println("numero incrementado for " + numeroActual);
            System.out.println("********************************\n");
        }

        while (numeroActual > 5 && numeroActual < 8) {
            Thread.sleep(SHORT_WAIT);
            String nuevoXPath = xpathBase + numeroActual + "]/figure[1]/div[1]/button[1]";
            System.out.println("Este es el numero del xpath " + numeroActual);
            System.out.println("**********************************************************\n");
            WebElement descarga = driver.findElement(By.xpath(nuevoXPath));
            // Realiza la acción deseada, como un clic
            Thread.sleep(SHORT_WAIT);
            descarga.click();
            Thread.sleep(SHORT_WAIT);
            WrapClass.click(btnCerrar_obtenerCertificado);
            Thread.sleep(SHORT_WAIT);

            numeroActual++;

            System.out.println("numero incrementado white " + numeroActual);
            System.out.println("********************************\n");

        }

        Thread.sleep(SHORT_WAIT);
        WrapClass.click(btnCertificadoTributaro);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(tooltipCertificadoTributario);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(cerrarTooltip_CertificadoTributario);//
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(toolipcertificadoTriPension);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(cerrarTooltip_CertificadoTriPension);
        Thread.sleep(SHORT_WAIT);


        int numero = 1;

        Actions accionRaton = new Actions(driver);

        // Base del XPath
        String xpathBase2 = "/html/body/app-root/app-index-pages-product/div[2]/div/div/div[2]/app-bottom-cover-products/div/div[2]/div/app-certificates/div/div/div/div/div[2]/div[2]/div/app-income-tax-certificates/div[2]/div/div/div/table/tbody/tr[";

        // Bucle para realizar la acción la cantidad de veces especificada
        for (int i = 0; i < 4; i++) {
            // Construir el nuevo XPath
            Thread.sleep(SHORT_WAIT);
            String nuevoXPath = xpathBase2 + numero + "]/td[2]/a";

            try {
                // Intentar encontrar el nuevo elemento
                WebElement descarga = driver.findElement(By.xpath(nuevoXPath));
                accionRaton.moveToElement(descarga).perform();
                // Realiza la acción deseada, como un clic
                descarga.click();
                Thread.sleep(7000);
                ArrayList<String> pentanas = new ArrayList<String>(driver.getWindowHandles());
                driver.switchTo().window(pentanas.get(1)).close();
                Thread.sleep(SHORT_WAIT);
                pentanas = new ArrayList<>(driver.getWindowHandles());
                driver.switchTo().window(pentanas.get(0));
                //
                System.out.println("este es el numero por ejecucio " + numeroActual);
                System.out.println("*****************");

            } catch (NoSuchElementException e) {
                System.out.println("Elemento no encontrado: " + nuevoXPath);
                // Aquí puedes decidir si quieres salir del bucle o continuar
                break; // Sale del bucle si no encuentra el elemento
            }

            // Incrementar el número para el siguiente elemento
            numero++;
        }

        Thread.sleep(SHORT_WAIT);
        WrapClass.click(btnCertificado);
    }


    public void liquidacionPension() throws InterruptedException {
        Thread.sleep(3000);
        WrapClass.click(btnLiquidacionPension);
        Thread.sleep(3000);
        WrapClass.click(btnLiquidacionPension);
        Thread.sleep(2000);
        jsExecutor.executeScript("window.scrollBy(0, -400);");
    }

    public void product_rentabitalicia() throws InterruptedException {
        initProduct();
        datosPoliza();
        certificado();
        liquidacionPension();
        Thread.sleep(2000);
        jsExecutor.executeScript("window.scrollBy(0, -400);");


    }

    public void prueba() throws InterruptedException {
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(btnCertificadoTributaro);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(tooltipCertificadoTributario);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(cerrarTooltip_CertificadoTributario);//
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(toolipcertificadoTriPension);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(cerrarTooltip_CertificadoTriPension);
        Thread.sleep(SHORT_WAIT);


        int numeroActual = 1;

        Actions accionRaton = new Actions(driver);

        // Base del XPath
        String xpathBase = "/html/body/app-root/app-index-pages-product/div[2]/div/div/div[2]/app-bottom-cover-products/div/div[2]/div/app-certificates/div/div/div/div/div[2]/div[2]/div/app-income-tax-certificates/div[2]/div/div/div/table/tbody/tr[";

        // Bucle para realizar la acción la cantidad de veces especificada
        for (int i = 0; i < 4; i++) {
            // Construir el nuevo XPath
            Thread.sleep(SHORT_WAIT);
            String nuevoXPath = xpathBase + numeroActual + "]/td[2]/a";

            try {
                // Intentar encontrar el nuevo elemento
                WebElement descarga = driver.findElement(By.xpath(nuevoXPath));
                accionRaton.moveToElement(descarga).perform();
                // Realiza la acción deseada, como un clic
                Thread.sleep(SHORT_WAIT);
                descarga.click();
                Thread.sleep(SHORT_WAIT);
                ArrayList<String> pentanas = new ArrayList<String>(driver.getWindowHandles());
                driver.switchTo().window(pentanas.get(1)).close();
                Thread.sleep(7000);
                pentanas = new ArrayList<>(driver.getWindowHandles());
                driver.switchTo().window(pentanas.get(0));
                Thread.sleep(SHORT_WAIT);
                System.out.println("este es el numero por ejecucio " + numeroActual);
                System.out.println("*****************");

            } catch (NoSuchElementException e) {
                System.out.println("Elemento no encontrado: " + nuevoXPath);
                // Aquí puedes decidir si quieres salir del bucle o continuar
                break; // Sale del bucle si no encuentra el elemento
            }

            // Incrementar el número para el siguiente elemento
            numeroActual++;
        }

         Thread.sleep(SHORT_WAIT);
        WrapClass.click(btnCertificado);
    }



}