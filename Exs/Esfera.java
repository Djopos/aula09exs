public class Esfera extends Figura3D {
    private double raio;

    public Esfera(double raio) {
        this.raio = raio;
    }

    @Override
    public double areaDaSuperficie() {
        return 4 * 3.14 * raio * raio;
    }

    @Override
    public double volume() {
        return (4 / 3) * 3.14 * raio * raio * raio;
    }
}
