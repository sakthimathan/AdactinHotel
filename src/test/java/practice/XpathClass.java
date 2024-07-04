package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XpathClass {
	
	WebDriver driver;
	
	
private WebElement username(String user) {

WebElement username = driver.findElement(By.xpath("//input[contains(.,'"+user+"')]"));
return username;
}

private WebElement passWord(String pass) {

WebElement username = driver.findElement(By.xpath("//input[contains(.,'"+pass+"')]"));
return username;
}


private void performLogin(String name) {
	WebElement username = username("username");
	username.sendKeys(name);
	
}


}
