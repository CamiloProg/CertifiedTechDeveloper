package Presencial;

import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int numero = scanner.nextInt();
        boolean primo = esPrimo(numero);
        System.out.println(primo);
        System.out.println("Ingresa 3 numeros");
        Integer numeroA = scanner.nextInt();
        Integer numeroB = scanner.nextInt();
        Integer numeroC = scanner.nextInt();
        Integer maxNum = maximoNumero(numeroA, numeroB,numeroC);
        System.out.println(maxNum);
        System.out.println("Ingresa 2 textos");
        String textoA = scanner.next();
        String textoB = scanner.next();
        boolean distinto = cadenaDistinta(textoA, textoB);
        System.out.println(distinto);
    }

    public static Integer maximoNumero(Integer numeroA, Integer numeroB, Integer numeroC){
        if (numeroA > numeroB && numeroA > numeroC) {
            return numeroA;
        }
        else if (numeroB > numeroA && numeroB > numeroC) {
            return numeroB;
        } else return numeroC;
    }

    public static boolean cadenaDistinta(String textoA, String textoB){
        if (textoA.equals(textoB)) {
           return true ;
        }else return false;
    }
    public static boolean esPrimo(int numero){
        if (numero == 0 || numero == 1) {
            return false;
        }
        for (int i = 2; i < numero ; i++) {
            if (numero % i == 0){
                return false;
            }
        }
        return true;
    }
}
