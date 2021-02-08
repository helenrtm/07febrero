import driver.driver;
import logic.hotel_logic;
import logic.landing_logic;
import logic.selbarato_logic;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class travels_test {
driver Driver = null;
landing_logic lanlog1 = null;
hotel_logic hotlog1 = null;
selbarato_logic selblog1 = null;

@BeforeClass
    public void setupEnv () {
    Driver = new driver();
   lanlog1 = new landing_logic(Driver);
   hotlog1 = new hotel_logic(Driver);
   selblog1 = new selbarato_logic(Driver);

    }
 @Test(priority=1, testName= "Windows")
public void ventanas ()throws InterruptedException {
    Driver.goto_url("https://phptravels.com/demo/");

    String aux = Driver.windowParent();

     Driver.scroll(200);
     Driver.implicitwait2();
     lanlog1.Homepage();
     Driver.scroll(200);
     Driver.implicitwait2();
     Driver.switchWindows();

     Driver.scroll(200);

     hotlog1.selDestinos("TRIA HOTEL I");
     //Driver.implicitwait2();
     hotlog1.selcheck("09/02/2021");
     //Driver.implicitwait2();
     hotlog1.selchkout("15/02/2021");
     Driver.implicitwait2();
     hotlog1.valoradulto(2);
     hotlog1.valorninos(0);
     hotlog1.buscar();
     Driver.implicitwait2();
     Driver.scroll(2000);
     selblog1.selecbarato();
     Driver.scroll(5000);
     Driver.implicitwait2();
     selblog1.abrirreview1();
     selblog1.ingnom("helen");
     selblog1.email1("helen@gmail.com");
     selblog1.coment1("reserva realizada buenas referencias");
     Driver.implicitwait2();
     Driver.scroll(5500);
     Driver.implicitwait2();
     selblog1.enviarrev();
     Driver.implicitwait2();


 }
    @AfterClass
    public void teardown() {
        Driver.teardown();
    }
}
