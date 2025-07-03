package Lafabrica.juguetes;

public class Yoyo implements Juguete {
    public void jugar() {
        System.out.println("El Yoyo sube y baja.");
    }

    public void mostrarTipo() {
        System.out.println("Yoyo clásico.");
    }

    public void hacerSonido() {
        System.out.println("Zzzzzzzzz");
    }
}