package prueba;

import org.testng.annotations.Test;

public class Prueba {

    @Test ( priority = 1, description = "Examina la prueba 1")
    void pruebaInicial(){

        System.out.println("Prueba Inicial OK");
    }

    @Test (priority = 2, description = "Examina la prueba 2")
    void pruebaDos(){

        System.out.println("Prueba2 Inicial OK");
    }

    @Test (priority = 3,  description = "Examina la prueba 3")
    void pruebaTres(){

        System.out.println("Prueba3 Inicial OK");
    }

}
