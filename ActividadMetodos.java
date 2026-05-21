import java.util.Scanner;

public class ActividadMetodos{
    static Scanner sc = new Scanner(System.in);
    
    //Primer Método:
    public static void main(String[] args){
        System.out.print("Deja tu mensaje: ");
        String mensaje = sc.nextLine();
        System.out.print(mensaje);
    }
    //Segundo Método
    
    public static void mostrarDiasSemana() {
        System.out.println("Lunes");
        System.out.println("Martes");
        System.out.println("Miercoles");
        System.out.println("Jueves");
        System.out.println("Viernes");
        System.out.println("Sabado");
        System.out.println("Domingo");

    }
}