package prueba;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class RatonTeclado {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gerardo Jimenez Diez\\drivers_webs\\chromedriver\\chromedriver.exe");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--window-position=50,50");
        chromeOptions.addArguments("--window-size=1200,1300");

        WebDriver webDriver = new ChromeDriver( chromeOptions);

        webDriver.get("http://localhost:9080");

        /* WebElement boton = webDriver.findElement(By.id("clear_bottom"));
        boton.click();

        Alert alerta = webDriver.switchTo().alert();
        System.out.println(alerta.getText()); */

        /* WebElement imagen = webDriver.findElement(By.id("vitamin_a"));

        Actions action = new Actions(webDriver);
        action.moveToElement(imagen).build().perform();

        Alert alerta1 = webDriver.switchTo().alert();
        System.out.println(alerta1.getText()); */

        WebElement documento = webDriver.findElement(By.tagName("body"));
        documento.sendKeys(Keys.ENTER);

        Alert alerta2 = webDriver.switchTo().alert();
        System.out.println(alerta2.getText());





    }
}
