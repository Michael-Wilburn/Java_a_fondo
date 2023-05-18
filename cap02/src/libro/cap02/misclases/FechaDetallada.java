package libro.cap02.misclases;

import libro.cap02.fechas.Fecha;

public class FechaDetallada extends Fecha {
    private static String meses[] = {
            "Enero","Febrero","Marzo",
            "Abril","Mayo","Junio",
            "Julio","Agosto","Septiembre",
            "Octubre","Noviembre","Diciembre"
    };

    public String toString(){
        return getDia()+" de "+meses[getMes()-1]+" de "+getAnio();
    };

    //invocamos al constructor del padre
    public FechaDetallada() {
        //invocamos al constructor de tres int pasando ceros
        this(0,0,0);
    }

    //invocamos al constructor del padre
    public FechaDetallada(String s) {
        super(s);
    }

    //invocamos al constructor del padre
    public FechaDetallada(int dia, int mes, int anio){
        super(dia,mes,anio);
    }

}
