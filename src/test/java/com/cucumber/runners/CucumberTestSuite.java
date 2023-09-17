package com.cucumber.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

// requires Junit 4

  @RunWith(CucumberWithSerenity.class)  
  @CucumberOptions(
		  plugin = { "pretty" }, 
		  features = {"src/test/resources/features"},
  		  glue = "com.cucumber.stepdefs"
  )
  public class CucumberTestSuite {
  
  }
 
 
