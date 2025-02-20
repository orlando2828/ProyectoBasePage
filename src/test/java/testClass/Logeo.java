package testClass;
import org.openqa.selenium.WebDriver;
import page.Login;
import java.text.ParseException;

public class Logeo {

    private Login login;
    private WebDriver driver;

    //Metodo que ejecuta el caso de login

    public Logeo(WebDriver driver){
        this.driver = driver;
    }

    public void CasoLogin(String usuario, String clave) throws ParseException {
        login = new Login(driver);
        login.ingresarUsuario(usuario);
        login.ingresarClave(clave);
        login.clickBtnIngresar();
    }
}
