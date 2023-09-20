package PageObjectManager;

import PageObjectModel.Book_hotel;
import PageObjectModel.LoginPage;
import PageObjectModel.Search_hotel_Page;
import PageObjectModel.Select_hotel;

public class Page_Obect_Manager {

	private LoginPage loginPage;
	private Search_hotel_Page search_hotel_Page;
	private Select_hotel select_hotel;
	private Book_hotel book_hotel;

	public Book_hotel getBook_hotel() {
		return (book_hotel == null) ? book_hotel = new Book_hotel() : book_hotel;
	}

	public Select_hotel getSelect_hotel() {
		return (select_hotel == null) ? select_hotel = new Select_hotel() : select_hotel;
	}

	public LoginPage getloginPage() {
		return (loginPage == null) ? loginPage = new LoginPage() : loginPage;
	}

	public Search_hotel_Page getSearch_Hotel() {
		return (search_hotel_Page == null) ? search_hotel_Page = new Search_hotel_Page() : search_hotel_Page;
	}

}
