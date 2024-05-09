package consigna1;

public class ProcesaMail {

    public String cadenaResponsabilidad(Mail mail){
        ManejadorMail manejador1 = new ManejadorGerencia();
        ManejadorMail manejador2 = new ManejadorComercial();
        ManejadorMail manejador3 = new ManejadorTecnico();
        ManejadorMail manejador4 = new ManejadorSpam();

        manejador1.setSiguiente(manejador2);
        manejador2.setSiguiente(manejador3);
        manejador3.setSiguiente(manejador4);

        return manejador1.comprobarMail(mail);

    }

}
