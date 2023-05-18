package libro.cap02.estaticas;

public final class TestEstatico {
    private int a = 0;

    public void unMetodo(){
        System.out.println("este es unMetodo()");
    }

    public static void main(String[] args) {

        TestEstatico t = new TestEstatico();

        //no tengo acceso a la variable a
        System.out.println("a vale "+ t.a); //Error no compila

        //no tengo acceso al metodo unMetodo
        t.unMetodo(); //Error no compila

    }
}
