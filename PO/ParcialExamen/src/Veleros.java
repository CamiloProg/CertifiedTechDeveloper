public class Veleros extends Embarcacion {
    private int cantidadMastiles;
    public Veleros(Capitan capitan, int precioBase, int valorAdicional, int anioFabricacion, double eslora) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, eslora);
    }
    public Boolean esGrande(Veleros){
        return cantidadMastiles > 4;
    }
}
