package com.cucumber.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)  
@CucumberOptions(
		 
		  features = {"src/test/resources/features/Login.feature"},
		  glue = "com.cucumber.stepdefs",
		  dryRun=true,
		  monochrome=true,
		  plugin = { "pretty","html:test-output"  
				  
		  } 
		  
		  
		  )

public class TestRun {
	

}


