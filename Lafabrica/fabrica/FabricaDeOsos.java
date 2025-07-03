package Lafabrica.fabrica;


import Lafabrica.juguetes.Juguete;
import Lafabrica.juguetes.Oso;

public class FabricaDeOsos extends FabricaDeJuguetes {
    public Juguete crearJuguete() {
        return new Oso();
    }
}