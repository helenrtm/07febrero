package page;

import driver.driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class hotel_page {
    public driver Driver = null;
    public WebDriver driver = null;

    @FindBy(xpath = "//*[@id='s2id_autogen16']")
    WebElement seldestino;

    @FindBy(xpath = "//*[@id='select2-drop']/div/input")
    WebElement seldestinou;

    @FindBy(xpath= "//*[@id=\'select2-drop\']/ul/li/ul/li/div")
    WebElement sellist;

    @FindBy(id="checkin")
    WebElement selcheckin;

    @FindBy(id="checkout")
    WebElement selccheckout;

    @FindBy(xpath="//*[@id='hotels']/div/div/form/div/div/div[4]/button")
    WebElement btnsearch;

    public hotel_page(driver driver){
       this.Driver = driver;
        PageFactory.initElements(this.Driver.returnDriver(),this);


    }

    public void setSeldestinou(String destinou)  {
        seldestino.click();
        seldestinou.sendKeys(destinou);
        sellist.click();

    }

        public void setSelcheckin (String fechin){
        selcheckin.clear();
        selcheckin.sendKeys(fechin);
        selcheckin.sendKeys(Keys.TAB);
    }

    public void setSelccheckout(String fechout){
        selccheckout.sendKeys((fechout));

    }

    public void setBtnsearch(){
        btnsearch.click();
    }


}
