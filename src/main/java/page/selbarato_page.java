package page;

import driver.driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.apache.commons.lang3.BooleanUtils.and;

public class selbarato_page {
   public driver Driver = null;
    public WebDriver driver = null;
    public String prim = null;
    public String sgdo = null;
    public String terc = null;


    @FindBy(xpath="//*[@id='detail-content-sticky-nav-02']/form/div/div[2]/div/div[2]/div/div[1]/p/span")
    WebElement primero;
    @FindBy(xpath= "//*[@id='detail-content-sticky-nav-02']/form/div/div[5]/div/div[2]/div/div[1]/p/span")
    WebElement segundo;
    @FindBy(xpath="//*[@id=\'detail-content-sticky-nav-02\']/form/div/div[8]/div/div[2]/div/div[1]/p/span")
    WebElement tercero;


    @FindBy (id="450")
    WebElement check1;
    @FindBy (id = "210")
    WebElement check2;
    @FindBy (id = "300")
    WebElement check3;
    @FindBy(xpath="/html/body/div[2]/div[1]/div[1]/div/div[3]/div/div[2]/div[5]/div[2]/button")
    WebElement btnrevabrir;
    @FindBy(name="fullname")
    WebElement nombre;
    @FindBy(name="email")
    WebElement email;
    @FindBy(name="reviews_comments")
    WebElement comentario;
    @FindBy(xpath="//*[@id=\'29\']")
    WebElement btnrevenviar;


    public selbarato_page (driver driver){
        this.Driver=driver;
        PageFactory.initElements(this.Driver.returnDriver(),this);

    }
    public void seleccionarH(){
     prim = primero.getText();
     String exprim = prim.substring(1,4);
    System.out.println("el primer precio es "+(exprim));

    sgdo = segundo.getText();
        String exseg = sgdo.substring(1,4);
    System.out.println("el segundo precio es "+(exseg));

    terc = tercero.getText();
        String exter = terc.substring(1,4);
    System.out.println("el tercer precio es "+(exter));

    int pf1 = Integer.parseInt(exprim);
    int pf2 = Integer.parseInt(exseg);
    int pf3 = Integer.parseInt(exter);

    if (pf1<pf2 & pf1<pf3)  {
        System.out.println("este es el menor precio "+ (pf1));
        Actions builder = new Actions(Driver.returnDriver());
        builder.moveToElement(check1).click().build().perform();
        System.out.println("1");


               }
    if(pf2<pf1 & pf2<pf3){
        System.out.println("este el menor precio " + (pf2));
        Actions builder = new Actions(Driver.returnDriver());
        builder.moveToElement(check2).click().build().perform();
        System.out.println("2");
    }
    if (pf3<pf1 & pf3<pf2){
        System.out.println("este es el menor precio " + (pf3));
        Actions builder = new Actions(Driver.returnDriver());
        builder.moveToElement(check3).click().build().perform();
        System.out.println("3");
    }

    }
    public void abrirreview(){

        btnrevabrir.click();
    }

    public void ingnom (String nom){

        nombre.sendKeys(nom);
        System.out.println("llegué al botón");
    }

    public void ingemail(String correo){
        email.sendKeys(correo);
    }

    public void ingcoment1(String com){
        comentario.sendKeys(com);

    }
    public void setBtnrevenviar(){
        Actions builder = new Actions(Driver.returnDriver());
        builder.moveToElement(btnrevenviar).click().build().perform();

    }

}
