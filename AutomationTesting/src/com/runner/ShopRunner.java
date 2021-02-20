package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="feature",glue="com.capgemini.stepdef",dryRun=false,plugin={"pretty","json:target/cucumber.json","html:target/index.html"})
public class ShopRunner {
}