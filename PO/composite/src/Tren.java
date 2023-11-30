import java.util.ArrayList;

public class Tren {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(4,5);
        Circulo circulo1 = new Circulo(1);
        Circulo circulo2 = new Circulo(1);
        Circulo circulo3 = new Circulo(1);
        Triangulo triangulo = new Triangulo(3,2);

        ComboFiguras vagon = new ComboFiguras();
        vagon.agregarFigura(rectangulo);
        vagon.agregarFigura(circulo1);
        vagon.agregarFigura(circulo2);
        vagon.agregarFigura(circulo3);

        double areaTotal = vagon.calcularArea();
        System.out.println(areaTotal);
    }
}
