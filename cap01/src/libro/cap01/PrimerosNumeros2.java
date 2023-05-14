package libro.cap01;

import java.util.Scanner;

public class PrimerosNumeros2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        //leo el de n
        int n = scanner.nextInt();

        int i = 1;

        do {
            //Muestro el valor i por pantalla
            System.out.println(i);
            //Incremento el valor de i
            i++;
        } while(i <= n);
    }
}
