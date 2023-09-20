package PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class Select_hotel extends Base {

	public Select_hotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "radiobutton_0")
	private WebElement radiobtn;

	@FindBy(id = "continue")
	private WebElement Continuebtn;

	public WebElement getRadiobtn() {
		return radiobtn;
	}

	public WebElement getContinuebtn() {
		return Continuebtn;
	}

	public void selecthotel() {
		click(getRadiobtn());

	}

	public void selectclick() {
		click(getContinuebtn());

	}

}
