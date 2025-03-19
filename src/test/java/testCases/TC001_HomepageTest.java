package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001_HomepageTest extends BaseClass {
	@Test
	public void homePage()
	{
		logger.info("***********Starting TC001_HomepageTest***************");
		HomePage hp=new HomePage(driver);
		hp.verifyTitle();
		hp.verifyLogo();
		hp.verifyHeader();
		hp.verifyImgText();
	}

}
