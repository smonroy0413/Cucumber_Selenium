package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/java/Features",
        glue = ("PruebaTest1")
)

public class test1runner {
}

