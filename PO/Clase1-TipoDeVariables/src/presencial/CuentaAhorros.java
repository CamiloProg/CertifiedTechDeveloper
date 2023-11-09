package presencial;

public class CuentaAhorros extends Cuenta {
    private static final double INTERESES_CAJA_AHORRO = 1.2;

    @Override
    public void extraer(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
            System.out.println("monto exitoso");
        }else {
            System.out.println("no tienes fondos suficientes");
        }
    }
    public  void cobrarIntereses(){
        saldo += saldo*(INTERESES_CAJA_AHORRO/100);
    }
}
