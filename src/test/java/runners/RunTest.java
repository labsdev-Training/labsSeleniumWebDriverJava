package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {},
		features = "src/test/resource/features",
		tags = {"-@ignore"},
		glue = {"steps"}
		
)
public class RunTest {

}
