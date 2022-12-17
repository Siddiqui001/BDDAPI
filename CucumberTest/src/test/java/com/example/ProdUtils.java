package com.example;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import cucumber.api.Scenario;

public class ProdUtils {
//hello
	public void compareValuefromElementList(WebDriver driver, String xpath, String stringlist) {
		// List<WebElement>
		// liofElements=driver.findElements(By.xpath("//ul[@class='secondary-section']/li/a"));
		List<WebElement> liofElements = driver.findElements(By.xpath(xpath));

		List<String> liofContentList = new ArrayList<String>();
		for (WebElement el : liofElements) {
			String value = el.getText();
			liofContentList.add(value);
		}
		String[] sArray = stringlist.split("%");

		for (int i = 0; i < sArray.length; i++) {
			int counter = 0;
			for (String strcomp : liofContentList) {
				if (strcomp.contains(sArray[i])) {
					counter++;
				}
			}
			if (counter == 0) {
				Assert.fail();
				break;
			}
		}

		System.out.println("We found all elements");
	}

	public void embedScreenshot(WebDriver driver, Scenario sc) {
		byte[] screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		sc.embed(screen, "image/png");

	}

}
// comment added by Mushtaq
