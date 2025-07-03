package Lafabrica.fabrica;


import Lafabrica.juguetes.Juguete;
import Lafabrica.juguetes.Yoyo;

public class FabricaDeYoyos extends FabricaDeJuguetes {
    public Juguete crearJuguete() {
        return new Yoyo();
    }
}