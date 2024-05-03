import java.util.List;

public class PizzaCombinada extends Pizza {
    private List<Pizza> pizzas;

    public PizzaCombinada(String nombre, String descripcion, List<Pizza> pizzas) {
        super(nombre, descripcion);
        this.pizzas = pizzas;
    }

    @Override
    public double calcularPrecio() {
        double precioMaximo = 0;
        for (Pizza pizza : pizzas) {
            double precioPizza = pizza.calcularPrecio();
            if (precioPizza > precioMaximo) {
                precioMaximo = precioPizza;
            }
        }
        return precioMaximo;
    }
}
