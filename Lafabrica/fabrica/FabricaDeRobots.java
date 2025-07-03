package Lafabrica.fabrica;


import Lafabrica.juguetes.Juguete;
import Lafabrica.juguetes.Robot;

public class FabricaDeRobots extends FabricaDeJuguetes {
    public Juguete crearJuguete() {
        return new Robot();
    }
}