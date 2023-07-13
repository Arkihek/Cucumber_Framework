package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        // plugin = "html:target/cucumber-reports.html", // Raporlama icin reports`dan sonra 1, 2 , 3 gibi yazarsak her test ayri ayri raporlanir
        plugin = {"html:target/cucumber-reports.html",
        "json:target/json-reports/cucumber.json",
        "junit:target/xml-report/cucumber.xml"
        }, // Jason rapor icin bu kodu giriyoruz. API ile ilgili buz raporunu makinaya gondermemiz gerekirse kullaniriz
        features = "C:\\Users\\ihsan\\IdeaProjects\\team116_Cucumber\\src\\test\\resources", // Hangi klasordeki testleri yapacak onun yolu
        glue = "stepdefinitions", // Steplerin oldugu klasor adi
        tags = "@wip", // Tagla hangi testleri calistirigimiz

        dryRun = false
)

public class Runner {


}
/*
    Runner class`i BOS bir class`dir
    Runner class`inin bize sagladigi islev
    Sahip oldugu 2 notasyon sayesindedir

    dryRun = true yaptigimizda
    var olan adimlari CALISTIRMADAN
    sadece eksik adimlari bulur ve onlarla ilgili stepdefinition`lari bize verir
 */
