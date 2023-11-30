import java.util.ArrayList;
import java.util.List;

public class ComboFiguras extends Figura {
    private List<Figura> figuras = new ArrayList<>();

    public void agregarFigura(Figura figura){
        figuras.add(figura);
    }

    @Override
    public double calcularArea() {
        double areaTotal = 0;
        for (Figura figura: figuras){
            areaTotal+= figura.calcularArea();
        }
        return areaTotal;
    }
}
