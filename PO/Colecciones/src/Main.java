import java.util.*;

public class Main {
    public static void main(String[] args) {
        Contacto contacto = new Contacto("Camilo", 121345);
        Contacto contacto2 = new Contacto("Juan", 12888);
        Contacto contacto3 = new Contacto("Danny", 11111);
         List<Contacto> listaContactos = new ArrayList<>();

         Map<String, Contacto> gestionContacto = new HashMap<>();

        listaContactos.add(contacto);
        listaContactos.add(contacto2);
        listaContactos.add(contacto3);
        String clave = contacto.getNombre()+contacto.getNumero();
        String clave2 = contacto.getNombre()+contacto.getNumero();
        String clave3 = contacto.getNombre()+contacto.getNumero();
        gestionContacto.put(clave,contacto);
        gestionContacto.put(clave2,contacto2);
        gestionContacto.put(clave3,contacto3);

        System.out.println("lista de contactos: ");
        for (Contacto contacto1 : listaContactos) {
            System.out.println(contacto1.getNombre()+ contacto1.getNumero());
        }
    }
}
