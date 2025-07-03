package Lafabrica;


import Lafabrica.fabrica.*;

public class TiendaDeJuguetes {
    public static void main(String[] args) {
        FabricaDeJuguetes fabrica;

        // Crear oso
        fabrica = new FabricaDeOsos();
        fabrica.entregarJuguete();

        // Crear robot
        fabrica = new FabricaDeRobots();
        fabrica.entregarJuguete();

        // Crear balón
        fabrica = new FabricaDeBalones();
        fabrica.entregarJuguete();


        fabrica = new FabricaDeYoyos();
        fabrica.entregarJuguete();
    }
}