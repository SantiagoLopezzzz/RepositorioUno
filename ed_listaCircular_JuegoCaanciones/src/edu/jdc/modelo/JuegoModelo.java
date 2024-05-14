package edu.jdc.modelo;


public class JuegoModelo {
   private Nodo inicio;
    private int numSillas;
    private int jugadoresRestantes;

    public JuegoModelo(int numSillas, int numJugadores) {
        this.numSillas = numSillas;
        this.jugadoresRestantes = numJugadores;
        crearSillas();
    }

    private void crearSillas() {
        inicio = new Nodo(false);
        Nodo temp = inicio;
        for (int i = 1; i < numSillas; i++) {
            temp.siguiente = new Nodo(false);
            temp = temp.siguiente;
        }
        temp.siguiente = inicio; 
    }

    public Nodo getInicio() {
        return inicio;
    }

    public void ocuparSiguienteSilla() {
        Nodo current = inicio;
        while (current.ocupada) {
            current = current.siguiente;
        }
        current.ocupada = true;
        jugadoresRestantes--;
    }

    public int getJugadoresRestantes() {
        return jugadoresRestantes;
    } 
}
