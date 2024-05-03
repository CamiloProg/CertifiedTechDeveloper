public abstract class Pizza {
    private String nombre;
    private String descripcion;

    public Pizza(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public abstract int getPrecio();
}
