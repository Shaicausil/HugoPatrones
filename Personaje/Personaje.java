package Personaje;

public class Personaje {
    // Características físicas
    private String nombre;
    private String genero;
    private String altura;
    private String peso;
    private String colorPiel;

    // Habilidades
    private int fuerza;
    private int agilidad;
    private int inteligencia;

    // Equipamiento
    private String arma;
    private String armadura;
    private String accesorio;


    private Personaje(Builder builder) {
        this.nombre = builder.nombre;
        this.genero = builder.genero;
        this.altura = builder.altura;
        this.peso = builder.peso;
        this.colorPiel = builder.colorPiel;
        this.fuerza = builder.fuerza;
        this.agilidad = builder.agilidad;
        this.inteligencia = builder.inteligencia;
        this.arma = builder.arma;
        this.armadura = builder.armadura;
        this.accesorio = builder.accesorio;
    }


    public void mostrar() {
        System.out.println("======= PERSONAJE CREADO =======");
        System.out.println("Nombre: " + nombre);
        System.out.println("Género: " + genero);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.println("Color de piel: " + colorPiel);
        System.out.println("Habilidades: Fuerza=" + fuerza + ", Agilidad=" + agilidad + ", Inteligencia=" + inteligencia);
        System.out.println("Equipamiento: Arma=" + arma + ", Armadura=" + armadura + ", Accesorio=" + accesorio);
        System.out.println("================================");
    }


    public static class Builder {

        private String nombre = "Sin nombre";
        private String genero = "No definido";
        private String altura = "Desconocida";
        private String peso = "Desconocido";
        private String colorPiel = "Sin color";

        private int fuerza = 0;
        private int agilidad = 0;
        private int inteligencia = 0;

        private String arma = "Sin arma";
        private String armadura = "Sin armadura";
        private String accesorio = "Sin accesorio";

        public Builder conNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public Builder conGenero(String genero) {
            this.genero = genero;
            return this;
        }

        public Builder conAltura(String altura) {
            this.altura = altura;
            return this;
        }

        public Builder conPeso(String peso) {
            this.peso = peso;
            return this;
        }

        public Builder conColorPiel(String color) {
            this.colorPiel = color;
            return this;
        }

        public Builder conFuerza(int fuerza) {
            this.fuerza = fuerza;
            return this;
        }

        public Builder conAgilidad(int agilidad) {
            this.agilidad = agilidad;
            return this;
        }

        public Builder conInteligencia(int inteligencia) {
            this.inteligencia = inteligencia;
            return this;
        }

        public Builder conArma(String arma) {
            this.arma = arma;
            return this;
        }

        public Builder conArmadura(String armadura) {
            this.armadura = armadura;
            return this;
        }

        public Builder conAccesorio(String accesorio) {
            this.accesorio = accesorio;
            return this;
        }


        public Personaje construir() {
            return new Personaje(this);
        }
    }
}
