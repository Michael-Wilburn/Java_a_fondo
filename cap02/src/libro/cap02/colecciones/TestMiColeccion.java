package libro.cap02.colecciones;

import java.util.Scanner;

public class TestMiColeccion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //creo una coleccion con capacidad inicial = 5
        MiColeccion<String> mc = new MiColeccion<String>(5);

        //leo el primer nombre
        System.out.print("Ingrese Nombre: ");
        String nom = scanner.next();

        while(!nom.equals("FIN")){
            //inserto siempre en la posicion 0
            mc.insertar(nom,0);

            //leo el siguiente nombre
            nom =scanner.next();
        }

        String aux;

        //recorro la coleccion y tomo cada uno de sus elementos
        for (int i = 0; i < mc.cantidad(); i++) {
            //no es necesario castear porque el metodo obtener retorna un string
            aux = mc.obtener(i);
            System.out.println(aux + " - "+aux.length() + " caracteres");
        }

    }
}
