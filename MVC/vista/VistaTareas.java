package MVC.vista;

import MVC.modelo.Tareas;

import java.util.Scanner;
import java.util.List;

public class VistaTareas {
    private Scanner scanner = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\nGestor de Tareas");
        System.out.println("1. Crear tarea");
        System.out.println("2. Completar tarea");
        System.out.println("3. Listar tareas");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");
        return scanner.nextInt();
    }

    public Tareas pedirDatosTarea() {
        scanner.nextLine();
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Descripción: ");
        String descripcion = scanner.nextLine();
        return new Tareas(titulo, descripcion);
    }

    public void mostrarTareas(List<Tareas> tareas) {
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas.");
        } else {
            for (int i = 0; i < tareas.size(); i++) {
                Tareas t = tareas.get(i);
                System.out.println((i + 1) + ". " + t.getTitulo() + " - " +
                        (t.isRealizada() ? "Realizada" : "Pendiente"));
            }
        }
    }

    public int pedirIndiceTarea() {
        System.out.print("Ingrese el número de la tarea a completar: ");
        return scanner.nextInt() - 1;
    }
}