package testSuite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utils.Reporte.PdfQaNovaReports;

public abstract class BaseTest {
    protected WebDriver driver;
    protected String url = "https://qanovagroup.com/piloto";

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "driverNavegador/chromedriver.exe");
        driver = new ChromeDriver();
        PdfQaNovaReports.createPDF();
        driver.manage().window().maximize();
        driver.get(url);
    }

    @AfterTest
    public void tearDown() {
      //  if(driver != null) {
           // driver.quit();
        //}

    }
}
