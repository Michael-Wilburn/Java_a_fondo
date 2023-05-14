package libro.cap01;

import java.util.StringTokenizer;

public class Cadenas7 {
    public static void main(String[] args) {
        String s = "Juan|Marcos|Carlos|Matias";
        StringTokenizer st = new StringTokenizer(s,"|");

        String tok;
        while(st.hasMoreTokens()){
            tok = st.nextToken();
            System.out.println(tok);
        }
    }
}
