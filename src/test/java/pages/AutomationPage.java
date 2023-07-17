package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationPage {
    public AutomationPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(className = "ns-p6tpp-e-16")
    public WebElement cookieClose;

    @FindBy(xpath = "//*[@class='fa fa-lock']")
    public WebElement signupButon;

    @FindBy(xpath = "//*[@data-qa='signup-name']")
    public WebElement nameBox;

    @FindBy(xpath = "//*[@data-qa='signup-email']")
    public WebElement emailBox;

    @FindBy(xpath = "//*[@data-qa='signup-button']")
    public WebElement singupBox;

    @FindBy(xpath = "//*[@id='id_gender1']")
    public WebElement titleBox;
}
