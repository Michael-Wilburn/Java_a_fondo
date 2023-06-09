package libro.cap02.colecciones;

public class MiCola<T> {
    private static final int capacidadInicial = 5;
    private MiColeccion<T> coll = new MiColeccion<T> (capacidadInicial);

    public void encolar(T elm){
        // agregue el elemento al final de la coleccion
        coll.agregar(elm);
    }

    public T desencolar(){
        //retorna y elimina de la collecion el primer elemento
        return coll.eliminar(0);
    }

}