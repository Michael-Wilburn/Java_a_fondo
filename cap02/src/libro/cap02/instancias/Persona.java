package libro.cap02.instancias;

import libro.cap02.fechas.Fecha;

public class Persona {
    private String nombre;              //atributo
    private String dni;                 //atributo
    private Fecha fechaDeNacimiento;    //atributo

    private int count = 0;

    public Persona(String nombre, String dni, Fecha fecNac) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaDeNacimiento = fecNac;
    }

    public String toString(){
        count ++;
        return nombre + ", DNI: "+dni
                      + ", nacido el: "+fechaDeNacimiento
                      + " ("+ count + ")";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Fecha getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Fecha fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
}
