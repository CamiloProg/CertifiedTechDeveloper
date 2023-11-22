public class Cliente {
    private String nombre;
    private String apellido;
    private String cedula;
    private double saldoDeudorEnCuenta;
    private double limite;
    private double deuda;

    public Cliente(String nombre, String apellido, String cedula, double limite) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.limite = limite;
        this.saldoDeudorEnCuenta = 0.0;
        this.deuda = 0.0;
    }
    public void comprar(double importe) throws ClienteException{
        if (saldoDeudorEnCuenta + importe < limite) {
            System.out.println("compra realizada");
        }else {
            throw new ClienteException("Superaste el limite")
        }
    }
}
