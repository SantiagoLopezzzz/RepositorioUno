package edu.jdc.modelo;


public class Registro {
    private String nombre;
    private int numeroDocumento;
    private int numeroCarnetBiblioteca;
    private String libro;
    private String diaPedido;
    private String diaEntrega;

    public Registro() {
    }

    public Registro(String nombre, int numeroDocumento, int numeroCarnetBiblioteca, String libro, String diaPedido, String diaEntrega) {
        this.nombre = nombre;
        this.numeroDocumento = numeroDocumento;
        this.numeroCarnetBiblioteca = numeroCarnetBiblioteca;
        this.libro = libro;
        this.diaPedido = diaPedido;
        this.diaEntrega = diaEntrega;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroDocumento() {
        return numeroDocumento;
    }

    public int getNumeroCarnetBiblioteca() {
        return numeroCarnetBiblioteca;
    }

    public String getLibro() {
        return libro;
    }

    public String getDiaPedido() {
        return diaPedido;
    }

    public String calcularDiaEntrega (){
        
        return diaEntrega;
        
    }
    
}
