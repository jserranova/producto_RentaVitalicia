package test;

import driverClass.DriverSetup;
import globalVariables.GlobalVariables;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObject.home.HomePage;
import pageObject.login.LoginPage;
import pageObject.product.RentaVitalicia;
import pageObject.recoverPassword.RecoverPassword;
import pageObject.tool.ToolPage;
import pageObject.toolTip.TooltipRentaVitalicia;

public class Test_RV {

    WebDriver driver = DriverSetup.setupFirefoxDriver();
    private RecoverPassword recoverPassword;
    private LoginPage loginPage;
    private HomePage homePage;
    private TooltipRentaVitalicia tooltipRentaVitalicia;
    private ToolPage toolPage;
    private RentaVitalicia rentaVitalicia;

    @BeforeMethod
    public void init() {
        recoverPassword = PageFactory.initElements(driver, RecoverPassword.class);
        loginPage = PageFactory.initElements(driver,LoginPage.class);
        homePage = PageFactory.initElements(driver, HomePage.class);
        tooltipRentaVitalicia = PageFactory.initElements(driver, TooltipRentaVitalicia.class);
        rentaVitalicia = PageFactory.initElements(driver, RentaVitalicia.class);
        toolPage = PageFactory.initElements(driver, ToolPage.class);


    }

    @Test(priority = 1)
    public void recover_email() throws InterruptedException {
        recoverPassword.codeEmail(GlobalVariables.USER_RV);
    }

    @Test(priority = 2)
    public void recover_SMS() throws InterruptedException {
        recoverPassword.codeSMS(GlobalVariables.USER_RV);
    }

    @Test(priority = 3)
    public void login() throws InterruptedException {
        loginPage.toolLogin();
        loginPage.modal();
        loginPage.loginUsuario(GlobalVariables.USER_RV);
        loginPage.loginPassword(GlobalVariables.PASS_QA);
        loginPage.loginButton();
    }

    @Test(priority = 4)
    public void home() throws InterruptedException {
        homePage.home_RV();
    }
    @Test(priority = 5)
    public void tooltipHome() throws InterruptedException {
        tooltipRentaVitalicia.resumenRentaVitalicia();
    }

    @Test(priority = 6)
 public void product()throws InterruptedException{
        rentaVitalicia.product_rentabitalicia();
    }
    @Test(priority = 7)
    public void tool() throws InterruptedException{
        toolPage.rentaVitalicia();

    }

    @AfterTest
    public void close(){
        driver.quit();
    }
}
