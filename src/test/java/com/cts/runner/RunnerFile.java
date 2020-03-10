package com.cts.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@CucumberOptions(features = { "src/main/resources/features/Categories.feature" }, glue = {
"com/cts/stepdefinitions" }, dryRun=false,
//strict = true,
plugin= {"html:reports/"},
monochrome = true)
@RunWith(Cucumber.class)
public class RunnerFile {

}

