package edu.jdc.controlador;

import edu.jdc.modelo.Registro;
import edu.jdc.vista.Vista;
import java.util.LinkedList;


public class Controlador {
    private Vista  vista;    
    private LinkedList<Registro> listaRegistro;

    public Controlador() {
        this.vista = new Vista();
        this.listaRegistro = new LinkedList();
    }
    
    public void agregarRegistro (Registro nuevoRegistro){
        listaRegistro.add(nuevoRegistro);
    }
    
    public void listarRegistros (){
        for (Registro registro : listaRegistro) {
            vista.mostrarRegistro(registro);
        }
    }
    
    public void eliminarRegistro (String tarea){
        for (int i = 0; i < listaRegistro.size(); i++) {
            Registro registro = listaRegistro.get(i);
            if (registro.getTarea().equalsIgnoreCase(tarea)) {
                listaRegistro.remove(i);
                vista.mostrarMensaje("Se elimino la tarea ");
                return;
            }
        }
        vista.mostrarMensaje("No hay tarea ");
    }
    
    public void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                agregarRegistro(vista.solicitarDatosRegistro());
                vista.mostrarMensaje("Registro agregado exitosamente.");
                break;
            case 2:
                listarRegistros();
                break;
            case 3:
                eliminarRegistro(vista.solicitarTareaAEliminar());
                break;
            case 4:
                vista.mostrarMensaje("Saliendo ");
                System.exit(0);
                break;
            default:
                vista.mostrarMensaje("Opción no válida");
        }
    }

    public void iniciar() {
        while (true) {
            int opcion = vista.solicitarOpcion();
            procesarOpcion(opcion);
        }
    }
}
