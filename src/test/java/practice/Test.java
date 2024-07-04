package practice;

import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Test {
	
	WebDriver driver;
	private void method() {

		driver.findElement(By.xpath(LoginXpath.userName)).sendKeys("ganesh");
		
	}

}
