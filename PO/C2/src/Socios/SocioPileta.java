package Socios;

public class SocioPileta extends Socio {

    private Double costoPileta;
    private Boolean estaHabilitado;

    public SocioPileta(Integer numeroSocio, String nombre, Double cuotaMensual, String actividad, Double costoPileta) {
        super(numeroSocio, nombre, cuotaMensual, actividad);
        this.costoPileta = costoPileta;
    }

    @Override
    public Double calcularCuotaMensual() {
        if (estaHabilitado == true) {
            return super.calcularCuotaMensual()+costoPileta;

        }else {
            return super.calcularCuotaMensual();
        }
    }
    public void habilitacion(){
        estaHabilitado = true;
    }
    public void deshabilitacion(){
        estaHabilitado = false;
    }
}
