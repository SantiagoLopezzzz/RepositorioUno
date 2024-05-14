package edu.jdc.modelo;


public class Evento {
    private int eventoId;
    private String tipo;
    private int usuarioId;
    private String fechaHora;
    private String contenido;

    public Evento() {
    }

    public Evento(int eventoId, String tipo, int usuarioId, String fechaHora, String contenido) {
        this.eventoId = eventoId;
        this.tipo = tipo;
        this.usuarioId = usuarioId;
        this.fechaHora = fechaHora;
        this.contenido = contenido;
    }

    public int getEventoId() {
        return eventoId;
    }

    public void setEventoId(int eventoId) {
        this.eventoId = eventoId;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    
    
    
}
