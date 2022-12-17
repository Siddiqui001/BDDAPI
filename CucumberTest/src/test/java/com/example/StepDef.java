package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class StepDef extends ProdUtils {

	public WebDriver driver;
	Scenario scenario;
	String parentWindow;
	String childWindow;

	@Before()
	public void Start(Scenario scenario) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Binary/chromedriver.exe");
		driver = new ChromeDriver();
		this.scenario = scenario;
		System.out.println(scenario.getName());
		driver.manage().window().maximize();
	}

	@After
	public void tearDown(Scenario sc) {
		driver.quit();
	}

	@Given("Opened browser with Home page of hotels.com")
	public void i_want_to_write_a_step_with_precondition() {
		driver.get("https://www.hotels.com/");
		parentWindow=driver.getWindowHandle(); 
		driver.manage().window().maximize();
		embedScreenshot(driver, scenario);
	}

	@And("Verify the Sub Menu items {string}")
	public void some_other_precondition(String stringlist) {
		compareValuefromElementList(driver, "//ul[@class='secondary-section']/li/a", stringlist);
	}

	@And("Click on {string} link from home page")
	public void click_on_link_from_home_page(String link) {
		driver.findElement(By.xpath("//a[text()='" + link + "']")).click();
	}
	
	@Given("Verify if Flight&Hotel Link is Selected Already if not select it")
	public void verify_if_Flight_Hotel_Link_is_Selected_Already_if_not_select_it() {	
		
		for (String Child_Window : driver.getWindowHandles())  
		 {  
			if (Child_Window.equalsIgnoreCase(parentWindow)) {
				
			}else {
				driver.switchTo().window(Child_Window);
				WebElement ele=driver.findElement(By.xpath("//button[@id='tab-package-tab-hp']"));
				String atrVal=ele.getAttribute("data-initial-tab");
			    if (atrVal.equalsIgnoreCase("true")) {
			    	System.out.println("Already Selected..");
				}else {
					ele.click();
				}
			}
		   
		 
		 } 
// This comment from Mushtaq
// Comment from Mushtaq
		
	}
	
	@And("^Say Hello to New ONboarded Person \"([^\"]*)\"$")
    public void say_hello_to_new_onboarded_person_something(String name)  {
        System.out.println(name);
    }

}
