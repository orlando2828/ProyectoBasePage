package testClass;
import org.openqa.selenium.WebDriver;
import page.Login;
import java.text.ParseException;

public class Logeo {

    private Login login;
    private WebDriver driver;

    //Constructor que recibe el driver y lo asigna

    public Logeo(WebDriver driver){
        this.driver = driver; //Asignar el driver recibido al atributo de la clase
    }
    // Metodo que ejecuta el caso de login
    public void CasoLogin(String usuario, String clave) throws ParseException {
        login = new Login(driver);
        login.ingresarUsuario(usuario);
        login.ingresarClave(clave);
        login.clickBtnIngresar();
    }
}
