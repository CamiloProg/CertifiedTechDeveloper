public class ObraSocial extends Paciente{
    private String nombreObraSocial;
    private int numeroAsociado;


    public ObraSocial(String fechaNacimiento, String nombre, String apellido, Boolean esPrimerConsulta, String nombreObraSocial, int numeroAsociado) {
        super(fechaNacimiento, nombre, apellido, esPrimerConsulta);
        this.nombreObraSocial = nombreObraSocial;
        this.numeroAsociado = numeroAsociado;
    }

    public boolean esMayor(ObraSocial otroPaciente) {
        return this.numeroAsociado > otroPaciente.numeroAsociado;
    }

}
