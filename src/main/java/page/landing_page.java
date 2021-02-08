package page;

import driver.driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class landing_page {
    public driver Driver = null;
    public WebDriver driver = null;

@FindBy(xpath="//*[@id='Main']/section[1]/div/div/div[2]/div/div/div[1]/div/div/div/div/div/a")
WebElement homepage;

public landing_page (driver driver){
this.Driver = driver;
    PageFactory.initElements(this.Driver.returnDriver(),this);

}

public void setHomepage(){
homepage.click();
}


}
