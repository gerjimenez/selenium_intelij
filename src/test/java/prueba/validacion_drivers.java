package prueba;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class validacion_drivers {

    public static void main(String[] args) {

        //validando edgedriver
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Gerardo Jimenez Diez\\drivers_webs\\edgedriver\\msedgedriver.exe");
        WebDriver driver_edge = new EdgeDriver();
        driver_edge.manage().window().maximize();
        driver_edge.get("https://www.google.com");
        // Para saltar primera pantalla
        driver_edge.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/span/div/div/div/div[3]/div[1]/button[2]")).click();

        // validando chrome driver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gerardo Jimenez Diez\\drivers_webs\\chromedriver\\chromedriver.exe");
        WebDriver driver_chrome = new ChromeDriver();
        driver_chrome.manage().window().maximize();
        driver_chrome.get("https://www.google.com");
        // driver_chrome.get("http://facebook.com");
        // Para saltar primera pantalla
        driver_chrome.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/span/div/div/div/div[3]/div[1]/button[2]")).click();

        // validando gecko driver
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Gerardo Jimenez Diez\\drivers_webs\\geckodriver\\geckodriver.exe");
        WebDriver driver_firefox = new FirefoxDriver();
        driver_firefox.manage().window().maximize();
        driver_firefox.get("https://www.google.com");
        // Para saltar primera pantalla
        driver_firefox.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/span/div/div/div/div[3]/div[1]/button[2]")).click();


    }
}
