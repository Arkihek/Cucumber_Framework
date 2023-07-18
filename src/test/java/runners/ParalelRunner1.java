package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"html:target/cucumber-reports1.html",
                "json:target/json-reports/cucumber1.json",
                "junit:target/xml-report/cucumber1.xml"
        },
        features = "C:\\Users\\ihsan\\IdeaProjects\\team116_Cucumber\\src\\test\\resources",
        glue = "stepdefinitions",
        tags = "@smoke",


        dryRun = true
)

public class ParalelRunner1 {

}
