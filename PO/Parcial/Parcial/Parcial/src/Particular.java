public class Particular extends Paciente{
    public Particular(String fechaNacimiento, String nombre, String apellido, Boolean esPrimerConsulta) {
        super(fechaNacimiento, nombre, apellido, esPrimerConsulta);
    }
    private int costoConsulta;
    private int DNI;

}
