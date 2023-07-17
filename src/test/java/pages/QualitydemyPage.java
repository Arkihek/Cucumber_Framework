package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class QualitydemyPage {

    public QualitydemyPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement loginButon;

    @FindBy(xpath = "//*[@id='login-email']")
    public WebElement emailBox;

    @FindBy(xpath = "//*[@id='login-password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//*[@class='btn red radius-5 mt-4 w-100']")
    public WebElement loginBox;

    @FindBy(xpath = "(//a[text()='My courses'])[1]")
    public WebElement basariliGirisKontrolElementi;

}
