package edu.jdc.controlador;

import edu.jdc.modelo.JuegoModelo;


public class JuegoControlador {
   private JuegoModelo modelo;


    public JuegoControlador(JuegoModelo modelo) {
        this.modelo = modelo;
    }


    public void detenerMusica() {
        modelo.ocuparSiguienteSilla();
    }

    public int getJugadoresRestantes() {
        return modelo.getJugadoresRestantes();
    }
}
