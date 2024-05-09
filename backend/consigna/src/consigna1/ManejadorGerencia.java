package consigna1;

public class ManejadorGerencia extends ManejadorMail {
    @Override
    public String comprobarMail(Mail mail) {
        if (mail.getTema().equalsIgnoreCase("gerencia") || mail.getDestino().equalsIgnoreCase("gerencia@colmena.com") ){
            return "El mail sera enviado a gerencia";
        }
        return getSiguiente().comprobarMail(mail);
    }
}
