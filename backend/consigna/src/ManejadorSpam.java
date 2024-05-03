public class ManejadorSpam extends ManejadorMail {
    @Override
    public String comprobarMail(Mail mail) {
        return "Va a spam";
    }
}
