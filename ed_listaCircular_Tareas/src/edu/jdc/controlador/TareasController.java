package edu.jdc.controlador;

import edu.jdc.modelo.TareasModel;
import edu.jdc.vista.TareasView;
import java.util.List;


public class TareasController {
    private TareasModel model;
    private TareasView view;

    public TareasController(TareasModel model, TareasView view) {
        this.model = model;
        this.view = view;
    }

    public void actualizarVista() {
        view.mostrarTarea(model.obtenerTareaActual());
    }

    public void rotarTareas() {
        model.rotarTareas();
        actualizarVista();
    }

    public List<String> obtenerTodasLasTareas() {
        return model.obtenerTodasLasTareas();
    }
}
