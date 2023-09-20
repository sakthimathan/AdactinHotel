package PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class LoginPage extends Base {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement username;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(id = "login")
	private WebElement logbtn;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogbtn() {
		return logbtn;
	}

	public void loginhotel(String username, String password) {
		EnterText(getUsername(), username);
		EnterText(getPassword(), password);
		click(getLogbtn());

	}

	
}
