package edu.jdc.modelo;

public class Nodo {
    private Registro registro;
    private Nodo siguiente;
    private Nodo anterior;

    public Nodo(Registro registro) {
        this.registro = registro;
        this.siguiente = null;
        this.anterior = null;
    }

    public Registro getRegistro() {
        return registro;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
    
    
}
