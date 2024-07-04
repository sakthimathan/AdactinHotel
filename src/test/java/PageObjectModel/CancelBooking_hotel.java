package PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class CancelBooking_hotel extends Base {
	
	public CancelBooking_hotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "my_itinerary")
	private WebElement liternary;

	@FindBy(id = "check_all")
	private WebElement checkbox;

	@FindBy(xpath = "//input[@name='cancelall']")
	private WebElement cancelbtn;

	@FindBy(id = "logout")
	private WebElement logoutbtn;

	public WebElement getLiternary() {
		return liternary;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getCancelbtn() {
		return cancelbtn;
	}

	public WebElement getLogoutbtn() {
		return logoutbtn;
	}

	public void cancelbooking() {
		click(getLiternary());
		click(getCheckbox());
		click(getCancelbtn());

	}

	public void logout() {
		Alert();
		click(getLogoutbtn());

	}

}
