package prueba;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Point;

import org.openqa.selenium.chrome.ChromeOptions;

public class PropiedadesNavegador {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gerardo Jimenez Diez\\drivers_webs\\chromedriver\\chromedriver.exe");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--window-position=50,50");
        chromeOptions.addArguments("--window-size=1200,1300");
        chromeOptions.addArguments("--headless");
        // chromeOptions.addArguments("start-maximized");

        //Point targetPostion = new Point(0,0);
        WebDriver webDriver = new ChromeDriver( chromeOptions);
        //webDriver.manage().window().setPosition(targetPostion);

        webDriver.get("https://www.wikipedia.org");


        webDriver.manage().window().maximize();

        webDriver.manage().window().minimize();

        Dimension dimension = new Dimension( 200, 200);

        webDriver.manage().window().setSize( dimension);

        webDriver.manage().window().fullscreen();

        String titulo = webDriver.getTitle();
        System.out.println(titulo);


        // webDriver.close();  */



    }
}
