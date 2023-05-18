package libro.cap02.figuras;

public class Triangulo extends FiguraGeometrica{
    private double base;
    private double altura;

    public Triangulo(double b, double h){
        base = b;
        altura = h;
    }

    @Override
    public double area() {
        return base * altura / 2;
    }
}
