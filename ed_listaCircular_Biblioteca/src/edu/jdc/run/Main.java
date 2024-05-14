package edu.jdc.run;

import edu.jdc.controlador.Controlador;
import edu.jdc.vista.Vista;


public class Main {
    public static void main(String[] args) {
        Vista vista = new Vista();
        Controlador controlador = new Controlador(vista);
        controlador.iniciar();
    }
}
