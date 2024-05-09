package consigna1;

public class ManejadorComercial extends ManejadorMail{
    @Override
    public String comprobarMail(Mail mail) {
        if (mail.getTema().equalsIgnoreCase("comercial") || mail.getDestino().equalsIgnoreCase("comercial@colmena.com") ){
            return "El mail sera enviado a comercial";
        }
        return getSiguiente().comprobarMail(mail);
    }
}
