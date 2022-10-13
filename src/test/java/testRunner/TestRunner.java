package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ={"src/test/resources/features"},
        glue = {"org.example.stepDefinitions"},
        tags = "@SC3 or @SC1 or @SC2",

        plugin = { "pretty","html:target/report.html"}
)
public class TestRunner {

}
