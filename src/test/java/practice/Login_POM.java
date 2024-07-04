package practice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_POM {

	@FindBy(id="username")
	private WebElement username;

	public WebElement getUsername() {
		return username;
	}

	
}
