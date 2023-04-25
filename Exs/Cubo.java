public class Cubo extends Figura3D {
    private double aresta;

    public Cubo(double aresta) {
        this.aresta = aresta;
    }

    @Override
    public double areaDaSuperficie() {
        return 6 * aresta * aresta;
    }

    @Override
    public double volume() {
        return aresta * aresta * aresta;
    }
}
