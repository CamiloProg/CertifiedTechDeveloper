public class Yates extends Embarcacion{
    private int cantidadCamarotes;
    public Yates(Capitan capitan, int precioBase, int valorAdicional, int anioFabricacion, double eslora) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, eslora);
    }

    public Boolean esMasLujoso(Yates otrosYates){
        return cantidadCamarotes> otrosYates.cantidadCamarotes;
    }
}
