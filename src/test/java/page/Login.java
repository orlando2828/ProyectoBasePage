package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.Reporte.EstadoPrueba;
import utils.Reporte.PdfQaNovaReports;

public class Login extends BasePage {

    // Localizadores usando @FindBy (ajusta los selectores según tu HTML)
    @FindBy(xpath = "//*[@name=\"imUname\"]")
    private WebElement inputUsuario;

    @FindBy(xpath = "//*[@id=\"imPwd\"]")
    private WebElement inputClave;

    @FindBy(xpath = "//*[@id=\"imLogin\"]/form/div[3]/input")
    private WebElement btnIngresar;

    public Login(WebDriver driver){
        super(driver); // Inicializa el driver, wait y PageFactory

    }

    public void ingresarUsuario(String usuario){
        wait.until(ExpectedConditions.visibilityOf((inputUsuario)));
        PdfQaNovaReports.addWebReportImage("Despliegue Login","Login desplegado correctamente", EstadoPrueba.PASSED,false);
        inputUsuario.sendKeys(usuario);
    }
    public void ingresarClave(String clave){
        wait.until(ExpectedConditions.visibilityOf(inputClave));
        inputClave.sendKeys(clave);
    }

    public void clickBtnIngresar(){
        wait.until(ExpectedConditions.visibilityOf((btnIngresar)));
        PdfQaNovaReports.addWebReportImage("Datos Login","Se ingresa usuario y contraseña",EstadoPrueba.PASSED,false);
        btnIngresar.click();
    }
}
