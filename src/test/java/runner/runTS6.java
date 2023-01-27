package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/TS6-Card.feature",
        glue = "stepDefinition",
        plugin = "html:target/HTML_Report-TS6.html"
)
public class runTS6 {
}
