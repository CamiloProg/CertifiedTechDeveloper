public class PizzaSimple extends Pizza {
    private int precioBase;
    private boolean especial;

    public PizzaSimple(String nombre, String descripcion, int precioBase, boolean especial) {
        super(nombre, descripcion);
        this.precioBase = precioBase;
        this.especial = especial;
    }

    public int getPrecio() {
        if (especial) {
            return (int) (precioBase * 1.7);
        } else {
            return precioBase;
        }
    }

    public String toString() {
        return getNombre() + ": " + getPrecio() + " pesos";
    }
}
