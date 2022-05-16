package com.project.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//resources//Features",
                     glue = "com.project.stepdefinition",
                   plugin = {"html:target","json:target/reports.json"},
               monochrome = true,
                   dryRun = false,
                     tags = {"@sanity","@smoke"})  

public class TestRunner {

}
