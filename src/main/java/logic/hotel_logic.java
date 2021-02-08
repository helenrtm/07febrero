package logic;

import driver.driver;
import org.openqa.selenium.WebDriver;
import page.hotel_page;

public class hotel_logic {

    driver Driver = null;
    hotel_page hotpa = null;

    public hotel_logic (driver driver){
        this.Driver = driver;
        hotpa = new hotel_page(driver);
    }

    public void selDestinos (String destino) throws InterruptedException {
        Driver.implicitwait2();
        hotpa.setSeldestinou(destino);
        Driver.implicitwait2();
    }
    public void selcheck(String fechini){
        hotpa.setSelcheckin(fechini);

    }
    public void selchkout(String fechout){
        hotpa.setSelccheckout(fechout);
    }

    public void valoradulto(Integer valorA) throws InterruptedException{
        Driver.implicitwait2();
        hotpa.setValoradul(valorA);
    }

    public void valorninos(Integer valorN ) throws InterruptedException{
        Driver.implicitwait2();
        hotpa.setValornino(valorN);
    }

    public void buscar (){
        hotpa.setBtnsearch();
    }


}
