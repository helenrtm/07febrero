package logic;

import driver.driver;
import page.landing_page;

public class landing_logic {
driver Driver = null;
landing_page lanpag = null;

public landing_logic (driver driver){
this.Driver = driver;
lanpag = new landing_page(Driver);

}

public void Homepage (){
lanpag.setHomepage();

}
}
