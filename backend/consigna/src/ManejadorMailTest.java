import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManejadorMailTest {
    @Test
    @DisplayName("Checking manejador email")
    void test1() {
        Mail mail = new Mail("empresa@gmail.com", "comercial@colmena.com", "Comercial");
        ProcesaMail procesarMail = new ProcesaMail();
        String respuesta = procesarMail.cadenaResponsabilidad(mail);
        assertEquals("El mail sera enviado a comercial", respuesta);
    }
    @Test
    void test2() {
        Mail mail = new Mail("empresa@gmail.com", "tecnico@colmena.com", "tecnico");
        ProcesaMail procesarMail = new ProcesaMail();
        String respuesta = procesarMail.cadenaResponsabilidad(mail);
        assertEquals("El mail sera enviado a tecnico", respuesta);
    }
}