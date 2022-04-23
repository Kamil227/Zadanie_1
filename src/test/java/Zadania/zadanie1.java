package Zadania;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/Cucumber/Features/zadanie1.feature",
        plugin = {
                "pretty",
                "html:out/zadanie1report.html"
        }
)


public class zadanie1 {




    }

