package consigna3;

import java.util.HashMap;

public class ComputadoraFactory {

    private static final HashMap<String, Computadoras> poolComputadoras = new HashMap<>();

    public static Computadoras obtenerComputadora(String tipo){

   Computadoras computadora = poolComputadoras.get(tipo);
        System.out.println("encontrado"+ tipo);

   if (computadora == null){
    switch (tipo ){
        case "Windows": {
            computadora = new Computadoras(tipo, 2,128);
            System.out.println("Crada"+ tipo);
        }
        case "Mac16":{
            computadora = new Computadoras(tipo, 16,500);
            System.out.println("Crada"+ tipo);

        break;
        }
        default:
            System.out.println("No existe " + tipo);
    }
    poolComputadoras.put(tipo, computadora);
   }
   return computadora;

    }
}
