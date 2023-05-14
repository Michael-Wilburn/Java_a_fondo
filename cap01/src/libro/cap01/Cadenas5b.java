package libro.cap01;

public class Cadenas5b {
    public static void main(String[] args) {
        //Obtengo el milisegundo actual
        long hi = System.currentTimeMillis();

        //Voy a concatenar n caracteres
        int n = 100000;

        char c;
        String s="";
        for (int i = 0; i < n; i++) {
            //obtengo caracteres entre 'A' y 'Z'
            c = (char) ('A' + i % ('Z' - 'A'+1));

            //Concateno el caracter c utilizando el operado +
            s = s + c;
        }

        //obtengo el milisegundo actual
        long hf = System.currentTimeMillis();

        //Muestro la cadena resultante
        System.out.println(s);

        //Muestro la cantidad de milisegundos insumidos
        System.out.println((hf-hi) + " milisegundos");
    }
}
