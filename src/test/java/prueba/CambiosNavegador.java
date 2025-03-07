package prueba;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CambiosNavegador {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gerardo Jimenez Diez\\drivers_webs\\chromedriver\\chromedriver.exe");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--window-position=50,50");
        chromeOptions.addArguments("--window-size=1200,1300");

        WebDriver webDriver = new ChromeDriver( chromeOptions);

        webDriver.get("http://localhost:9080");

        // Cambios en el URL
        WebElement enlace =  webDriver.findElement(By.xpath("//*[@id=\"home\"]/app-nav/nav/div/ul/li[2]/a"));
        String rutaAntigua = webDriver.getCurrentUrl();
        enlace.click();

        String rutaNueva = webDriver.getCurrentUrl();

        if( rutaAntigua.equals(rutaNueva)){
            System.out.println("ERROR");
        } else {
            System.out.println("Navegacion OK");
        }

        System.out.println(rutaNueva);

        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println("+++++++++++++++++++++++++++++++");

        // Cambios en Titulo del Navegador
        System.out.println(webDriver.getTitle());
        webDriver.get("https://www.selenium.dev/");
        System.out.println(webDriver.getTitle());

        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println("+++++++++++++++++++++++++++++++");

        // Navegar por el historial
        webDriver.get("http://localhost:9080");

        webDriver.navigate().to("http://localhost:9080/#history");
        System.out.println(webDriver.getCurrentUrl());
        webDriver.navigate().to("http://localhost:9080/#products");
        System.out.println(webDriver.getCurrentUrl());
        webDriver.navigate().back();
        System.out.println(webDriver.getCurrentUrl());

        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println("+++++++++++++++++++++++++++++++");

        // Abrir nuevo tabs (pestaña)
        webDriver.get("http://localhost:9080");
        String abrirNuevoTab = Keys.chord(Keys.CONTROL, Keys.RETURN);
        WebElement enlace1 = webDriver.findElement(By.xpath("//*[@id=\"home\"]/app-nav/nav/div/ul/li[3]/a"));
        enlace1.sendKeys(abrirNuevoTab);

        // Navegar por múltiples pestañas
        System.out.println(webDriver.getCurrentUrl());
        ArrayList tabs = new ArrayList(webDriver.getWindowHandles());
        System.out.println(tabs.size());
        webDriver.switchTo().window( tabs.get(1).toString());
        System.out.println(webDriver.getCurrentUrl());

        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println("+++++++++++++++++++++++++++++++");

        // Cambiar ventana y cerrar todo
        WebElement enlace2 = webDriver.findElement( By.xpath("//*[@id=\"home\"]/app-nav/nav/div/ul/li[6]/a"));
        enlace2.click();
        ArrayList ventanas = new ArrayList( webDriver.getWindowHandles() );
        webDriver.switchTo().window( ventanas.get(2).toString() );
        System.out.println( webDriver.getCurrentUrl() );
        webDriver.close();
        webDriver.switchTo().window( ventanas.get(0).toString() );
        System.out.println( webDriver.getCurrentUrl() );
        webDriver.quit();













    }
}
