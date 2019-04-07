package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

public class Page_MyVideo {
	
	WebDriver driver;
	String ExpVideo2Title = "NAKED AND AFRAID";
	String ExpVideo2Desc = "What happens when you put two complete strangers - sans clothes - in some of the most extreme environments…";
	
	String ExpVideo1Title = "Alaskan Bush People";
	String ExpVideo1Desc = "Deep in the Alaskan wilderness lives a newly discovered family who was born and raised wild. Billy Brown, his wife…";
	
	By moveToFav =By.xpath("//h2[contains(text(),'Favorite')]") ;
	By moveToVideo1 = By.xpath("//h2[contains(text(),'Favorite')]//following::div[@class='' and text()='Alaskan Bush People']");
	By moveToVideo2 = By.xpath("//h2[contains(text(),'Favorite')]//following::div[@class='' and text()='Naked and Afraid']") ;
	By getTitle1 = By.xpath("//div[@class='' and text()='Alaskan Bush People']");
	By getTitle2 = By.xpath("//div[@class='' and text()='Naked and Afraid']");
	By getDesc1 = By.xpath("(//div[@class='' and text()='Alaskan Bush People'])[1]//following::div[@class=''][1]");
	By getDesc2 = By.xpath("(//div[@class='' and text()='Naked and Afraid'])[1]//following::div[@class=''][1]") ;
	
	
	public Page_MyVideo(WebDriver driver){
		
		this.driver = driver;
	}

	
	public void verifyVideoTitleNDesc(){
	
	WebElement moveToFavSec = driver.findElement(moveToFav);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true)",moveToFavSec);
	
	Actions action = new Actions(driver);
	
	WebElement verify_video1 = driver.findElement(moveToVideo1);
	action.moveToElement(verify_video1).perform();
	
	WebElement verify_video2 = driver.findElement(moveToVideo2);
	action.moveToElement(verify_video2).perform();
	
	String actualTitle1 = driver.findElement(getTitle1).getText();
	String actualDesc1 = driver.findElement(getDesc1).getText();
	String actualTitle2 = driver.findElement(getTitle2).getText();
	String actualDesc2 = driver.findElement(getDesc2).getText();
	
	
	SoftAssert assertion = new SoftAssert();
	assertion.assertEquals(actualTitle2,ExpVideo2Title);
	assertion.assertEquals(actualDesc2,ExpVideo2Desc);
	assertion.assertAll();
	assertion.assertEquals(actualTitle1,ExpVideo1Title);
	assertion.assertEquals(actualDesc1,ExpVideo1Desc);
	
}}
