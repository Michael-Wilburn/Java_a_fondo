package libro.cap01;

public class Cadenas5a {
    public static void main(String[] args) {
        //Obtengo el milisegundo actual
        long hi = System.currentTimeMillis();

        //Instancio un StringBuffer inicialmente vacio
         StringBuffer sb = new StringBuffer();

         //Voy a concatenar n caracteres
        int n = 100000;

        char c;
        for (int i = 0; i < n; i++) {
            //obtengo caracteres entre 'A' y 'Z'
            c = (char) ('A' + i % ('Z' - 'A'+1));

            //Concateno el caracter en el Stringbuffer
            sb.append(c);

        }
        //obtengo el milisegundo actual
        long hf = System.currentTimeMillis();

        //Muestro la cadena resultante
        System.out.println(sb.toString());

        //Muestro la cantidad de milisegundos insumidos
        System.out.println((hf-hi) + " milisegundos");


    }
}