package Selenium_lab;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test; 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class AppTest {
    WebDriver browser ;
    @BeforeEach
    public void open_browser(){
        System.setProperty("Webdriver.chrome.driver", "/home/kyp/Documents/2_semestre/TQS_92880/Lab3/Selenium_lab/chromedriver");  
        browser = new ChromeDriver();
    }
    @AfterEach
    public void close_browser(){
        browser.close();
    }
    @Test
    public void site_header_is_on_home_page() {
        browser.get("https://www.saucelabs.com"); 
        System.out.println("success");
        browser.manage().window().maximize();
        WebElement href = browser.findElement(By.xpath("//a[@href='https://accounts.saucelabs.com/']"));        
        assertTrue((href.isDisplayed()));      
    }
}