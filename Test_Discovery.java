package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_Discovery {

	@Test
	public void clickOnButtons()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jay\\Downloads\\chromedriver_win32_72.0\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.discovery.com/");
		driver.manage().window().maximize();
		
		Page_Home homepage = new Page_Home(driver);
		
		homepage.moveToVideoAndClick();
		
		driver.get("https://www.discovery.com/my-videos");
		
		Page_MyVideo myvideoPage = new Page_MyVideo(driver);
		myvideoPage.verifyVideoTitleNDesc();
		
		driver.quit();
	}

}
