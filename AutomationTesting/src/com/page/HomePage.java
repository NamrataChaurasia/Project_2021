package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.base.TestBase;

public class HomePage extends TestBase {
	@FindBy(xpath="//a[contains(text(),'Shop')]")
	WebElement shop;
	@FindBy(xpath="//a[contains(text(),'Home')]")
	WebElement home;
	@FindBy(xpath="//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/img[1]")
	WebElement firstslide;
	@FindBy(xpath="//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/img[1]")
	WebElement secondslide;
	@FindBy(xpath="//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/img[1]")
	WebElement thirdslide;
	@FindBy(xpath="//*[@id=\"themify_builder_content-22\"]/div[2]/div/div/div/div/div[2]")
	WebElement arrivals;
	@FindBy(xpath="//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/img[1]")
	WebElement firstarrival;
	@FindBy(xpath="//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ul[1]/li[1]/a[1]/img[1]")
	WebElement secondarrival;
	@FindBy(xpath="//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ul[1]/li[1]/a[1]/img[1]")
	WebElement thirdarrival;
	@FindBy(xpath="//button[contains(text(),'Add to basket')]")
	WebElement addtobasket;
	@FindBy(xpath="//a[contains(text(),'Description')]")
	WebElement description;
	@FindBy(xpath="//a[contains(text(),'Reviews (0)')]")
	WebElement reviews;
//	@FindBys(value = { @FindBy(xpath = "//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]") })
//	List<WebElement> count;
//	
//	Actions action;
//	
	
	
	public HomePage() {
		init();
		PageFactory.initElements(driver,this);
	}
	public void clickShop() {
		shop.click();
	}
	public void clickhome() {
		home.click();
	}
	public void firstSlide() {
		firstslide.click();
	}
	public void secondSlide() {
		secondslide.click();
	}
	public void thirdSlide() {
		thirdslide.click();
	}
	public void showArrival() {
		arrivals.click();
	}
	public void firstArrival() {
		firstarrival.click();
	}
	public void secondArrival() {
		secondarrival.click();
	}
	public void thirdArrival() {
		thirdarrival.click();
	}
	public void moveBack() {
		driver.navigate().back();
	}
	public void addToBasket() {
		addtobasket.click();
	}
	public void desCription() {
		description.click();
	}
	public void reViews() {
		reviews.click();
	}
	/*
	 * public void countSlides() { System.out.println(count.size()); for(WebElement
	 * e:count) { System.out.println(e.getText());
	 * if(e.getText().contains("Automation Practice Site")){
	 * action.moveToElement(e.findElement(By.xpath("1"))).click().perform(); } } }
	 */
}
