package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.QualitydemyPage;
import utilities.ConfigReader;

public class QdStepdefinitions {

    QualitydemyPage qdPage = new QualitydemyPage();

    @Then("anasayfada login linkine click yapar")
    public void anasayfada_login_linkine_click_yapar() {
        qdPage.loginButon.click();
    }

    @Then("email kutusuna {string} yazar")
    public void email_kutusuna_yazar(String istenenUsername) {
        qdPage.emailBox.sendKeys(ConfigReader.getProperty(istenenUsername));
    }

    @Then("password kutusuna {string} yazar")
    public void password_kutusuna_yazar(String istenenPassword) {
        qdPage.passwordBox.sendKeys(ConfigReader.getProperty(istenenPassword));

    }

    @When("login butonuna basar")
    public void login_butonuna_basar() {
        qdPage.loginBox.click();
    }

    @Then("basarili olarak giris yapildigini test eder")
    public void basarili_olarak_giris_yapildigini_test_eder() {
        Assert.assertTrue(qdPage.basariliGirisKontrolElementi.isDisplayed());
    }

    @Then("basarili olarak giris yapilamadigini test eder")
    public void basariliOlarakGirisYapilamadiginiTestEder() {
        Assert.assertTrue(qdPage.emailBox.isDisplayed());
    }

    @And("password kutusuna listeden {string} yazar")
    public void passwordKutusunaListedenYazar(String listedekiPassword) {
        qdPage.passwordBox.sendKeys(listedekiPassword);
    }

    @And("email kutusuna listeden {string} yazar")
    public void emailKutusunaListedenYazar(String listedekiEmail) {
        qdPage.passwordBox.sendKeys(listedekiEmail);
    }
}
