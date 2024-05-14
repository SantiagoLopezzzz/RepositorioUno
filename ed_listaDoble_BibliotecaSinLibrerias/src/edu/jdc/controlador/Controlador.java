package edu.jdc.controlador;

import edu.jdc.modelo.Nodo;
import edu.jdc.modelo.Registro;
import edu.jdc.vista.Vista;


public class Controlador {
    private Vista vista;
    private Nodo inicio;
    private Nodo fin;

    public Controlador(Vista vista) {
        this.vista = vista;
        this.inicio = null;
        this.fin = null;
    }
    
    
    

    public void agregarRegistro() {
        Registro nuevoRegistro = vista.solicitarDatosRegistro();
        Nodo nuevoNodo = new Nodo(nuevoRegistro);
        if (inicio == null) {
            inicio = nuevoNodo;
            fin = nuevoNodo;
        } else {
            nuevoNodo.setAnterior(fin);
            fin.setSiguiente(nuevoNodo);
            fin = nuevoNodo;
        }
        vista.mostrarMensaje("Registro agregado exitosamente.");
    }

    public void listarRegistros() {
        Nodo actual = inicio;
        while (actual != null) {
            vista.mostrarRegistro(actual.getRegistro());
            actual = actual.getSiguiente();
        }
    }

    public void eliminarRegistroPorLibro(String libroAEliminar) {
        Nodo actual = inicio;
        while (actual != null) {
            if (actual.getRegistro().getLibro().equalsIgnoreCase(libroAEliminar)) {
                if (actual == inicio && actual == fin) {
                    inicio = null;
                    fin = null;
                } else if (actual == inicio) {
                    inicio = actual.getSiguiente();
                    actual.getSiguiente().setAnterior(null);
                } else if (actual == fin) {
                    fin = actual.getAnterior();
                    actual.getAnterior().setSiguiente(null);
                } else {
                    actual.getAnterior().setSiguiente(actual.getSiguiente());
                    actual.getSiguiente().setAnterior(actual.getAnterior());
                }
                return;
            }
            actual = actual.getSiguiente();
        }
        vista.mostrarMensaje("No se encontró ningún registro con ese libro.");
    }
    
    public void menu (int Opcion){
        switch (Opcion) {
            case 1:
                agregarRegistro();
                break;
            case 2:
                listarRegistros();
                break;    
            case 3:
                eliminarRegistroPorLibro(vista.solicitarLibroAEliminar());
                break;
            case 4:
                vista.mostrarMensaje("Gracias por usar nuestros servicios ");
                System.exit(0);
                break;    
            default:
                vista.mostrarMensaje("Opcion incorrecta ");
                
        }
    }
    
    
    public void iniciar(){
        while (true) {            
            int opcion = vista.mostrarMenu();
            menu(opcion); 
        }
    }
}
