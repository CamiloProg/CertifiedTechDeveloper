package consigna4;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class ListaNumero {
    private static Logger LOGGER = Logger.getLogger(ListaNumero.class);
    List<Integer> lista = new ArrayList<>();

    public void agregarNumeros(Integer numero){
        lista.add(numero);
        if (lista.size() > 5){
            LOGGER.info("tiene mas de 5");
        }
        if (lista.size() > 10){
            LOGGER.info("tiene mas de 10");
        }

    }
    public double promedio(){
        double promedio = 0;
        Integer suma = 0;
        for (Integer numero: lista){
            suma += numero;
        }
        try{
             promedio = (double) suma / lista.size();

        }catch (Exception e){
            LOGGER.error(e.getMessage());
        }

        return promedio;
    }
}
