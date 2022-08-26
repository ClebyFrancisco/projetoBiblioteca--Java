package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

// informar que vamos utilizar o Cucumber
@RunWith(Cucumber.class)
// informar algumas opções de execução
@CucumberOptions(
        plugin = {},
        features = "src/test/resources/features",
        glue = {"steps"},
        tags = {}
)

public class RunCucumber {
}