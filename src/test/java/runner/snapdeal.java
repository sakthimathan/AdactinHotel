package runner;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class snapdeal {
	public static  WebDriverWait wait;
	@Test(invocationCount = 5)
	public  void demo() {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.snapdeal.com/?logoutSuccess=success");
		Actions action =new Actions(driver);
		
		WebElement element = driver.findElement(By.xpath("(//a[@class='menuLinks leftCategoriesProduct ']/span[@class='catText'])[1]"));
		action.moveToElement(element).perform();
		wait.until(ExpectedConditions.visibilityOf(element));
		
		WebElement element2 = driver.findElement(By.xpath("(//span[@class='linkTest'])[2]"));
		wait.until(ExpectedConditions.visibilityOf(element2));
		wait.until(ExpectedConditions.elementToBeClickable(element2)).click();
		
			driver.findElement(By.xpath("//*[@id=\"634974558033\"]")).click();
		
		
//		
//		Set<String> handles = driver.getWindowHandles();
////	int count =0;	
////    for (String string : handles) {
////	if(count==1)
////	driver.switchTo().window(string);
////	count++;
////}		
//    List <String> list = new LinkedList<>();
//    list.addAll(handles);
//    for (int i = 0; i < list.size(); i++) {
//    	driver.switchTo().window(list.get(1));	
//	}
//		
//	}
	}

}
