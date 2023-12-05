import java.util.ArrayList;
import java.util.List;

// Clase base para todas las ofertas académicas
abstract class OfertaAcademica {
    private String nombre;
    private String descripcion;

    public OfertaAcademica(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    // Método abstracto para calcular el precio
    public abstract double calcularPrecio();
}

// Clase para representar cursos individuales
class Curso extends OfertaAcademica {
    private int cargaHorariaMensual;
    private int duracionMeses;
    private double valorHora;

    public Curso(String nombre, String descripcion, int cargaHorariaMensual, int duracionMeses, double valorHora) {
        super(nombre, descripcion);
        this.cargaHorariaMensual = cargaHorariaMensual;
        this.duracionMeses = duracionMeses;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularPrecio() {
        return cargaHorariaMensual * duracionMeses * valorHora;
    }
}

// Clase para representar programas intensivos que consisten en varios cursos
class ProgramaIntensivo extends OfertaAcademica {
    private List<Curso> cursos;
    private double bonificacionPorcentaje;

    public ProgramaIntensivo(String nombre, String descripcion, double bonificacionPorcentaje) {
        super(nombre, descripcion);
        this.cursos = new ArrayList<>();
        this.bonificacionPorcentaje = bonificacionPorcentaje;
    }

    // Agregar un curso al programa intensivo
    public void agregarCurso(Curso curso) {
        cursos.add(curso);
    }

    @Override
    public double calcularPrecio() {
        double precioTotalCursos = cursos.stream().mapToDouble(Curso::calcularPrecio).sum();
        double bonificacion = precioTotalCursos * (bonificacionPorcentaje / 100);
        return precioTotalCursos - bonificacion;
    }
}

// Clase Test con el método main
 class InstitutoTest {
    public static void main(String[] args) {
        // Crear cursos
        Curso frontEnd = new Curso("Front End", "Curso de diseño web", 16, 2, 1000);
        Curso backEnd = new Curso("Back End", "Curso de desarrollo backend", 20, 2, 900);

        // Crear programa intensivo y agregar cursos
        ProgramaIntensivo fullStack = new ProgramaIntensivo("FullStack", "Programa intensivo de desarrollo web", 20);
        fullStack.agregarCurso(frontEnd);
        fullStack.agregarCurso(backEnd);

        // Generar informe
        generarInforme(frontEnd, backEnd, fullStack);
    }

    // Método para generar el informe
    private static void generarInforme(OfertaAcademica... ofertas) {
        System.out.println("Informe de Ofertas Académicas:");
        for (OfertaAcademica oferta : ofertas) {
            System.out.println("Nombre: " + oferta.getNombre());
            System.out.println("Descripción: " + oferta.getDescripcion());
            System.out.println("Precio: " + oferta.calcularPrecio() + " pesos");
            System.out.println("-----------------------------");
        }
    }
}
