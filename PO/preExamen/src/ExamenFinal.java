public class ExamenFinal extends  Examen{

    private int notaOral;
    private String temaOral;
    public ExamenFinal(Alumno alumno, String titulo, String enunciado, Double nota) {
        super(alumno, titulo, enunciado, nota);
    }

    public ExamenFinal(Alumno alumno, String titulo, String enunciado, Double nota, int notaOral, String temaOral) {
        super(alumno, titulo, enunciado, nota);
        this.notaOral = notaOral;
        this.temaOral = temaOral;
    }
    public Boolean esMayorQue(ExamenFinal otroExamenFinal){
        double promedioExamen1 = (double)(notaOral + nota) /2;
        double promedioExamen2 = (double)(otroExamenFinal.notaOral + otroExamenFinal.nota) /2;
        return promedioExamen1>promedioExamen2;
    }
}
