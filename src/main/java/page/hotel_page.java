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
    public String printadul = null;
    public String printnin = null;

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

    @FindBy(name="adults")
    WebElement valoradul;
    @FindBy(xpath="//*[@id='hotels']/div/div/form/div/div/div[3]/div/div/div/div/div/div/div[1]/div/div[2]/div/span/button[1]")
    WebElement adulmas;
    @FindBy(xpath="//*[@id='hotels']/div/div/form/div/div/div[3]/div/div/div/div/div/div/div[1]/div/div[2]/div/span/button[2]")
    WebElement adulmen;

    @FindBy(name="children")
    WebElement valornino;
    @FindBy(xpath="//*[@id='hotels']/div/div/form/div/div/div[3]/div/div/div/div/div/div/div[2]/div/div[2]/div/span/button[1]")
    WebElement ninmas;
    @FindBy(xpath="//*[@id='hotels']/div/div/form/div/div/div[3]/div/div/div/div/div/div/div[2]/div/div[2]/div/span/button[2]")
    WebElement ninmenos;


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
        selccheckout.sendKeys(fechout);
        selccheckout.sendKeys(Keys.TAB);

    }

    public void setValoradul(Integer cant){


    int adulto1 = 2;


     if(adulto1 > cant){
         adulmen.click();
     }
    if (adulto1< cant){
        adulmas.click();
    }
    if (adulto1 == cant){
        System.out.println("justo la cantidad solicitada de adultos");
        valoradul.sendKeys((Keys.TAB));

    }
    }

    public  void setValornino(Integer cantni){

        int nino1 = 0;
        if (nino1>cantni){
            ninmenos.click();
        }
        if(nino1<cantni){
            ninmas.click();
        }
        if(nino1==cantni){
            System.out.println("justa la cantidad solicitada de niños");
        }
    }

    public void setBtnsearch(){
        btnsearch.click();
    }


}
