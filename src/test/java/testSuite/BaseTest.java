package testSuite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utils.Constants.Navegador;
import utils.DriverContext;
import utils.Reporte.PdfQaNovaReports;

public abstract class BaseTest {

    protected String url = "https://qanovagroup.com/piloto";
    protected WebDriver driver;

    @BeforeTest
    public void setUp() {
        DriverContext.setUp(Navegador.Chrome,url); // Inicia el driver y abre la URL
        driver = DriverContext.getDriver();
        //System.setProperty("webdriver.chrome.driver", "driverNavegador/chromedriver.exe");
       // driver = new ChromeDriver();
        PdfQaNovaReports.createPDF();
        //driver.manage().window().maximize();
        driver.get(url);
    }

    @AfterTest
    public void closeDriver() {
        DriverContext.closeDriver();// Cierra el navegador correctamente
      //  if(driver != null) {
           // driver.quit();
        //}

    }
}
