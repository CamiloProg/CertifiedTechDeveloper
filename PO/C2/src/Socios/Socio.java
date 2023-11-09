package Socios;

public class Socio {
    private Integer numeroSocio;
    private String nombre;
    private Double cuotaMensual;
    private String actividad;

    public Socio(Integer numeroSocio, String nombre, Double cuotaMensual, String actividad) {
        this.numeroSocio = numeroSocio;
        this.nombre = nombre;
        this.cuotaMensual = cuotaMensual;
        this.actividad = actividad;
    }

    public Double calcularCuotaMensual(){
        return cuotaMensual*1.05;
    }
}
