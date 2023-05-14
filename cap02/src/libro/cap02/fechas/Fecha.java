package libro.cap02.fechas;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    //Reescribiendo el metodo toString para poder visualizar el objeto con el crorrecto formato por consola
    public String toString(){
        //retorna una cadena tal como queremos que se vea la fecha
        return dia+"/"+mes+"/"+anio;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

}
