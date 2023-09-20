package PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class Search_hotel_Page extends Base {
	
	public Search_hotel_Page() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "location")
	private WebElement Location;

	@FindBy(id = "hotels")
	private WebElement Hotels;

	@FindBy(name = "room_type")
	private WebElement Roomtype;

	@FindBy(id = "room_nos")
	private WebElement NoOfRooms;

	@FindBy(id = "datepick_in")
	private WebElement Checkin;

	@FindBy(id = "datepick_out")
	private WebElement Checkout;

	@FindBy(id = "adult_room")
	private WebElement AdultsperRoom;

	@FindBy(id = "child_room")
	private WebElement ChilderPerRoom;

	@FindBy(id = "Submit")
	private WebElement SearchBtn;

	public WebElement getSearchBtn() {
		return SearchBtn;
	}

	public WebElement getLocation() {
		return Location;
	}

	public WebElement getHotels() {
		return Hotels;
	}

	public WebElement getRoomtype() {
		return Roomtype;
	}

	public WebElement getNoOfRooms() {
		return NoOfRooms;
	}

	public WebElement getCheckin() {
		return Checkin;
	}

	public WebElement getCheckout() {
		return Checkout;
	}

	public WebElement getAdultsperRoom() {
		return AdultsperRoom;
	}

	public WebElement getChilderPerRoom() {
		return ChilderPerRoom;
	}

	public void searchhotel(String Location, String Hotels, String Roomtype, String NoOfRooms, String checkin,
			String checkout, String AdultsperRoom, String ChilderPerRoom) {
		selectbyvalue(getLocation(), Location);
		selectbyvalue(getHotels(), Hotels);
		selectbyvisible(getRoomtype(), Roomtype);
		selectbyvisible(getNoOfRooms(), NoOfRooms);
		EnterText(getCheckin(), checkin);
		EnterText(getCheckout(), checkout);
		
		selectbyvisible(getAdultsperRoom(), AdultsperRoom);
		selectbyvisible(getChilderPerRoom(), ChilderPerRoom);
	}

	public void clickbrtn() {
		click(getSearchBtn());
	}

}
