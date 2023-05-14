package libro.cap02.fechas;

public class TestFecha {
    public static void main(String[] args) {
        Fecha f = new Fecha();
        /*
        f.dia = 2; // la variable dia es privada, no tenemos acceso
        f.dia = 10; //idem ...
        f.dia = 1970; // olvidalo ...
        */
        f.setDia(2);
        f.setMes(10);
        f.setAnio(1970);

        System.out.println("Dia = " + f.getDia());
        System.out.println("Mes = " + f.getMes());
        System.out.println("Anio = " + f.getAnio());
        //IMPIRMO LA FECHA COMPLETA con formato especifico gracias a la sobrescritura del metodo toString en la clas fecha
        System.out.println(f);
    }
}
