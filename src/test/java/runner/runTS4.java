package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/TS4-Team.feature",
        glue = "stepDefinition",
        plugin = "html:target/HTML_Report-TS4.html"
)
public class runTS4 {
}
