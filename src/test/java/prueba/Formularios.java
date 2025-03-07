package prueba;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Formularios {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gerardo Jimenez Diez\\drivers_webs\\chromedriver\\chromedriver.exe");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--window-position=50,50");
        chromeOptions.addArguments("--window-size=1200,1300");

        WebDriver webDriver = new ChromeDriver( chromeOptions);

        webDriver.get("http://localhost:9080");

        /* WebElement boton = webDriver.findElement(By.id("clear_bottom"));
        boton.click(); */

        // Inputs e inyectar texto
        webDriver.findElement( By.name("email")).sendKeys("gerjimenez@pruebaselenium.com");
        webDriver.findElement( By.name("message")).sendKeys("Lorem Ipsum dolor sit amet");
        webDriver.findElement( By.name("name")).sendKeys("Gerardo Jimenez");

        // Radio buttons
        webDriver.findElement( By.id("no_newsletter")).click();

        // Controles de tipo select
        Select topic = new Select( webDriver.findElement( By.id("topic-select-menu")));
        topic.selectByVisibleText("Other");

        // Activar y desactivar checkboxes
        WebElement condiciones = webDriver.findElement( By.id("conditions"));
        if( condiciones.isSelected()) {
            condiciones.sendKeys(Keys.SPACE);
        }
        if( !condiciones.isSelected()) {
            condiciones.sendKeys(Keys.SPACE);
        }

        // Enviar datos de un formulario
        // webDriver.findElement( By.id("send_bottom")).click();  // No siempre existe botón
        // Por formulario tiene un evento llamado submit
        webDriver.findElement( By.id("main_form")).submit();










    }
}
