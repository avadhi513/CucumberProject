package com.manager;

import com.pages.BookHotelPage;
import com.pages.LogInPage;
import com.pages.RegisterPage;
import com.pages.SearchHotelPage;
import com.pages.SelectHotelPage;

public class PageObjectManager {

	private LogInPage logInPage;
	private RegisterPage registerPage;
	private SearchHotelPage searchHotelPage;
	private SelectHotelPage selectHotelPage;
	private BookHotelPage bookHotelPage;

	public LogInPage getLogInPage() {
		return (logInPage == null) ? logInPage = new LogInPage() : logInPage;
	}

	public RegisterPage getRegisterPage() {
		return (registerPage == null) ? registerPage = new RegisterPage() : registerPage;
	}

	public SearchHotelPage getSearchHotelPage() {
		return (searchHotelPage == null) ? searchHotelPage = new SearchHotelPage() : searchHotelPage;
	}

	public SelectHotelPage getSelectHotelPage() {
		return (selectHotelPage == null) ? selectHotelPage = new SelectHotelPage() : selectHotelPage;
	}

	public BookHotelPage getBookHotelPage() {
		return (bookHotelPage == null) ? bookHotelPage = new BookHotelPage() : bookHotelPage;
	}

}
