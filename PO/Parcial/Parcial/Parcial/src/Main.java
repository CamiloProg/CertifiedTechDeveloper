public class Main {
    public static void main(String[] args) {
        Particular pacienteParticular = new Particular("01/02/2001","Juan", "Perez", true);
        Particular pacienteParticular1 = new Particular("01/02/2001","Jennifer", "Bernal", false);

        ObraSocial pacienteObraSocial1 = new ObraSocial("01/03/2002","Maria", "Gomez", false, "ObraSocialA", 23);
        ObraSocial pacienteObraSocial2 = new ObraSocial("07/09/2003","Carlos", "Lopez", true, "ObraSocialB", 52);

        if (pacienteParticular.debeHacerseEvaluacionInicial()) {

            System.out.println(pacienteParticular.nombre +" Debe realizar evaluación inicial para paciente particular");
        }else {
            System.out.println(pacienteParticular.nombre +" No debe realizar evaluación inicial para paciente particular");

        }
        if (pacienteParticular1.debeHacerseEvaluacionInicial()) {

            System.out.println(pacienteParticular1.nombre+" Realizar evaluación inicial para paciente particular");
        }else {
            System.out.println(pacienteParticular1.nombre+" No debe realizar evaluación inicial para paciente particular");

        }

        if (pacienteObraSocial1.debeHacerseEvaluacionInicial()) {

            System.out.println("Realizar evaluación inicial para paciente de obra social");
        }

        if (pacienteObraSocial1.esMayor(pacienteObraSocial2)) {
            System.out.println(pacienteObraSocial1.nombre + " " + pacienteObraSocial1.apellido + " es mayor que " + pacienteObraSocial2.nombre + " "+ pacienteObraSocial2.apellido);
        } else {
            System.out.println(pacienteObraSocial1.nombre +  " " + pacienteObraSocial1.apellido + " no es mayor que " + pacienteObraSocial2.nombre + " "+ pacienteObraSocial2.apellido);
        }
    }
}
