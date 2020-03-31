package tests;

import com.google.common.collect.BoundType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageTitle {
    public static void main(String[] args) throws Throwable{
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://google.com");
    Thread.sleep(3000);
    String title = driver.getTitle();
        System.out.println(title);
        driver.close();
    }
}
