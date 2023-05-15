package libro.cap02.fechas;

public class TestFecha3a {
    public static void main(String[] args) {
        //creo una fecha a partir de los tres valores por separado
        Fecha f1 = new Fecha(25,10,2004);

        //creo una fecha a partir de una cadena con formato dd/mm/aaaa
        Fecha f2 = new Fecha("25/10/2004");

        //trabajo con las fechas, no importa como fueron creadas
        if(f1.equals((f2))){
            System.out.println("Las Fechas son iguales");
        }
    }
}
