package libro.cap02.figuras;

public abstract class FiguraGeometrica {
    //metodo abstracto
    public abstract double area();

    public String toString() {
        return "area = " + area();
    }
}
