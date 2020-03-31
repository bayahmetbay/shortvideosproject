package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsPractice {
    public static void main(String[] args) throws  Throwable{
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        WebElement button3 = driver.findElement(By.name("button2"));
        button3.click();
        System.out.println(button3.getText());
        WebElement confirmationMessage = driver.findElement(By.id("result"));
        System.out.println(confirmationMessage.getText());
        String expectedMessage = "Clicked on button";
        String actualMessage = confirmationMessage.getText();
        if(expectedMessage.equals(actualMessage)){
            System.out.println("test passed");
        }else {
            System.out.println("test failed");
            Thread.sleep(2000);
            driver.close();
        }
    }
}
