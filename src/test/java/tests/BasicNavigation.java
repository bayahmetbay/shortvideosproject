package tests;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args) throws Throwable{
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        String url = "http://google.com";
        String url2 = "http://amazon.com";
        driver.get(url);
        Thread.sleep(3000);
        driver.navigate().to(url2);
        Thread.sleep(3000);
        driver.navigate().back();

        driver.close();
                
    }
}