package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Page_Home {
	
	WebDriver driver;
	By recommendedsec = By.xpath("//div[contains(text(),'Recommended')]");
	By moveToVideo1 = By.xpath("//div[contains(text(),'Recommended')]//following::div[@class='' and text()='Alaskan Bush People']");
	By moveToVideo2 = By.xpath("//div[contains(text(),'Recommended')]//following::div[@class='' and text()='Naked and Afraid']");
	By clickOnFav1 = By.xpath("//div[@class='my-favorites-button-container']//span");
	By clickOnFav2 = By.xpath("(//div[@class='my-favorites-button-container']//span)[2]");
	
	
	public Page_Home(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void moveToVideoAndClick()
	{
		WebElement element = driver.findElement(recommendedsec);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		Actions action = new Actions(driver);
		
		WebElement video1 = driver.findElement(moveToVideo1);
		action.moveToElement(video1).perform();
		
		driver.findElement(clickOnFav1).click();
		
		
		WebElement video2 = driver.findElement(moveToVideo2);
		action.moveToElement(video2).perform();
		
		driver.findElement(clickOnFav2).click();
		
		
	}

}
