package edu.jdc.runner;

import edu.jdc.controlador.Controller;
import edu.jdc.controlador.ListarEventos;
import edu.jdc.vista.Vista;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListarEventos listaEventos = new ListarEventos();
        Vista eventoView = new Vista(scanner);
        Controller eventoController = new Controller(listaEventos, eventoView);
        eventoController.ejecutar();
        scanner.close();
    }
}
