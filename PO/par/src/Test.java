import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        // Crear pizzas simples
        PizzaSimple muzzarella = new PizzaSimple("Muzzarella", "chica", 700, false);
        PizzaSimple especial = new PizzaSimple("Especial", "chica", 850, false);
        PizzaSimple anana = new PizzaSimple("Ananá", "chica", 950, false);

        // Crear lista de pizzas para la pizza combinada
        List<Pizza> pizzasCombinada = new ArrayList<>();
        pizzasCombinada.add(especial);
        pizzasCombinada.add(anana);

        // Crear pizza combinada
        PizzaCombinada combinadaLoca = new PizzaCombinada("Combinada Loca", "mitad especial y mitad ananá", pizzasCombinada);

        // Mostrar las pizzas con sus precios
        System.out.println(muzzarella);
        System.out.println(especial);
        System.out.println(anana);
        System.out.println(combinadaLoca);
    }
}
