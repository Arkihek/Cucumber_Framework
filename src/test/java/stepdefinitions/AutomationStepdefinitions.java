package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AutomationPage;
import utilities.Driver;

public class AutomationStepdefinitions {

    AutomationPage automationPage = new AutomationPage();


    @Given("user sign up linkine tiklar")
    public void user_sign_up_linkine_tiklar() {
        automationPage.signupButon.click();
    }

    @Given("user Create an account bölümüne email adresi girer")
    public void user_create_an_account_bölümüne_email_adresi_girer() {
        Faker faker = new Faker();

        automationPage.nameBox.sendKeys(faker.name().name());
        automationPage.emailBox.sendKeys(faker.internet().emailAddress());
    }

    @Given("signUp butonuna basar")
    public void sign_up_butonuna_basar() {
        automationPage.singupBox.click();
    }

    @Given("user kisisel bilgilerini ve iletisim bilgilerini girer")
    public void user_kisisel_bilgilerini_ve_iletisim_bilgilerini_girer() {
        Faker faker = new Faker();
        Actions actions = new Actions(Driver.getDriver());
        actions.click(automationPage.titleBox).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(faker.internet().password()).sendKeys(Keys.TAB).


    }

    @Given("user Create Account butonuna basar")
    public void user_create_account_butonuna_basar() {

    }

    @Then("hesap olustugunu test edin")
    public void hesap_olustugunu_test_edin() {

    }

    }
}
