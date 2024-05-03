import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        PizzaSimple muzzarella = new PizzaSimple("Muzzarella", "Queso mozzarella", 700, false);
        PizzaSimple margaritaEspecial = new PizzaSimple("Margarita Especial", "Margarita pero mas especial", 850, true);
        PizzaSimple anana = new PizzaSimple("Ananá", "Pizza con fruta", 950, false);

        // Crear lista de pizzas para la pizza combinada
        List<Pizza> pizzasCombinada = new ArrayList<>();
        pizzasCombinada.add(margaritaEspecial);
        pizzasCombinada.add(anana);

        // Crear pizza combinada
        PizzaCombinada combinadaLoca = new PizzaCombinada("Combinada Loca", "que es mitad margarita especial y mitad ananá", pizzasCombinada);

        // Mostrar las pizzas con sus precios
        System.out.println(muzzarella);
        System.out.println(margaritaEspecial);
        System.out.println(anana);
        System.out.println(combinadaLoca);

    }
}
