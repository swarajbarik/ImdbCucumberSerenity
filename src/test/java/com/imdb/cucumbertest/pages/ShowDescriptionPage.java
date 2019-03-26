package com.imdb.cucumbertest.pages;

import static org.junit.Assert.assertTrue;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ShowDescriptionPage extends PageObject{

	@FindBy(xpath = "//div[@class='title_wrapper']/h1")
	private WebElementFacade showTitle;
	
	
	@FindBy(xpath = "//span[@class='widget_header']/span/a/h3[contains(text(),'What')]")
	private WebElementFacade knowAboutShow;
	
	
	@FindBy(xpath = "//div[@id='ratingWidget']/p/strong")
	private WebElementFacade ratingWidget;
	
	public void verifyShowDescription(String showName) {
		System.out.println("Show Title : "+showTitle.getText());
		assertTrue(showTitle.getText().contains(showName));
		assertTrue(knowAboutShow.getText().contains(showName));
		assertTrue(ratingWidget.getText().contains(showName));
	}

}
