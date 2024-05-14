package edu.jdc.controlador;

import edu.jdc.modelo.Evento;
import edu.jdc.vista.Vista;
import java.util.Scanner;

public class Controller {

    private ListarEventos listaEventos;
    private Vista eventoView;

    public Controller() {
    }

    public Controller(ListarEventos listaEventos, Vista eventoView) {
        this.listaEventos = listaEventos;
        this.eventoView = eventoView;
    }


    public void ejecutar() {
            Scanner scanner = eventoView.scanner ;
        int opcion;
        do {
            opcion = eventoView.mostrarMenu();
            switch (opcion) {
                case 1:
                    Evento evento = eventoView.ingresarDatosEvento();
                    listaEventos.agregarEvento(evento);
                    break;
                case 2:
                    int eventoId = eventoView.ingresarEventoId();
                    listaEventos.eliminarEvento(eventoId);
                    break;
                case 3:
                    listaEventos.listarEventos();
                    break;
                case 0:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
            }
        } while (opcion != 0);
    } 
}
