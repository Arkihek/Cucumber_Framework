package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {

    public AmazonPage(){
        // baska package`daki class`larin bu constructor`i kullanabilmeleri icin
        // access modifier`ini public yapalim

        // bu page class`indan locate kullanacak tum class`lar
        // AmazonPage class`indan obje olusturmali
        // obje olusturmak icin de mutlaka bu Constructor calisacak
        // ozaman bu class`da WebDriver`imizi tanimlama isini
        // bu Constructor icinde yapabiliriz

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(id = "twotabsearchtextbox")
    public WebElement aramaKutusu;

    @FindBy(xpath = "//h1[@class='a-size-base s-desktop-toolbar a-text-normal']")
    public WebElement sonucYaziElementi;

    @FindBy(xpath = "(//div[@class='a-section aok-relative s-image-square-aspect'])[1]")
    public WebElement ilkkUrunElementi;

    @FindBy(xpath = "//span[@id='productTitle']")
    public WebElement urunIsimElementi;

}
