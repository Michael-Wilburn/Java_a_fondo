package libro.cap01;

import java.util.Scanner;

public class PrimerosNumeros1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        //leo el de n
        int n = scanner.nextInt();

        int i = 1;

        while(i <= n){
            //Muestro el valor i por pantalla
            System.out.println(i);

            //Incremento el valor de i
            i++;
        }
    }
}
