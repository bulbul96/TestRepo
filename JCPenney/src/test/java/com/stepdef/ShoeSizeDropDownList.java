package com.stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ShoeSizeDropDownList{
	
	WebDriver driver;

@Given("^Navigate to JCPenney Home page$")
public void navigate_to_JCPenney_Home_page() throws Throwable {
 
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.jcpenney.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
}

@When("^I click on Men link$")
public void i_click_on_Men_link() throws Throwable {
 //WebElement MenLink=driver.findElement(By.linkText("Men"));
 //MenLink.click();
   WebElement MenLink=driver.findElement(By.xpath("/html/body/div[1]/main/header/div/div[2]/div/div/div/div/ul/li[4]/div"));
   MenLink.click();
}

@When("^I choose Men Shoes$")
public void i_choose_Men_Shoes() throws Throwable {
	
 //WebElement Shoeslink=driver.findElement(( By.xpath("/html/body/div[1]/main/header/div/div[2]/div/div/div/div[2]/div[2]/div[2]/ul/li[11]/a")).click();
	WebElement Shoes=driver.findElement(By.linkText("Shoes"));
	Shoes.click();
	
   
}

@When("^I click on a Shoe item$")
public void i_click_on_a_Shoe_item() throws Throwable {
 WebElement ShoeItem=driver.findElement(By.xpath("/html/body/div[1]/main/article/div[5]/div[4]/div/div[2]/section/div[1]/div/div[1]/div/ul/li[2]/div/div/div/div/div[1]/div/a/div/div/img"));
		 ShoeItem.click();
   
}

@Then("^I find the Shoe size drop down list$")
public void i_find_the_Shoe_size_drop_down_list() throws Throwable {
 
  // boolean select=driver.findElement(By.xpath("/html/body/div[1]/main/article/section/section[3]/div[2]/section[2]/section/div[2]/div[2]/div[2]/div[1]/select")).isDisplayed();
  // boolean DropDownList1=driver.findElement(By.xpath("/html/body/div[1]/main/article/section/section[3]/div[2]/section[2]/section/div[2]/div[2]/div[2]/div[1]/select")).isSelected();
   //DropDownList.click();*/
	Select size=new Select(driver.findElement(By.id("size")));
	//List<WebElement>Options=select.findElement(By.tagName(size));
			size.selectByVisibleText("Select a Size");
			
}
}