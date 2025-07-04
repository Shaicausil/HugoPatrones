package MVC.controlador;

import MVC.modelo.Tareas;
import MVC.vista.VistaTareas;

import java.util.ArrayList;
import java.util.List;

public class ControladorTareas {
    private List<Tareas> tareas = new ArrayList<>();
    private VistaTareas vista = new VistaTareas();

    public void iniciar() {
        boolean salir = false;
        while (!salir) {
            int opcion = vista.mostrarMenu();
            switch (opcion) {
                case 1:
                    Tareas nueva = vista.pedirDatosTarea();
                    tareas.add(nueva);
                    break;
                case 2:
                    vista.mostrarTareas(tareas);
                    int indice = vista.pedirIndiceTarea();
                    if (indice >= 0 && indice < tareas.size()) {
                        tareas.get(indice).marcarComoRealizada();
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;
                case 3:
                    vista.mostrarTareas(tareas);
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}