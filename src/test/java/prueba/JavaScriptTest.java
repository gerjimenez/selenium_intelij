package prueba;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JavaScriptTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gerardo Jimenez Diez\\drivers_webs\\chromedriver\\chromedriver.exe");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--window-position=50,50");
        chromeOptions.addArguments("--window-size=1200,1300");

        WebDriver webDriver = new ChromeDriver( chromeOptions);

        webDriver.get("http://localhost:9080");

        JavascriptExecutor js = (JavascriptExecutor) webDriver;

        js.executeScript( " window.scrollTo(0,  document.body.scrollHeight)");
        js.executeScript( "alert ('Hello World')");

    }
}

