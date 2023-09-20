package PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class Book_hotel extends Base {

	public Book_hotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "first_name")
	private WebElement Firstname;

	@FindBy(id = "last_name")
	private WebElement Lastname;

	@FindBy(id = "address")
	private WebElement BillingAddress;

	@FindBy(id = "cc_num")
	private WebElement CcardNumber;

	@FindBy(id = "cc_type")
	private WebElement CcardType;

	@FindBy(id = "cc_exp_month")
	private WebElement ExpiryDateM;

	@FindBy(id = "cc_exp_year")
	private WebElement ExpiryDateY;

	@FindBy(id = "cc_cvv")
	private WebElement cvv;

	@FindBy(id = "book_now")
	private WebElement clickbookbtn;

	public WebElement getClickbookbtn() {
		return clickbookbtn;
	}

	public WebElement getFirstname() {
		return Firstname;
	}

	public WebElement getLastname() {
		return Lastname;
	}

	public WebElement getBillingAddress() {
		return BillingAddress;
	}

	public WebElement getCcardNumber() {
		return CcardNumber;
	}

	public WebElement getCcardType() {
		return CcardType;
	}

	public WebElement getExpiryDateM() {
		return ExpiryDateM;
	}

	public WebElement getExpiryDateY() {
		return ExpiryDateY;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public void userdeatials(String Firstname, String Lastname, String BillingAddress, String CcardNumber,
			String CcardType, String ExpiryDateM, String ExpiryDateY, String cvv) {
		EnterText(getFirstname(), Firstname);
		EnterText(getLastname(), Lastname);
		EnterText(getBillingAddress(), BillingAddress);
		EnterText(getCcardNumber(), CcardNumber);
		selectbyvisible(getCcardType(), CcardType);
		selectbyvisible(getExpiryDateM(), ExpiryDateM);
		selectbyvisible(getExpiryDateY(), ExpiryDateY);
		EnterText(getCvv(), cvv);
	}

	public void clickbutn() {
		click(getClickbookbtn());
	}

}
