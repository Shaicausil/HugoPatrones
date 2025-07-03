package Hamburguesas;

public class Restaurante {
    public static void main(String[] args) {

        System.out.println("===== PASO 1: HAMBURGUESA BÁSICA =====");
        Hamburguesa hamburguesa1 = new Hamburguesa.Builder()
                .conPan("Pan normal")
                .conCarne("Carne de res")
                .construir();
        hamburguesa1.mostrar();

        System.out.println("\n===== PASO 2: HAMBURGUESA CON QUESO =====");
        Hamburguesa hamburguesa2a = new Hamburguesa.Builder()
                .conPan("Pan integral")
                .conCarne("Carne de res")
                .conQueso("Queso cheddar")
                .construir();
        hamburguesa2a.mostrar();

        System.out.println("\nHamburguesa SIN queso (omitimos .conQueso()):");
        Hamburguesa hamburguesa2b = new Hamburguesa.Builder()
                .conPan("Pan de leche")
                .conCarne("Pollo a la plancha")
                .construir();
        hamburguesa2b.mostrar();

        System.out.println("\n===== PASO 3: HAMBURGUESA COMPLETA =====");

        System.out.println("\nHamburguesa COMPLETA:");
        Hamburguesa completa = new Hamburguesa.Builder()
                .conPan("Pan artesanal con semillas")
                .conCarne("Carne premium")
                .conQueso("Queso suizo derretido")
                .conVerduras("Lechuga, tomate, cebolla")
                .conSalsa("Salsa especial de la casa")
                .construir();
        completa.mostrar();

        System.out.println("\nHamburguesa para NIÑOS:");
        Hamburguesa ninos = new Hamburguesa.Builder()
                .conPan("Pan de leche suave")
                .conCarne("Pollo a la plancha")
                .conQueso("Queso suave")
                .construir();
        ninos.mostrar();

        System.out.println("\nHamburguesa VEGETARIANA:");
        Hamburguesa vegetariana = new Hamburguesa.Builder()
                .conPan("Pan integral")
                .conVerduras("Lechuga, tomate, aguacate, brotes")
                .conSalsa("Salsa de yogur con hierbas")
                .construir();
        vegetariana.mostrar();

        System.out.println("\n===== PASO 4: ORDEN DIFERENTE + RIPIO DE PAPA =====");

        System.out.println("\nConstrucción en orden NORMAL:");
        Hamburguesa normal = new Hamburguesa.Builder()
                .conPan("Pan brioche")
                .conCarne("Carne de conejo")
                .conQueso("Queso de búfala")
                .conVerduras("Lechuga y tomate")
                .conSalsa("Tártara")
                .conRipioPapa("Ripio crujiente")
                .construir();
        normal.mostrar();

        System.out.println("\nConstrucción en orden DIFERENTE:");
        Hamburguesa diferente = new Hamburguesa.Builder()
                .conSalsa("Mayonesa picante")
                .conRipioPapa("Ripio extra crujiente")
                .conVerduras("Cebolla caramelizada")
                .conQueso("Queso azul")
                .conCarne("Pollo apanado")
                .conPan("Pan de centeno")
                .construir();
        diferente.mostrar();

        System.out.println("\nHamburguesa de ATÚN:");
        Hamburguesa atun = new Hamburguesa.Builder()
                .conPan("Pan pita integral")
                .conCarne("Atún en agua con limón")
                .conVerduras("Lechuga fresca y tomate cherry")
                .conSalsa("Mayonesa con ajo")
                .conRipioPapa("Ripio de papa con hierbas")
                .construir();
        atun.mostrar();
    }
}
