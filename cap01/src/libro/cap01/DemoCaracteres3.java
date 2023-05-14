package libro.cap01;

public class DemoCaracteres3 {
    public static void main(String[] args) {
        char c;
        for (int i = 'A'; i <= 'Z' ; i++) {
            //Para asignar un int en un char desbemos "Castear"
            c = (char) i;
            System.out.print(c);
        }
    }
}
