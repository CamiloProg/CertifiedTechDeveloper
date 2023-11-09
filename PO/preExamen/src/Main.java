public class Main {
    public static void main(String[] args) {
        Alumno alumno = new Alumno("camilo", "Martinez", 123 );
        ExamenParcial examenParcial = new ExamenParcial(alumno, "a", "enunciado", 1.5,1,2);
        System.out.println(examenParcial.esAprobado());
    }
}
