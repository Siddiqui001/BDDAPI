package com.sample.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/*@RunWith(Cucumber.class)
@CucumberOptions(features ="src\\test\\resources\\FeatureFiles" ,glue={"com.sample.selenium"})*/


@CucumberOptions(
      
        features = {"src/test/resources/FeatureFiles"},
        plugin = {"json:target/cucumber-parallel/1.json"},
        monochrome = true,
        tags = "@smoke",
        glue = {"com.example"})
public class RunnerClass extends AbstractTestNGCucumberTests {

}
