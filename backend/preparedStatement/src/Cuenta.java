public class Cuenta {
    private Integer id;
    private Integer numeroCuenta;
    private String nombre;
    private double saldo;

    public Cuenta(Integer id, Integer numeroCuenta, String nombre, double saldo) {
        this.id = id;
        this.numeroCuenta = numeroCuenta;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public Cuenta(Integer numeroCuenta, String nombre, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(Integer numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta" +
                "id=" + id +
                ", numeroCuenta=" + numeroCuenta +
                ", nombre='" + nombre + '\'' +
                ", saldo=" + saldo;
    }
}
