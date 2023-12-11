/**
 * @author Ana Xiang López Martínez
 * Fecha: 23/11/23
 * Propósito: programa que pida una cadena de texto por teclado y luego muestre cada palabra
 * de la cadena en una línea distinta.
 */

public class Ejer1 {
    public static void main(String[] args) {
        String cadena1 = "Hola me llamo Ana";
        String palabras=" ";

        for (int i = 0; i < palabras.length(); i++){
            System.out.println(palabras.split(cadena1));
        }
    }        
}
