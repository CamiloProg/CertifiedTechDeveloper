public class ExamenParcial extends Examen {

    private int unidad;
    private int intentos;
    public ExamenParcial(Alumno alumno, String titulo, String enunciado, Double nota) {
        super(alumno, titulo, enunciado, nota);
    }

    public ExamenParcial(Alumno alumno, String titulo, String enunciado, Double nota, int unidad, int intentos) {
        super(alumno, titulo, enunciado, nota);
        this.unidad = unidad;
        this.intentos = intentos;
    }

    public Boolean esRecuperable(){
        if(intentos <= 3){
            return true;
        }else {
            return false;
        }
    }
}
