package edu.jdc.vista;

import edu.jdc.modelo.Registro;
import java.util.Scanner;

public class Vista {
    
     public void mostrarMensaje (String mensaje){
        System.out.println(mensaje);
    }
    
    public int mostrarMenu(){
        Scanner scanner = new Scanner(System.in);
        mostrarMensaje("Bienvenido a la biblioteca ");
        mostrarMensaje("1. Tomar libro ");
        mostrarMensaje("2. Ver registros ");
        mostrarMensaje("3. Eliminar registros ");
        mostrarMensaje("4. Salir");
        return scanner.nextInt();
        
    }
    
   public  Registro solicitarDatosRegistro (){
       Scanner scanner = new Scanner(System.in);
       mostrarMensaje("Ingrese los datos");

       mostrarMensaje("Ingrese el nombre");
       String nombre = scanner.next();

       mostrarMensaje("Ingrese el documento");
       int numeroDocumento = scanner.nextInt();

       mostrarMensaje("Ingrese el numero del carnet de biblioteca");
       int numeroCarnetBiblioteca = scanner.nextInt();

       mostrarMensaje("Ingrese el libro ");
       String libro = scanner.next();
       scanner.nextLine();

       mostrarMensaje("Ingrese el dia de pedido");
       String diaPedido = scanner.nextLine();


       
       return  new Registro(nombre, numeroDocumento, numeroCarnetBiblioteca, libro, diaPedido, diaPedido);
   }
   
   public int solicitarNumeroCarnetBiblioteca() {
       Scanner scanner = new Scanner(System.in);
        mostrarMensaje("Ingrese el nombre libro que desea eliminar:");
        return scanner.nextInt();
   }
   
   public void mostrarRegistro(Registro registro) {
        mostrarMensaje("Nombre: " + registro.getNombre());
        mostrarMensaje("Numero de documento: " + registro.getNumeroDocumento());
        mostrarMensaje("Numero del carnet de biblioteca: " + registro.getNumeroCarnetBiblioteca());
        mostrarMensaje("Libro: " + registro.getLibro());
        mostrarMensaje("Dia del pedido: " + registro.getDiaPedido());
        mostrarMensaje("Dia de entrega: " + registro.calcularDiaEntrega());
        mostrarMensaje("");
    }
    
}
