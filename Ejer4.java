import java.util.Scanner;
/**
 * @author Ana Xiang López Martínez
 * Fecha: 23/11/23
 * Propósito: programa que muestre por pantalla cuantas vocales de cada tipo hay (cuantas ‘a’,
 * cuantas ‘e’, etc.) en una frase introducida por teclado. No se debe diferenciar entre
 * mayúsculas y minúsculas. Por ejemplo dada la frase “Mi mama me mima” dirá que hay:
 */

public class Ejer4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase="";
        int a = 0; 
        int e = 0; 
        int i = 0;
        int o = 0;
        int u = 0;

        System.out.println("Introduce una frase: ");
        frase=sc.nextLine().toLowerCase();

        for (int j = 0; j < frase.length(); j++) {
            char letra = frase.charAt(j);
            if (letra == 'a') {
                a++;
            } else if (letra == 'e') {
                e++;
            } else if (letra == 'i') {
                i++;
            } else if (letra == 'o') {
                o++;
            } else if (letra == 'u') {
                u++;
            }
        }
        System.out.println("Número de a es : " + a);
        System.out.println("Número de e es: " + e);
        System.out.println("Número de i es: " + i);
        System.out.println("Número de o es: " + o);
        System.out.println("Número de u es: " + u);
    }
}

