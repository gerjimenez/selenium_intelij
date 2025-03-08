package prueba;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Prueba {

    @Test ( priority = 11, description = "Examina la prueba 1")
    void pruebaInicial(){

        System.out.println("Prueba Inicial OK");
        Assert.assertEquals("uno", "dos");
    }

    @Test (priority = 12, description = "Examina la prueba 2")
    void pruebaDos(){

        System.out.println("Prueba2 Inicial OK");
        Assert.assertEquals("dos", "dos");
    }

    @Test (priority = 13,  description = "Examina la prueba 3")
    void pruebaTres(){

        System.out.println("Prueba3 Inicial OK");
        Assert.assertEquals("tres", "dos");
    }

    @Test (priority = 1,  description = "Evalúa el título del documento FAIL")
    void pruebaTitle(){

        ChromeOptions chrome_options = new ChromeOptions();
        chrome_options.addArguments("--headless");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gerardo Jimenez Diez\\drivers_webs\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(chrome_options);
        driver.get("http://wikipedia.org/");
        Assert.assertEquals(driver.getTitle() , "WebsiteSelenium");
        driver.quit();
    }

    @Test (priority = 2,  description = "Evalúa el título del documento OK")
    void pruebaTitle2(){

        ChromeOptions chrome_options = new ChromeOptions();
        chrome_options.addArguments("--headless");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gerardo Jimenez Diez\\drivers_webs\\chromedriver\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver(chrome_options);
        webDriver.get("http://localhost:9080");
        Assert.assertEquals(webDriver.getTitle() , "WebsiteSelenium");
        webDriver.quit();
    }

}
