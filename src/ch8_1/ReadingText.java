package ch8_1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadingText {
	protected WebDriver driver;
	private static String baseUrl = "https://omayo.blogspot.com/";
	private By disabledButton = By.xpath(".//button[@id=\"but1\" and @disabled]");
	private By textArea = By.xpath("//textarea[@id=\"ta1\"]");
	
	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl);
		System.out.println("The browser has been opened");
	}
	
	@Test (priority = 1)
	public void getDisableBtnText() {
		WebElement btn = driver.findElement(disabledButton);
		System.out.println("Successfully found disabled button element.");
		
		String buttonText = btn.getText();
		System.out.println("Disabled Button Text: " + buttonText);
	}
	
	@Test (priority = 1)
	public void testTextAreaField() {
		WebElement textAreaE = driver.findElement(textArea);
		System.out.println("Successfully found text Area element.");
		
		textAreaE.sendKeys("Hello, I'm Abdullah Muhaisen",Keys.RETURN);
		System.out.println("Successfully sent text in text Area element.");
	}
	
	@AfterTest
	public void tearDown() {
		System.out.println("The browser has been closed!");
		if(driver!=null) {
			driver.quit();
		}
	}
}
