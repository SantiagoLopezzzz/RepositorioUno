package edu.jdc.controlador;

import edu.jdc.modelo.Evento;
import edu.jdc.modelo.NodoEvento;

public class ListarEventos {
    private NodoEvento tail;
    private int size;

    public void agregarEvento(Evento evento) {
        NodoEvento nuevoNodo = new NodoEvento(evento);
        if (tail == null) {
            tail = nuevoNodo;
            tail.next = tail;
        } else {
            nuevoNodo.next = tail.next;
            tail.next = nuevoNodo;
            tail = nuevoNodo;
        }
        size++;
        System.out.println("Evento agregado con éxito.");
    }

    public boolean eliminarEvento(int eventoId) {
        if (tail == null) {
            return false;
        }

        NodoEvento current = tail;
        NodoEvento prev = null;
        do {
            if (current.evento.getEventoId() == eventoId) {
                if (current == tail && size == 1) {
                    tail = null;
                } else {
                    prev.next = current.next;
                    if (current == tail) {
                        tail = prev;
                    }
                }
                size--;
                System.out.println("Evento eliminado con éxito.");
                return true;
            }
            prev = current;
            current = current.next;
        } while (current != tail.next);

        System.out.println("No se encontró un evento con ese ID.");
        return false;
    }

    public void listarEventos() {
        System.out.println(" Lista de Eventos ");
        if (tail == null) {
            System.out.println("No hay eventos para mostrar.");
        } else {
            NodoEvento current = tail.next;
            do {
                Evento evento = current.evento;
                System.out.printf("ID: %d, Tipo: %s, Usuario: %d, Fecha y Hora: %s, Contenido: %s\n",
                        evento.getEventoId(), evento.getTipo(), evento.getUsuarioId(),
                        evento.getFechaHora(), evento.getContenido());
                current = current.next;
            } while (current != tail.next);
        }
    }
}
