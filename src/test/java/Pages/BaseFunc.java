package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseFunc {
    private WebDriver driver;

    // grubo govorja - eto telo , na kotoroe primerjaem odezdu (iz primera pro odezdu).Eto moj driver, nabor funkcij. mu propisivaju funkciju i delaju vse cto nuzno. Eto zheest!!
    public BaseFunc() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Natella/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public WebElement getElement(By locator) {
        return driver.findElement(locator);
    }

    public void goToUrl (String url) {
        if (url.startsWith("http://") || url.startsWith("https://")) {

        } else {
            url = "http://" +url;
        }
        driver.get(url);
    }
}
