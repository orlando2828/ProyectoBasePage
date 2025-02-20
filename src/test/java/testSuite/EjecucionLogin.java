package testSuite;

import org.testng.annotations.Test;
import page.CargaInformacion;
import testClass.FlujoCarga;
import testClass.Logeo;
import utils.ReadProperties;
import utils.Reporte.PdfQaNovaReports;

import java.text.ParseException;

public class EjecucionLogin extends BaseTest {

    @Test
    public void LogeoPagina() throws ParseException {
        Logeo logeo = new Logeo(driver);
        String usuario = ReadProperties.readFromConfig("Propiedades.properties").getProperty("usuario");
        String clave = ReadProperties.readFromConfig("Propiedades.properties").getProperty("clave");
        logeo.CasoLogin(usuario,clave);
        PdfQaNovaReports.closePDF();
    }

    @Test
    public void LoginFlujo() throws ParseException {
        FlujoCarga flujoCarga = new FlujoCarga(driver);
        String usuario = ReadProperties.readFromConfig("Propiedades.properties").getProperty("usuario");
        String clave = ReadProperties.readFromConfig("Propiedades.properties").getProperty("clave");
        flujoCarga.EjecucionCarga(usuario,clave);
        PdfQaNovaReports.closePDF();

    }
}
