package edu.jdc.vista;

import java.util.Scanner;


public class JuegoVista {
    private Scanner scanner;

    public JuegoVista() {
        scanner = new Scanner(System.in);
    }

    public int solicitarNumero(String mensaje) {
        System.out.println(mensaje);
        return scanner.nextInt();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
