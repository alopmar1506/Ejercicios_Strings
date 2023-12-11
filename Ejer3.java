import java.util.Scanner;
/**
 * @author Ana Xiang López Martínez
 * Fecha: 23/11/23
 * Propósito: programa que pida por teclado tres cadenas de texto: nombre y dos apellidos. Luego 
 * mostrará un código de usuario (en mayúsculas) formado por la concatenación de las tres 
 * primeras letras de cada uno de ellos. Por ejemplo si se introduce “Lionel”, “Tarazón” y
 * “Alcocer” mostrará “LIOTARALC”.
 */


public class Ejer3 {
    public static void main(String[] args) {
       String nombre="";
       String apellidoUno="";
       String apellidoDos="";
       String union="";
       Scanner sc=new Scanner(System.in);

       System.out.println("Introduzca su nombre");
       nombre=sc.nextLine();

       System.out.println("Introduzca su primer apellido");
       apellidoUno=sc.nextLine();

       System.out.println("Introduzca su segundo apellido");
       apellidoDos=sc.nextLine();

       union=nombre.substring(0, 3).toUpperCase() + apellidoUno.substring(0, 3).toUpperCase() + apellidoDos.substring(0, 3).toUpperCase();

       System.out.println("El nobre formado por la concatenación de las tres primeras letras del nombre y apellidos es "+union);
    }
}
