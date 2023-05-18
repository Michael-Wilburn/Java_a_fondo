package libro.cap02.misclases;

public class FechaHora extends FechaDetallada{
    private int hora;
    private int minutos;
    private int segundos;

    public FechaHora(String sFecha, int hora,int min, int seg){
        super(sFecha);
        this.hora = hora;
        this.minutos = min;
        this.segundos = seg;
    }

    public String toString(){
        //invocamos al metodo toString de nuestro padre

        return super.toString() + " ("+hora+":"+minutos+":"+segundos+")";

    }
}
