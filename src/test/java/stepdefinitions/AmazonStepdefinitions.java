package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.security.Key;

public class AmazonStepdefinitions {

    AmazonPage amazonPage = new AmazonPage();

    @Given("kullanici amazon anasayfaya gider")
    public void kullanici_amazon_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }

    @Then("arama kutusuna Nutella yazip, ENTER tusuna basar")
    public void arama_kutusuna_nutella_yazip_enter_tusuna_basar() {
        amazonPage.aramaKutusu.sendKeys(ConfigReader.getProperty("amazonArananKelime") + Keys.ENTER);
    }

    @Then("arama sonuclarinin Nutella icerdigini test eder")
    public void arama_sonuclarinin_nutella_icerdigini_test_eder() {
        String actualIcerik = amazonPage.sonucYaziElementi.getText();
        String expectedIcerik = "Nutella";

        Assert.assertTrue(actualIcerik.contains(expectedIcerik));
    }

    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }

    @Then("arama kutusuna Samsung yazip, ENTER tusuna basar")
    public void aramaKutusunaSamsungYazipENTERTusunaBasar() {
        amazonPage.aramaKutusu.sendKeys(ConfigReader.getProperty("samsungArananKelime") + Keys.ENTER);
    }

    @And("arama sonuclarinin Samsung icerdigini test eder")
    public void aramaSonuclarininSamsungIcerdiginiTestEder() {
        String actualIcerik = amazonPage.sonucYaziElementi.getText();
        String expectedIcerik = "Samsung";

        Assert.assertTrue(actualIcerik.contains(expectedIcerik));
    }

    @Then("arama kutusuna Java yazip, ENTER tusuna basar")
    public void aramaKutusunaJavaYazipENTERTusunaBasar() {
        amazonPage.aramaKutusu.sendKeys(ConfigReader.getProperty("javaArananKelime") + Keys.ENTER);
    }

    @And("arama sonuclarinin Java icerdigini test eder")
    public void aramaSonuclarininJavaIcerdiginiTestEder() {
        String actualIcerik = amazonPage.sonucYaziElementi.getText();
        String expectedIcerik = "Java";

        Assert.assertTrue(actualIcerik.contains(expectedIcerik));
    }

    @Then("arama kutusuna {string} yazip, ENTER tusuna basar")
    public void aramaKutusunaAppleYazipENTERTusunaBasar(String aranacakUrun) {
        amazonPage.aramaKutusu.sendKeys(aranacakUrun + Keys.ENTER);
    }

    @And("arama sonuclarinin {string} icerdigini test eder")
    public void aramaSonuclarininAppleIcerdiginiTestEder(String arananIcerik) {
        String actualIcerik = amazonPage.sonucYaziElementi.getText();

        Assert.assertTrue(actualIcerik.contains(arananIcerik));
    }

    @And("{int} saniye bekler")
    public void saniyeBekler(int beklemeSuresi) {
        try {
            Thread.sleep(beklemeSuresi*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    @Given("kullanici {string} anasayfaya gider")
    public void kullaniciAnasayfayaGider(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));

    }

    @When("ilk urunu tiklar")
    public void ilk_urunu_tiklar() {
        amazonPage.ilkkUrunElementi.click();

    }
    @Then("urun isminde {string} oldugunu test eder")
    public void urun_isminde_oldugunu_test_eder(String istenenIcerik) {
        Assert.assertTrue(amazonPage.urunIsimElementi.getText().contains(istenenIcerik));
    }

}
