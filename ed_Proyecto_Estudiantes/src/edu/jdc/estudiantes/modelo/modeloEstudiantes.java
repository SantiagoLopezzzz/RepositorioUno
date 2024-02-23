package edu.jdc.estudiantes.modelo;


public class modeloEstudiantes {
    private String nombre;
    private String id;

    public modeloEstudiantes() {
    }

    public modeloEstudiantes(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
    
    
}
