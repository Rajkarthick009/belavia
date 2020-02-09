package com.runner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"json:src\test\resources\report features"}, features= {"src/test/resources"},glue = {"com.stepdefinition"})
public class Testrunner {

}
