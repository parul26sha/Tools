package com.wbl.Cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features= {"src/main/features"},
glue= {"com.wbl.stepDefinations"},
dryRun=true)
public class RunCukesTest {

}
