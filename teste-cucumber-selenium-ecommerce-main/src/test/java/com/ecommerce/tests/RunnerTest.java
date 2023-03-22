package com.ecommerce.tests;
import org.junit.ClassRule;
import org.junit.runner.RunWith;

import com.ecommerce.util.Hooks;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//RUNNER > FEATURES > STEPS > PAGES

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", tags = "@test", glue = {""}, 
	monochrome = true, dryRun = false, plugin = { "json:target/cucumber.json", "rerun:target/rerun.txt" })
public class RunnerTest {

	@ClassRule
	public static Hooks hooks = new Hooks();
}