package prueba;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class SelectorID {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gerardo Jimenez Diez\\drivers_webs\\chromedriver\\chromedriver.exe");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--window-position=50,50");
        chromeOptions.addArguments("--window-size=1200,1300");

        WebDriver webDriver = new ChromeDriver( chromeOptions);

        webDriver.get("http://localhost:9080");

        WebElement element = webDriver.findElement(By.id("headline_history"));

        String titulo = element.getText();
        System.out.println(titulo);

        List<WebElement> elementos = webDriver.findElements(By.className("headline"));

        for ( WebElement elemento : elementos){
            System.out.println( elemento.getText());
        }

        System.out.println("----------------------------------");

        List<WebElement> elementos2 = webDriver.findElements(By.tagName("section"));

        for ( WebElement elemento : elementos2){
            System.out.println( elemento.getText());
        }

        System.out.println("----------------------------------");

        List<WebElement> elementos3 = webDriver.findElements(By.name("email"));

        for ( WebElement elemento : elementos3){
            System.out.println( elemento.getAttribute( "placeholder"));
        }

        System.out.println("----------------------------------");

        List<WebElement> elementos4 = webDriver.findElements(By.xpath("//*[@id=\"people\"]"));

        for ( WebElement elemento : elementos4){
            System.out.println( elemento.getText());
        }
        System.out.println("----------------------------------");

        for ( WebElement elemento : elementos4){
            System.out.println( elemento.getCssValue( "font-family"));
        }
        System.out.println("----------------------------------");

        List<WebElement> elementos5 = webDriver.findElements(By.xpath("//*[@id=\"people\"]/div/div/div[3]/div/h3"));

        for ( WebElement elemento : elementos5){
            System.out.println( elemento.getText());
        }








    }
}
