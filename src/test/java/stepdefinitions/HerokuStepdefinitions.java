package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HerokuPage;

public class HerokuStepdefinitions {
    HerokuPage herokuPage = new HerokuPage();

    @When("Add Element butonuna basar")
    public void add_element_butonuna_basar() {
        herokuPage.addButonu.click();
    }

    @And("Delete butonunu gorunceye kadar bekler")
    public void deleteButonunuGorunceyeKadarBekler() {
        // implicitly wait suresi yeterli oldugu icin bu adima kod yazilmadi
    }

    @Then("Delete butonunun gorunur oldugunu test eder")
    public void delete_butonunun_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(herokuPage.deleteButonu.isDisplayed());
    }

    @Then("Delete butonuna basarak butonu siler")
    public void delete_butonuna_basarak_butonu_siler() {
        herokuPage.deleteButonu.click();
    }

    @Then("Delete butonunun gorunmedigini test eder")
    public void delete_butonunun_gorunmedigini_test_eder() {

        try {
            Assert.assertFalse(herokuPage.deleteButonu.isDisplayed());
        } catch (Exception e) {
            Assert.assertTrue(true);
            // catch blogu calistiysa,
            // delete butonu bulunamadi yani testimiz PASSED oldu demektir
            // 36. satirda yazdigimiz kod, sadece %100 passed olacak bir assertion`dir.
        }

        // Assert.assertFalse(herokuPage.deleteButonu.isDisplayed());
        // element olmadigi icin locate etmemiz mumkun degil
        // dolayisiyla da NoSuchElementEception aliyoruz

    }


}
