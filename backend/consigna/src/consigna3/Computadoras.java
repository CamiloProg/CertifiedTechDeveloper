package consigna3;

public class Computadoras {
    private String tipo;
    private int RAM;
    private int discoDuro;
    private static int contador = 0;

    public Computadoras(String tipo, int RAM, int discoDuro) {
        this.tipo = tipo;
        this.RAM = RAM;
        this.discoDuro = discoDuro;
        contador++;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getDiscoDuro() {
        return discoDuro;
    }

    public void setDiscoDuro(int discoDuro) {
        this.discoDuro = discoDuro;
    }


    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Computadoras.contador = contador;
    }

    @Override
    public String toString() {
        return "Computadora" +
                "tipo='" + tipo + '\'' +
                ", RAM=" + RAM +
                ", discoDuro=" + discoDuro ;
    }
}
