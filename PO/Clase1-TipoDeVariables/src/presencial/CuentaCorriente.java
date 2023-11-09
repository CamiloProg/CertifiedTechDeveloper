package presencial;

public class CuentaCorriente extends Cuenta implements GravadorImpuesto  {
private double permitidoDescubierto;
    @Override
    public void extraer(double monto) {
    if(monto <= saldo +permitidoDescubierto){
        saldo-= monto;
        System.out.println("saldo remanente: "+ saldo);
    }else {
        System.out.println("excedente en fondos");
    }
    }

    @Override
    public double gravar(double porcentaje) {
        return 0;
    }
}
