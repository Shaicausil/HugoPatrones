package Personaje;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== CREANDO PERSONAJE GUERRERO =====");

        Personaje guerrero = new Personaje.Builder()
                .conNombre("Thorg")
                .conGenero("Masculino")
                .conAltura("1.90 m")
                .conPeso("95 kg")
                .conColorPiel("Bronceada")
                .conFuerza(90)
                .conAgilidad(60)
                .conInteligencia(40)
                .conArma("Espada gigante")
                .conArmadura("Armadura de acero")
                .conAccesorio("Amuleto de poder")
                .construir();

        guerrero.mostrar();

        System.out.println("\n===== CREANDO PERSONAJE MAGO =====");

        Personaje mago = new Personaje.Builder()
                .conNombre("Merlina")
                .conGenero("Femenino")
                .conAltura("1.65 m")
                .conPeso("58 kg")
                .conColorPiel("Pálida")
                .conFuerza(20)
                .conAgilidad(40)
                .conInteligencia(95)
                .conArma("Báculo mágico")
                .conArmadura("Túnica encantada")
                .conAccesorio("Anillo de sabiduría")
                .construir();

        mago.mostrar();

        System.out.println("\n===== CREANDO PERSONAJE PERSONALIZADO =====");

        Personaje custom = new Personaje.Builder()
                .conNombre("Luz")
                .conGenero("No binario")
                .conAltura("1.75 m")
                .conColorPiel("Verde alienígena")
                .conAgilidad(80)
                .conArma("Espada láser")
                .construir();

        custom.mostrar();
    }
}
