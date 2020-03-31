package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorXpathPart2 {
    public static void main(String[] args) throws Throwable{
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com");
        WebElement headerText = driver.findElement(By.xpath("//span[@class='h1y']"));
        WebElement contextMenuLink = driver.findElement(By.xpath("//a[.='Context Menu']"));
        System.out.println("h1 text: "+headerText.getText());
        contextMenuLink.click();
        Thread.sleep(3000);
        driver.close();
    }
}
