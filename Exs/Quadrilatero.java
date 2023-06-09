public class Quadrilatero extends Figura2D {
    private double lado1;
    private double lado2;
    private double lado3;
    private double lado4;

    public Quadrilatero(double lado1, double lado2, double lado3, double lado4) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.lado4 = lado4;
    }

    @Override
    public double area() {
        return 0; //implementar o cálculo da área para quadriláteros específicos
    }

    @Override
    public double perimetro() {
        return lado1 + lado2 + lado3 + lado4;
    }
}
