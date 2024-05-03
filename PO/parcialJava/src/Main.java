public class Main {
    public static void main(String[] args) {
        Pizza muzzarella = new PizzaSimple("Muzzarella", "Pizza de muzzarella", 700, true);
        Pizza margarita = new PizzaSimple("Margarita", "Pizza margarita especial", 850, false);
        Pizza anana = new PizzaSimple("Ananá", "Pizza de ananá", 950, false);
        Pizza loca = new PizzaCombinada("Loca", "Pizza combinada loca", margarita, anana);

        System.out.println(muzzarella);
        System.out.println(margarita);
        System.out.println(anana);
        System.out.println(loca);
    }
}
