package edu.jdc.runner;

import edu.jdc.controlador.TareasController;
import edu.jdc.modelo.TareasModel;
import edu.jdc.vista.TareasView;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Runner {
    public static void main(String[] args) {
        // Solicitar al usuario que ingrese las tareas
        Scanner scanner = new Scanner(System.in);
        List<String> tareas = new ArrayList<>();
        System.out.println("Ingrese las tareas una por una (ingrese una línea en blanco para terminar):");

        while (true) {
            String tarea = scanner.nextLine();
            if (tarea.isEmpty()) {
                break;
            }
            tareas.add(tarea);
        }

        // Crear el modelo, la vista y el controlador
        TareasModel model = new TareasModel(tareas);
        TareasView view = new TareasView();
        TareasController controller = new TareasController(model, view);

        // Mostrar la tarea actual y el menú
        int opcion;
        do {
            view.mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    controller.actualizarVista();
                    break;
                case 2:
                    view.mostrarTodasLasTareas(controller.obtenerTodasLasTareas());
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione nuevamente.");
            }
        } while (opcion != 3);
    }
    
}
