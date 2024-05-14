package edu.jdc.modelo;


public class Registro {
    private String nombre;
    private String dia;
    private String tarea;
    private Registro siguiente;

    public Registro(String nombre, String dia, String tarea) {
        this.nombre = nombre;
        this.dia = dia;
        this.tarea = tarea;
        this.siguiente = null;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDia() {
        return dia;
    }

    public String getTarea() {
        return tarea;
    }

    public Registro getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Registro siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
