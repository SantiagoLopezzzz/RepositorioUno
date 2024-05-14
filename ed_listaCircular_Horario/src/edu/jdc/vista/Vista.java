package edu.jdc.vista;

import edu.jdc.modelo.Registro;
import java.util.Scanner;


public class Vista {
    public void mostrarMensaje (String mensaje){
        System.out.println(mensaje);
    }
    
    public int solicitarOpcion (){
        Scanner scanner = new Scanner(System.in);
        mostrarMensaje("Bienvenido a su horario");
        mostrarMensaje("1. Pedir una Tarea");
        mostrarMensaje("2. Listar las tareas ");
        mostrarMensaje("3. Eliminar tarea ");
        mostrarMensaje("4. Salir");
        
        return scanner.nextInt();
        
    }
    
    public Registro solicitarDatosRegistro (){
        Scanner scanner = new Scanner(System.in);
        
        mostrarMensaje("Ingresar nombre ");
        String nombre  = scanner.nextLine();
        
        mostrarMensaje("Ingresar el dia de la semana ");
        String dia  = scanner.nextLine();
        
        mostrarMensaje("Ingresar el cdigo de la tarea ");
        String tarea  = scanner.nextLine();
        
        
        return new Registro(nombre, dia, tarea);
        
    }
    
    
    public String tareaSegunDia(String dia) {
        switch (dia.toLowerCase()) {
            case "lunes":
                return "Lavar ";
            case "martes":
                return "Comprar ";
            case "miércoles":
                return "Planchar ";
            case "jueves":
                return "Barrer ";
            case "viernes":
                return "Estudiar ";
            case "sábado":
                return "Trapear";
            case "domingo":
                return "Descanso";
            default:
                return "No es una opcion";
        }
    }
    
    public  void mostrarRegistro (Registro registro){
        String mensaje = "Nombre "+ registro.getNombre()+"\n"+
                         "Dia "+ registro.getDia()+"\n"+
                         "Codigo Tarea "+ registro.getTarea()+"\n"+
                         "Tarea "+ tareaSegunDia(registro.getDia());
        mostrarMensaje(mensaje);
    }
    
    public String solicitarTareaAEliminar (){
        Scanner scanner = new Scanner(System.in);
        mostrarMensaje("Ingrese el codigo de la tarea a eliminar");
        return scanner.nextLine();
    }
}
