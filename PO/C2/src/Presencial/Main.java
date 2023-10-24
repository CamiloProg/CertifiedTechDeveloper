package Presencial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Ingresa el nombre del caballo");
//        String nombre = scanner.nextLine();
//        System.out.println("El caballo se llama: " + nombre);
//        System.out.println("Ingresa la edad del caballo");
//        int edad = scanner.nextInt();
//        System.out.println("El caballo tiene: " + edad + " anios");
//        scanner.close();

        Scanner scanner = new Scanner(System.in);
//        System.out.println("ingresa tu nombre y luego tu apellido");
//        String nombre = scanner.nextLine();
//        String apellido = scanner.nextLine();
//        String iniciales = obtenerIniciales(nombre,apellido);
//        System.out.println(iniciales);

        int dia = scanner.nextInt();
        int mes = scanner.nextInt();
        int anio = scanner.nextInt();
        String fechaNacimiento = obtenerFecha(dia, mes, anio);
        System.out.println(fechaNacimiento);

    }

    public static String obtenerIniciales(String nombre, String apellido){
        char inicialNombre = nombre.charAt(0);
        char inicialApellido = apellido.charAt(0);
        return inicialNombre +  " " + inicialApellido;
    }
    public static String obtenerFecha(int dia, int mes, int anio){

        String diaStr = String.format("%02d", dia);
        String mesStr = String.format("%02d", mes);
        return diaStr + "/" + mesStr + "/" + anio;

    }
}
