package libro.cap02.fechas;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    //retorna la fecha expresada en dias
    private int fechaToDias() {
        return anio * 360 + mes * 30 + dia;
    }

    //asigna la fecha expresada en dias a los atributos
    private void diasToFecha(int i){
        //dividimos por 360 y obtenemos el anio
        anio = (int) i/360;

        // del resto de la division anterior
        // podemos obtener el mes y el dia
        int resto = i % 360;

        // el mes es el resto dividido
        mes = (int) resto/30;

        // el resto de la division anterior son los dias
        dia = resto % 30;

        // ajuste por si dia quedo en cero
        if(dia == 0){
            dia = 30;
            mes --;
        }
    }
    public void addDias(int d){
        //convierto la fecha a dias y le sumo d
        int sum = fechaToDias() + d;

        // la fecha resultante (sum) la separo en dia, mes y anio
        diasToFecha(sum);
    }



    //Constructor
    public Fecha(int d,int m, int a){
        dia = d;
        mes = m;
        anio = a;
    }

    // Sobrecarga del metodo Constructor este sin argumentos
    public Fecha(){

    }

    public Fecha (String s){
        //Busco la primera ocurrencia de '/'
        int pos1 = s.indexOf('/');

        //Busco la ultima ocurrencia de '/'
        int pos2 = s.lastIndexOf('/');

        // Proceso el dia
        String sDia = s.substring(0,pos1);
        dia = Integer.parseInt(sDia);

        // Proceso el mes
        String sMes = s.substring(pos1+1,pos2);
        mes = Integer.parseInt(sMes);

        // Proceso el anio
        String sAnio = s.substring(pos2+1);
        anio = Integer.parseInt((sAnio));


    }

    //Sobrescribimos el metodo equals que heredamos de object
    public boolean equals(Object o){
        Fecha otra = (Fecha) o;
        return (dia==otra.dia && mes==otra.mes && anio==otra.anio);
    }

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
