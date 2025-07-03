package Lafabrica.fabrica;


import Lafabrica.juguetes.Balon;
import Lafabrica.juguetes.Juguete;

public class FabricaDeBalones extends FabricaDeJuguetes {
    public Juguete crearJuguete() {
        return new Balon();
    }
}