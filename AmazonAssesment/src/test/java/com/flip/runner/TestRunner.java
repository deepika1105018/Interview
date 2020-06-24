package com.flip.runner;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)

@CucumberOptions(

		features = "./src/main/java/com/flip/features",

		glue = { "com/flip/steps" },

		dryRun = false,

		plugin = { "pretty", "html:target/Html-output", "junit:target/Junit-output/index.xml",
				"json:target/cucumber/cucumber.json" },

		monochrome = true,

		strict = true,

		tags = "@EndToEnd"

)

public class TestRunner  {

}
