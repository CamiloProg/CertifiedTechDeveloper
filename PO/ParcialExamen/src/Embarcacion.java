public class Embarcacion {
    private Capitan capitan;
    private int precioBase;
    private int valorAdicional;
    private int anioFabricacion;
    private double eslora; // Longitud en metros;

    public Embarcacion(Capitan capitan, int precioBase, int valorAdicional, int anioFabricacion, double eslora) {
        this.capitan = capitan;
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.anioFabricacion = anioFabricacion;
        this.eslora = eslora;
    }

    public Double montoAlquiles(){
        if (anioFabricacion >= 2020) {
            return (double)precioBase+valorAdicional;

        }else {
            return (double)precioBase;
        }
    }
}
