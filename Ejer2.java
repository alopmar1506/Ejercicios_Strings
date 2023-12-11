import java.util.Scanner;
/**
 * @author Ana Xiang López Martínez
 * Fecha: 23/11/23
 * Propósito: programa que pida dos cadenas de texto por teclado y luego indique si son iguales,
 * además de si son iguales sin diferenciar entre mayúsculas y minúsculas.
 */

public class Ejer2 {
    public static void main(String[] args) {
        String cadena1=" ";
        String cadena2=" ";
        Scanner sc=new Scanner (System.in);

        System.out.println("Introduzca el contenido de la cadena 1");
        cadena1=sc.nextLine();

        System.out.println("Introduzca el contenido de la cadena2");
        cadena2=sc.nextLine();

        if(cadena1.compareToIgnoreCase(cadena2)!=0){
            System.out.println("Las cadenas no son iguales");
        }else{
            System.out.println("Las cadenas son iguales");
        }

    }
}
