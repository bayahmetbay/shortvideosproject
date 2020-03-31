package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtons {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/radio_buttons");
        Thread.sleep(2000);
        List<WebElement> radiobuttons = driver.findElements(By.cssSelector("input[type='radio'"));
        for (WebElement radio: radiobuttons) {
            System.out.println(radio.getAttribute("id")+"-"+radio.isEnabled());
        }
        driver.quit();
    }
    }
