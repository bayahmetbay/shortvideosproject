package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Checkboxes {
    public static void main(String[] args) throws Exception{
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/checkboxes");
 //       Thread.sleep(2000);
 //       driver.findElement(By.cssSelector("input[type='checkbox']:nth-of-type(1)")).click();
 //       Thread.sleep(2000);
 //       driver.findElement(By.cssSelector("input[type='checkbox']:nth-of-type(2)")).click();
 //       Thread.sleep(2000);
        List<WebElement> checkboxes = driver.findElements(By.tagName("input"));
        for (WebElement checkbox: checkboxes){
            Thread.sleep(2000);
            if(!checkbox.isSelected()){
                checkbox.click();
            }
        }
        driver.quit();
    }
    }
