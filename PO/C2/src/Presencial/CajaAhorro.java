package Presencial;

public class CajaAhorro {
    private String titular;
    private String cbu;
    private String alias;
    private double saldo;

    public CajaAhorro(String titular, String cbu, String alias, String saldo) {
        this.titular = titular;
        this.cbu = cbu;
        this.alias = alias;

    }

    public String depositar (Double montoDeposito){
        this.saldo= +saldo+montoDeposito;
        return "deposito exitoso";
    }
    public String getTitular() {
        return titular;
    }

    public String getCbu() {
        return cbu;
    }

    public String getAlias() {
        return alias;
    }
}




