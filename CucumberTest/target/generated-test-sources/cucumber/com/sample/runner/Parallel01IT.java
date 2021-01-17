package com.sample.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        strict = true,
        features = {"E:/MyFramework/WorkSpace/CucumberTest/src/test/resources/FeatureFiles/mine.feature"},
        plugin = {"json:E:/MyFramework/WorkSpace/CucumberTest/target/cucumber-parallel/1.json", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        monochrome = true,
        tags = {"@tag1"},
        glue = {"com.example"})
public class Parallel01IT extends AbstractTestNGCucumberTests {
}
