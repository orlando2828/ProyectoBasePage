package testClass;

import org.openqa.selenium.WebDriver;
import page.CargaInformacion;
import page.Login;
import java.text.ParseException;

public class FlujoCarga {
    private Login login;
    private CargaInformacion cargaInformacion;
    private WebDriver driver;

    public FlujoCarga(WebDriver driver){
        this.driver = driver;
    }

    //Metodo que ejecuta el caso de login
    public void EjecucionCarga (String usuario, String clave) throws ParseException {
        login = new Login(driver);
        cargaInformacion = new CargaInformacion(driver);
        login.ingresarUsuario(usuario);
        login.ingresarClave(clave);
        login.clickBtnIngresar();
        cargaInformacion.recuperarTitulo();
        cargaInformacion.rellenarCampoTexto("Prueba Testeo2");
        cargaInformacion.rellenarCampoMail("prueba2@gmail.com");
        cargaInformacion.rellenarCampoAreaTexto("rellenarAreaTexto");
        cargaInformacion.rellenarCampoFecha("02/02/2024");
        cargaInformacion.rellenarCampoLista("valor 3");
        cargaInformacion.seleccionMultiple2("1,2,3");
        cargaInformacion.comboRadio(2);
        cargaInformacion.clickBtnEnviar();





    }
}

