public class PizzaSimple extends Pizza {
    protected double precioBase;
    protected boolean esEspecial;


    public PizzaSimple(String nombre, String descripcion, double precioBase, boolean esEspecial) {
        super(nombre, descripcion);
        this.precioBase = precioBase;
        this.esEspecial = esEspecial;
    }

    @Override
    public double calcularPrecio() {
        return esEspecial ? precioBase * 1.7 : precioBase ;
    }
}
