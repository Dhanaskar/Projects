package hashtagpage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import javax.swing.Action;
import javax.swing.Scrollable;
import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class hashtag {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      
	    //set the chromeDriver path by using system property
		System.setProperty("webdriver.chrome.driver","C:\\Dhana\\Drivers\\chromedriver_new\\chromedriver.exe");
		
		// Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//Explicitywait used to wait certain conditions
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		//Launch the URl
		driver.get("https://www.hashtag-ca.com/careers/apply?jobCode=QAE001");
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		//Enter the Name Field
		driver.findElement(By.name("name")).sendKeys("Dhanasekar");
		
		//Enter the Email Field
		driver.findElement(By.name("email")).sendKeys("dhana202603@gmail.com");
		
		//Enter the Phone Field
		driver.findElement(By.name("phone")).sendKeys("7010162258");
		
		//Enter the Notice period Field
		driver.findElement(By.xpath("//*[@id=\"contact-form\"]/div/div[5]/input")).sendKeys("30");
	    WebElement noticeperiod = driver.findElement(By.name("notice_time"));
        noticeperiod.clear();
        noticeperiod.sendKeys("30");
	      
        //Enter the Experience Field
        driver.findElement(By.xpath("//*[@id=\"contact-form\"]/div/div[6]/input")).sendKeys("3");
      
        //Upload the file in the Resume Field
        WebElement uploadfile = driver.findElement(By.id("inputFile"));
        uploadfile.sendKeys("C:\\Dhana\\Dhanasekar_Resume21.pdf");
      
    
      //Enter the Description Field
        driver.findElement(By.xpath("//*[@id=\"contact-form\"]/div/div[8]/textarea")).sendKeys("I have 3.2 years experience in manual testing.Experience in Testing the web and mobile based applications.Experience in writing test cases and execute the test cases.report the issue to the developer by using Bug tracking tool and tracking the issue till it get closed.");
     
        Thread.sleep(5000);
      
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");

        
        //To click the apply now button
        WebElement m = driver.findElement(By.cssSelector(".btn.form-button.font-12.font-bold"));
                
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".btn.form-button.font-12.font-bold")));
           m.click();
        
           
     
	}
		
		

}
