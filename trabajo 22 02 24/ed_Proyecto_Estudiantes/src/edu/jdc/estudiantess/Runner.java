package edu.jdc.estudiantess;

import edu.jdc.estudiantes.controlador.controladorEstudiantes;
import edu.jdc.estudiantes.vista.vistaEstudiantes;


public class Runner {
    public static void main(String[] args) {
        vistaEstudiantes vista = new vistaEstudiantes();
        controladorEstudiantes controlador = new controladorEstudiantes(5, vista);
        controlador.Iniciar();
        
    }
}
