package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatorsCSS {
    public static void main(String[] args) throws Throwable {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/registration_form");
        driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("James");
        driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Bond");
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("supersdet");
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("email@cybertekschool.com");
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("qwerty123456");
        driver.findElement(By.cssSelector("input[name='phone']")).sendKeys("777-777-7777");
        driver.findElement(By.cssSelector("input[name='birthday']")).sendKeys("10/11/2000");
        driver.findElement(By.cssSelector("input[value='male']")).click();
        Select select = new Select(driver.findElement(By.cssSelector("select[name='department']")));
        select.selectByVisibleText("Accounting Office");
        Select select1 = new Select(driver.findElement(By.cssSelector("select[name='job_title']")));
        select1.selectByVisibleText("SDET");
        driver.findElement(By.id("wooden_spoon")).click();
        Thread.sleep(3000);
        driver.quit();
    }
}
