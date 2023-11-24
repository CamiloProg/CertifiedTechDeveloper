public class Paciente {
    private String fechaNacimiento;
    protected String nombre;
    protected String apellido;
    private Boolean esPrimerConsulta;

    public Paciente(String fechaNacimiento, String nombre, String apellido, Boolean esPrimerConsulta) {
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.esPrimerConsulta = esPrimerConsulta;
    }

    public Boolean debeHacerseEvaluacionInicial(){
        if (esPrimerConsulta) {
            return true;
        }else{
            return false;
        }
    }
}
