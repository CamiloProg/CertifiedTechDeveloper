public abstract class Pizza {
    protected String nombre;
    protected String descripcion;

    public Pizza(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    public abstract double calcularPrecio();

    public String toString() {
        return "Pizza " + nombre + ": " + descripcion + " - Precio: $" + calcularPrecio();
    }
}
