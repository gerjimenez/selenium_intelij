package prueba;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;

public class CapturaPantalla {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gerardo Jimenez Diez\\drivers_webs\\chromedriver\\chromedriver.exe");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--window-position=50,50");
        chromeOptions.addArguments("--window-size=1200,1300");

        WebDriver webDriver = new ChromeDriver( chromeOptions);

        webDriver.get("http://localhost:9080");

        webDriver.manage().window().maximize();

        File src = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);

        try{
            FileUtils.copyFile( src, new File( "C:/Users/Gerardo Jimenez Diez/image.png"));
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        webDriver.quit();
    }
}

