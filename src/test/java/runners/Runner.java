package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        // plugin = "html:target/cucumber-reports.html", // Raporlama icin reports`dan sonra 1, 2 , 3 gibi yazarsak her test ayriayri raporlanir
        plugin = {"html:target/cucumber-reports.html",
        "json:target/json-reports/cucumber.json",
        "junit:target/xml-report/cucumber.xml"
        }, // Jason rapor icin bu kodu giriyoruz. API ile ilgili buz raporunu makinaya gondermemiz gerekirse kullaniriz
        features = "C:\\Users\\ihsan\\IdeaProjects\\team116_Cucumber\\src\\test\\resources", // Hangi klasordeki testleri yapacak onun yolu
        glue = "stepdefinitions", // Steplerin oldugu klasor adi
        tags = "@smoke", // Tagla hangi testleri calistirigimiz


        dryRun = true
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

    features = "C:\\Users\\ihsan\\IdeaProjects\\team116_Cucumber\\src\\test\\resources",
    glue = "stepdefinitions",

    bu iki klasor birbiriyle ilisiklendirildigi icin
    bu klasorlerin altindaki tum file`lar ve class`lar ilisiklidir
    Cucumber da file ve class`lari 1-1 eslestirmek yerine
    tumunu eslestirir

    Eger siz spesifik olarak 1 feature`i
    belirlediginiz 1 stepdefinition class`i ile calismasini isterseniz
    Runner class`inda bu eslesmeyi yapabilirsiniz

 */
