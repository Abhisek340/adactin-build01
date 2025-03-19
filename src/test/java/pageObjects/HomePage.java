package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage  extends BasePage{
//constructor
	public HomePage(WebDriver driver) {
		super(driver);
		
		
	}
	String title=driver.getTitle();
	//locators
	@FindBy(xpath="//img[@class='logo']") WebElement logo;
	@FindBy(xpath="//p[text()='Adactin Launches The Adactin Hotel App! ']") WebElement header;
	@FindBy(xpath="//img[@alt='Hotel Image 3']") WebElement imgText;
	//action method
	public void verifyLogo()
	{
		if(logo.isDisplayed())
		{
			System.out.println("logo verified sucessfully");
		}
		else {
			System.out.println("logo is not verified");
		}
	}
	public void verifyHeader()
	{
		if(header.isDisplayed())
		{
			System.out.println("header verified");
		}
		else {
			System.out.println("header not verified");
		}
	}
	public void verifyImgText()
	{
		if(imgText.isDisplayed())
		{
			System.out.println("image text verified");
		}
		else {
			System.out.println("image text not verified");
		}
	}
	//general method
	public void verifyTitle()
	{
		if(title.equals(title))
		{
			System.out.println("Title verified");
		}
		else {
			System.out.println("Title not vrified");
		}
	}
	

}
