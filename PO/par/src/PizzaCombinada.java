import java.util.List;

public class PizzaCombinada extends Pizza {
    private List<Pizza> pizzas;

    public PizzaCombinada(String nombre, String descripcion, List<Pizza> pizzas) {
        super(nombre, descripcion);
        this.pizzas = pizzas;
    }

    @Override
    public double calcularPrecio() {
        double precioTotal = 0;
        int cantidadPizzas = pizzas.size();

        if (cantidadPizzas > 0) {
            for (Pizza pizza : pizzas) {
                precioTotal += pizza.calcularPrecio();
            }

            precioTotal /= cantidadPizzas;
        }

        return precioTotal;
    }

}
