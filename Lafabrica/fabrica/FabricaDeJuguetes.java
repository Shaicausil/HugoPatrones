package Lafabrica.fabrica;


import Lafabrica.juguetes.Juguete;

public abstract class FabricaDeJuguetes {
    public void entregarJuguete() {
        Juguete juguete = crearJuguete();
        juguete.jugar();
    }

    public abstract Juguete crearJuguete();
}