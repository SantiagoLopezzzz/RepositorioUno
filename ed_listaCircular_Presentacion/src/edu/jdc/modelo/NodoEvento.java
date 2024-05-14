package edu.jdc.modelo;


public class NodoEvento {

    public Evento evento;
    public NodoEvento next;

    public NodoEvento(Evento evento) {
        this.evento = evento;
        this.next = null;
    }
}
