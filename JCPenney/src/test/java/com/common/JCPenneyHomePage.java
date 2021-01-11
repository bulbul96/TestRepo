package com.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JCPenneyHomePage {

	public WebDriver driver;
	public WebDriver getdriver() {
		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.jcpenney.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}
}
