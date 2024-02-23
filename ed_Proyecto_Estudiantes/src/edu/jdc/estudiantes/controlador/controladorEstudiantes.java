package edu.jdc.estudiantes.controlador;

import edu.jdc.estudiantes.modelo.modeloEstudiantes;
import edu.jdc.estudiantes.vista.vistaEstudiantes;

public class controladorEstudiantes {

    private modeloEstudiantes[] estudiantes;
    private int numEstudiantes;
    private vistaEstudiantes objectVista;

    public controladorEstudiantes() {
    }

    public controladorEstudiantes(int numEstudiantes, vistaEstudiantes objectVista) {

        this.numEstudiantes = numEstudiantes;
        this.estudiantes = new modeloEstudiantes[numEstudiantes];
        this.objectVista = objectVista;
    }

    public void Iniciar() {
        boolean salir = false;
        while (!salir) {
            int opcion = objectVista.menu();
            switch (opcion) {
                case 1:
                    agregar();

                    break;
                case 2:
                    actualizar();
                    break;

                case 3:
                    eliminar();
                    break;

                case 4:
                    ver();
                case 5:
                    salir = true;
                    objectVista.mensaje("Gracias por usar nuestros sevicios");
                    break;
                default:
                    objectVista.mensaje("Opcion no valida ingrese nuevamente");
            }
        }
    }

    private void agregar() {
        for (int i = 0; i < numEstudiantes; i++) {
            if (estudiantes[i] == null) {
                estudiantes[i] = objectVista.agregar();
                break;
            }
        }
    }

    private void actualizar() {
        String id = objectVista.IdEstudiante();
        for (int i = 0; i < numEstudiantes; i++) {
            if (estudiantes[i] != null && estudiantes[i].getId().equals(id)) {
                estudiantes[i] = objectVista.agregar();
                break;
            }
        }
    }

    private void eliminar() {
        String id = objectVista.IdEstudiante();
        for (int i = 0; i < numEstudiantes; i++) {
            if (estudiantes[i] != null && estudiantes[i].getId().equals(id)) {
                estudiantes[i] = null;
                break;
            }
        }
    }

    private void ver() {
        objectVista.ver(estudiantes);
    }

}
