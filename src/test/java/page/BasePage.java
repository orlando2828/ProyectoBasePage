package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverContext;

public abstract class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    // Constructor que inicializa el driver, wait y los elementos de la página
    public BasePage(WebDriver driver) {
        this.driver = DriverContext.getDriver();// Obtiene el driver directamente de DriverContext
        this.wait = new WebDriverWait(this.driver, 30);
        PageFactory.initElements(this.driver,this);

    }

    public void navigateTo(String url){
        driver.get(url);
    }

}
