package edu.jdc.estudiantes.vista;

import edu.jdc.estudiantes.modelo.modeloEstudiantes;
import java.util.Scanner;

public class vistaEstudiantes {

    private Scanner leer;

    public vistaEstudiantes() {
        leer = new Scanner(System.in);
    }

    public String printDe(String nombreEstudiante, String idEstudiante) {

        return null;

    }

    public int menu() {
        System.out.println("     Actualizacion de estudiantes    ");
        System.out.println("  Digite 1 para agregar un estudiante  ");
        System.out.println("  Digite 2 para actualizar un estudiante  ");
        System.out.println("  Digite 3 para eliminar un estudiante  ");
        System.out.println("  Digite 4 para ver un estudiante  ");
        System.out.println("  Digite 5 para salir ");
        System.out.println("  Seleccione ");
        int opcionEstudiante = leer.nextInt();
        leer.nextLine();
        return opcionEstudiante;
      
    }
    public modeloEstudiantes agregar (){
        System.out.println(" Ingrese el nombre del estudiante ");
        String nombreEstdiante = leer.nextLine();
        System.out.println(" Ingrese el id del Estudiante ");
        String idEstudiante = leer.nextLine();
        leer.nextLine();    
        return new modeloEstudiantes(nombreEstdiante, idEstudiante);

    }

    public String IdEstudiante() {
        System.out.println("Ingresa el ID del estudiante que quieres cambiar o eliminar: ");
        return leer.nextLine();
    }
    
    public void ver (modeloEstudiantes[] estudiantes) {
        for (modeloEstudiantes estudiante : estudiantes) {
            if (estudiante != null) {
                System.out.println("Nombre: " + estudiante.getNombre() + ", id: " + estudiante.getId());
            }
        }
    }
    public void mensaje(String mensaje) {
        System.out.println(mensaje);
    }

}
