package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"html:target/cucumber-reports2.html",
                "json:target/json-reports/cucumber2.json",
                "junit:target/xml-report/cucumber2.xml"
        },
        features = "C:\\Users\\ihsan\\IdeaProjects\\team116_Cucumber\\src\\test\\resources",
        glue = "stepdefinitions",
        tags = "@regression",


        dryRun = true
)

public class ParalelRunner2 {
}
