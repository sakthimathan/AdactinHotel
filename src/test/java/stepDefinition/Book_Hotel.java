package stepDefinition;

import PageObjectManager.Page_Obect_Manager;
import io.cucumber.java.en.Then;

public class Book_Hotel {
	Page_Obect_Manager pom = new Page_Obect_Manager();

	@Then("user enter the following depends {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_enter_the_following_depends(String Firstname, String Lastname, String BillingAddress,
			String CcardNumber, String CcardType, String ExpiryDateM, String ExpiryDateY, String cvv) {
		pom.getBook_hotel().userdeatials(Firstname, Lastname, BillingAddress, CcardNumber, CcardType, ExpiryDateM,
				ExpiryDateY, cvv);

	}

	@Then("user click the BookNow button")
	public void user_click_the_book_now_button() {
		pom.getBook_hotel().clickbutn();
	}

}
