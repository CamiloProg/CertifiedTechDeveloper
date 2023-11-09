package presencial;

public abstract class Cuenta {
    protected double saldo;
    public abstract void extraer(double monto);

    public void depositar(double monto) {
        saldo = saldo + monto;
        System.out.println("nuevo saldo: " + saldo);
    }

    public void informarSaldo() {
        System.out.println("El saldo en tu cuenta es de: " + saldo);
    }

}
