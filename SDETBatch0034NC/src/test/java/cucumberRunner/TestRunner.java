package cucumberRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = {"C:\\Users\\91900\\eclipse-workspace\\SDETBatch0034NC\\src\\test\\resources\\Features" }, 
		glue = "cucumberSteps",
		stepNotifications = true,
		tags = "@Smoke or @Regression",
		plugin = {"pretty", "html:NCRepot.html"}

)

public class TestRunner {

}
