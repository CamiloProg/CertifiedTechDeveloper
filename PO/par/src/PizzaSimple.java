
public class PizzaSimple extends Pizza {
    private double precioBase;
    private boolean esGrande;

    public PizzaSimple(String nombre, String descripcion, double precioBase, boolean esGrande) {
        super(nombre, descripcion);
        this.precioBase = precioBase;
        this.esGrande = esGrande;
    }

    @Override
    public double calcularPrecio() {
        return esGrande ? precioBase * 2 : precioBase;
    }
}
