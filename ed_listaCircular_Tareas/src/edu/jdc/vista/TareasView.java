package edu.jdc.vista;

import java.util.List;



public class TareasView {
    public void mostrarTarea(String tarea) {
        System.out.println("Tarea actual: " + tarea);
    }

    public void mostrarMenu() {
        System.out.println("\nMENU:");
        System.out.println("1. Mostrar tarea actual");
        System.out.println("2. Listar todas las tareas");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");
    }

    public void mostrarTodasLasTareas(List<String> tareas) {
        System.out.println("Todas las tareas:");
        for (String tarea : tareas) {
            System.out.println("- " + tarea);
        }
    }
}
