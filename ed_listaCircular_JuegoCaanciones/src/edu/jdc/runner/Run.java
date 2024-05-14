package edu.jdc.runner;

import edu.jdc.controlador.JuegoControlador;
import edu.jdc.modelo.JuegoModelo;
import edu.jdc.vista.JuegoVista;

public class Run {
    public static void main(String[] args) {
        JuegoVista vista = new JuegoVista();
        int numSillas = vista.solicitarNumero("Ingrese el numero de sillas: ");
        int numJugadores = vista.solicitarNumero("Ingrese el numero de jugadores: ");

        JuegoModelo modelo = new JuegoModelo(numSillas, numJugadores);
        JuegoControlador controlador = new JuegoControlador(modelo);

        while (controlador.getJugadoresRestantes() > 1) {
            vista.mostrarMensaje("Se detuvo la musica  ");
            vista.mostrarMensaje("La musica se ha detenido.");
            controlador.detenerMusica();
            vista.mostrarMensaje("Un jugador ha sido eliminado. Jugadores restantes: " + controlador.getJugadoresRestantes());
        }

        vista.mostrarMensaje("El juego ha terminado ");
    }
}
