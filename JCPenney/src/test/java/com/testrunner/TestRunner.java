package com.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


	@CucumberOptions(
			features= {"feature"},
			glue="com.stepdef",
			tags="@ShoeSizeDropDownList",
			plugin="pretty",
			monochrome=true
			
			)


	public class TestRunner extends AbstractTestNGCucumberTests{
		

	}


