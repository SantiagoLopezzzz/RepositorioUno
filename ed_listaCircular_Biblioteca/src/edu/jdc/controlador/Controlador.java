package edu.jdc.controlador;

import edu.jdc.modelo.Registro;
import edu.jdc.vista.Vista;
import java.util.LinkedList;


public class Controlador {
private Vista vista;
private LinkedList<Registro> registros;

    public Controlador() {
    }

    public Controlador(Vista vista) {
        this.vista = vista;
        this.registros = new LinkedList<>();
    }

    
    
    public void agregarRegistro() {
        Registro nuevoRegistro = vista.solicitarDatosRegistro();
        registros.add(nuevoRegistro);
        vista.mostrarMensaje("Registro agregado exitosamente.");
    }
    
    public void listarRegistros() {
        if (registros.isEmpty()) {
            vista.mostrarMensaje("\nNo hay registros para mostrar.");
            return;
        }
        vista.mostrarMensaje("\nLista de registros:");
        for (Registro registro : registros) {
            vista.mostrarRegistro(registro);
        }
    }
    
    
    public void eliminarRegistroPorNumeroCarnet() {
        if (registros.isEmpty()) {
            vista.mostrarMensaje("\nNo hay registros para eliminar.");
            return;
        }
        int numeroCarnet = vista.solicitarNumeroCarnetBiblioteca();
        boolean encontrado = false;
        for (Registro registro : registros) {
            if (registro.getNumeroCarnetBiblioteca() == numeroCarnet) {
                registros.remove(registro);
                vista.mostrarMensaje("Registro eliminado exitosamente.");
                encontrado = true;
                break; 
            }
        }
        if (!encontrado) {
            vista.mostrarMensaje("No hay registros con este carnet");
        }
       
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
                eliminarRegistroPorNumeroCarnet();
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
