package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Reporte.EstadoPrueba;
import utils.Reporte.PdfQaNovaReports;

public class CargaInformacion extends BasePage {

    @FindBy(xpath = "//*[@id='imPgTitle']")
    private WebElement titulo;

    @FindBy(xpath = "//*[@id='imObjectForm_1_2']")
    private WebElement campoTexto;

    @FindBy(xpath = "//*[@id='imObjectForm_1_3']")
    private WebElement campoCorreo;

    @FindBy(xpath = "//*[@id='imObjectForm_1_4']")
    private WebElement campoTextArea;

    @FindBy(xpath = "//*[@id='imObjectForm_1_5']")
    private WebElement campoFecha;

    @FindBy(xpath = "//*[@id='imObjectForm_1_6']")
    private WebElement campoLista;

    @FindBy(xpath = "//*[@id='imObjectForm_1_7_0']")
    private WebElement campoMultiple1;

    @FindBy(xpath = " //*[@id='imObjectForm_1_7_1']")
    private WebElement campoMultiple2;

    @FindBy(xpath = "//*[@id='imObjectForm_1_7_2']")
    private WebElement campoMultiple3;

    @FindBy(xpath = "//*[@id='imObjectForm_1_8_0']")
    private WebElement rdbtnCombo1;

    @FindBy(xpath = "//*[@id='imObjectForm_1_8_1']")
    private WebElement rdbtnCombo2;

    @FindBy(xpath = "//*[@id='imObjectForm_1_8_2']")
    private WebElement rdbtnCombo3;

    @FindBy(xpath = "//*[@id='imObjectForm_1_submit']")
    private WebElement btnEnviar;

    @FindBy(xpath = "//*[@id='imObjectForm_1_buttonswrap']/input[2]")
    private WebElement btnResetear;

    @FindBy(xpath = "//*[@id='imObjectForm_1_5_icon']")
    private WebElement iconoCalendario;

    @FindBy(xpath = "//*[@id='imDPleft']")
    private WebElement btnRetrocederMes;

    @FindBy(xpath = "//*[@id='imDPright']")
    private WebElement btnAvanzarMes;


    public CargaInformacion(WebDriver driver){
        super(driver);
    }
    public String recuperarTitulo(){
        wait.until(ExpectedConditions.visibilityOf(titulo));
        PdfQaNovaReports.addWebReportImage("Despliegue carga de información", "Carga de información desplegado correctamente", EstadoPrueba.PASSED,false);
        return titulo.getText();
    }

    public void rellenarCampoTexto(String texto) {
        campoTexto.sendKeys(texto);

    }

    public void rellenarCampoMail(String mail) {
        campoCorreo.sendKeys(mail);
    }

    public void rellenarCampoAreaTexto(String areaTexto) {
        campoTextArea.sendKeys(areaTexto);

    }

    public void rellenarCampoFecha(String fecha) {
        campoFecha.sendKeys(fecha);

    }

    public void rellenarCampoLista(String valor) {
        Select select = new Select(campoLista);
        select.selectByVisibleText(valor);
    }




}
