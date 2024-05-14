package edu.jdc.controlador;

import edu.jdc.modelo.Registro;
import edu.jdc.vista.Vista;


public class Controlador {
   private Vista vista;
    private Registro primerRegistro;

    public Controlador() {
        this.vista = new Vista();
        this.primerRegistro = null;
    }

    public void agregarRegistro(Registro nuevoRegistro) {
        if (primerRegistro == null) {
            primerRegistro = nuevoRegistro;
            primerRegistro.setSiguiente(primerRegistro); // Hacer la lista circular
        } else {
            Registro actual = primerRegistro;
            while (actual.getSiguiente() != primerRegistro) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevoRegistro);
            nuevoRegistro.setSiguiente(primerRegistro); // Hacer la lista circular
        }
    }

    public void listarRegistros() {
        if (primerRegistro == null) {
            vista.mostrarMensaje("No hay registros.");
            return;
        }

        Registro actual = primerRegistro;
        do {
            vista.mostrarRegistro(actual);
            actual = actual.getSiguiente();
        } while (actual != primerRegistro);
    }

    public void eliminarRegistro(String tarea) {
        if (primerRegistro == null) {
            vista.mostrarMensaje("No hay registros.");
            return;
        }

        if (primerRegistro.getTarea().equalsIgnoreCase(tarea)) {
            if (primerRegistro.getSiguiente() == primerRegistro) {
                primerRegistro = null;
            } else {
                Registro ultimo = primerRegistro;
                while (ultimo.getSiguiente() != primerRegistro) {
                    ultimo = ultimo.getSiguiente();
                }
                primerRegistro = primerRegistro.getSiguiente();
                ultimo.setSiguiente(primerRegistro);
            }
            vista.mostrarMensaje("Registro eliminado exitosamente.");
            return;
        }

        Registro anterior = primerRegistro;
        Registro actual = primerRegistro.getSiguiente();
        while (actual != primerRegistro) {
            if (actual.getTarea().equalsIgnoreCase(tarea)) {
                anterior.setSiguiente(actual.getSiguiente());
                vista.mostrarMensaje("Registro eliminado exitosamente.");
                return;
            }
            anterior = actual;
            actual = actual.getSiguiente();
        }
        vista.mostrarMensaje("No se encontró ningún registro con esa tarea.");
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
                vista.mostrarMensaje("Saliendo del programa...");
                System.exit(0);
                break;
            default:
                vista.mostrarMensaje("Opción no válida. Por favor, seleccione una opción correcta.");
        }
    }

    public void iniciar() {
        while (true) {
            int opcion = vista.solicitarOpcion();
            procesarOpcion(opcion);
        }
    }
    
}
