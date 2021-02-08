package logic;

import driver.driver;
import org.openqa.selenium.WebDriver;
import page.selbarato_page;

public class selbarato_logic {
     driver Driver = null;
    selbarato_page selpag = null;

    public selbarato_logic (driver driver){
        this.Driver= driver;
        selpag = new selbarato_page(driver);
    }

    public void selecbarato () throws InterruptedException{
        Driver.implicitwait2();
        selpag.seleccionarH();
        Driver.implicitwait2();

    }
    public void abrirreview1() throws InterruptedException{
        Driver.implicitwait2();
        selpag.abrirreview();

    }
    public void ingnom(String nom1) throws InterruptedException{
        Driver.implicitwait2();
        selpag.ingnom(nom1);
    }
    public void email1(String correo1) throws InterruptedException{
        Driver.implicitwait2();
        selpag.ingemail(correo1);
    }
    public void coment1(String com1) throws InterruptedException{
        Driver.implicitwait2();
        selpag.ingcoment1(com1);

    }
    public void enviarrev() throws InterruptedException{
        Driver.implicitwait2();
    selpag.setBtnrevenviar();
    }



}
