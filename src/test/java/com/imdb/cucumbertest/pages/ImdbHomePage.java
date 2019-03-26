package com.imdb.cucumbertest.pages;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.imdb.com")
public class ImdbHomePage extends PageObject {

	@FindBy(xpath = "//ul[@class='main_nav']/li/p[@class='navCategory'][1]")
	private WebElementFacade moviesAndTvShows;

	@FindBy(linkText = "Most Popular TV Shows")
	public WebElementFacade mostPopularTvShows;

	@FindBy(xpath = "//table/tbody/tr")
	private WebElement imdbRimdbTable;

	@FindBy(linkText = "Game of Thrones")
	public WebElementFacade showName;
	
	@FindBy(id = "imdb-signin-link")
	public WebElementFacade signInButton;

	public void move_mouse() {
		withAction().moveToElement(moviesAndTvShows).build().perform();
	}

	public void verifyRatings(double d) {
		for (int i=0;i<getImdbRatings().size();i++) {
			if(Double.parseDouble(getImdbRatings().get(i))==d) {
				System.out.println("Name of the top rated shows with rating "+d+" : "+getTopRatedShowsName().get(i));
			}
		}

	}

	public List<String> getImdbRatings() {
		return imdbRimdbTable.findElements(By.xpath("//td[contains(@class,'imdbRating')]")).stream()
				.map(element -> element.getText()).collect(Collectors.toList());
	}
	
	public List<String> getTopRatedShowsName() {
		return imdbRimdbTable.findElements(By.xpath("//td[@class='titleColumn']/a")).stream()
				.map(element -> element.getText()).collect(Collectors.toList());
	}

}