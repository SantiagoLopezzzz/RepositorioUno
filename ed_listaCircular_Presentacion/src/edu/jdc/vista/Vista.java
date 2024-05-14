package edu.jdc.vista;

import edu.jdc.modelo.Evento;
import java.util.Scanner;


public class Vista {

    public Scanner scanner;

    public Vista(Scanner scanner) {
        this.scanner = scanner;
    }

    public int mostrarMenu() {
        System.out.println("\n=== Menú ===");
        System.out.println("1. Agregar evento");
        System.out.println("2. Eliminar evento");
        System.out.println("3. Listar eventos");
        System.out.println("0. Salir");

        System.out.print("Seleccione una opción: ");
        return scanner.nextInt();
    }

    public Evento ingresarDatosEvento() {
        System.out.println("\n=== Agregar Evento ===");
        System.out.print("Ingrese el ID del evento: ");
        int eventoId = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea después del número

        System.out.print("Ingrese el tipo de evento: ");
        String tipo = scanner.nextLine().trim();

        System.out.print("Ingrese el ID del usuario: ");
        int usuarioId = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea después del número

        System.out.print("Ingrese la fecha y hora del evento: ");
        String fechaHora = scanner.nextLine().trim();

        System.out.print("Ingrese el contenido del evento: ");
        String contenido = scanner.nextLine().trim();

        return new Evento(eventoId, tipo, usuarioId, fechaHora, contenido);
    }

    public int ingresarEventoId() {
        System.out.print("Ingrese el ID del evento: ");
        return scanner.nextInt();
    }
}
