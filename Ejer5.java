import java.util.Scanner;
/**
 * @author Ana Xiang López Martínez
 * Fecha: 23/11/23
 * Propósito: programa que lea una frase por teclado e indique si la frase es un palíndromo o 
 * no (ignorando espacios y sin diferenciar entre mayúsculas y minúsculas). Supondremos que
 * el usuario solo introducirá letras y espacios (ni comas, ni puntos, ni acentos, etc.). Un
 * palíndromo es un texto que se lee igual de izquierda a derecha que de derecha a izquierda
 */

public class Ejer5 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String frase ="";
    int i = 0;
    int j = frase.length() - 1;
    boolean esPalindromo = true;

    System.out.println("Introduce una frase: ");
    frase=sc.nextLine().toLowerCase().replaceAll(" ", "");

   

    while (i < j) {
        if (frase.charAt(i) != frase.charAt(j)) {
            esPalindromo = false;
            break;
        }
        i++;
        j--;
    }

    if (esPalindromo) {
        System.out.println("La frase es un palíndromo");
    } else {
        System.out.println("La frase no es un palíndromo");
    }


   } 
}
