package consigna1;

public class ManejadorTecnico extends ManejadorMail {

    @Override
    public String comprobarMail(Mail mail) {
        if (mail.getTema().equalsIgnoreCase("tecnico") || mail.getDestino().equalsIgnoreCase("tecnico@colmena.com") ){
            return "El mail sera enviado a tecnico";
        }

        return getSiguiente().comprobarMail(mail);

    }
}
