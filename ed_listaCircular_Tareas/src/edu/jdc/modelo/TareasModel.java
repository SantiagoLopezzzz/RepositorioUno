package edu.jdc.modelo;

import java.util.List;


public class TareasModel {
    private List<String> tareas;
    private int indiceActual;

    public TareasModel(List<String> tareas) {
        this.tareas = tareas;
        this.indiceActual = 0;
    }

    public String obtenerTareaActual() {
        return tareas.get(indiceActual);
    }

    public void rotarTareas() {
        indiceActual = (indiceActual + 1) % tareas.size();
    }

    public List<String> obtenerTodasLasTareas() {
        return tareas;
    }
}
