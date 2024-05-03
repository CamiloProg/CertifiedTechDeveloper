public class PizzaCombinada extends Pizza {
    private Pizza pizza1;
    private Pizza pizza2;

    public PizzaCombinada(String nombre, String descripcion, Pizza pizza1, Pizza pizza2) {
        super(nombre, descripcion);
        this.pizza1 = pizza1;
        this.pizza2 = pizza2;
    }

    public int getPrecio() {
        return pizza1.getPrecio() + pizza2.getPrecio();
    }

    public String toString() {
        return getNombre() + ": " + getPrecio() + " pesos";
    }
}
