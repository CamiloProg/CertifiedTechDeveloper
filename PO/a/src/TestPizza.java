public class TestPizza {
    public static void main(String[] args) {
        Pizza pizzaMuzzarella = new Pizza("Pizza de Muzzarella", "", 700, false);
        Pizza pizzaMargaritaEspecial = new Pizza("Pizza Margarita Especial", "", 850, true);
        Pizza pizzaAnana = new Pizza("Pizza de Ananá", "", 950, false);
        PizzaCombinada pizzaCombinadaLoca = new PizzaCombinada(pizzaMargaritaEspecial, pizzaAnana);
        System.out.println(pizzaMuzzarella);
        System.out.println(pizzaMargaritaEspecial);
        System.out.println(pizzaAnana);
        System.out.println(pizzaCombinadaLoca);
    }
}
