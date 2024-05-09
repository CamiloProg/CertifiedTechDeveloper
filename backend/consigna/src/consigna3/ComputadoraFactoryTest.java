package consigna3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputadoraFactoryTest {

    @Test
    @DisplayName("Test solo crear 1 instancia de windows")
    void testaaa(){
        Computadoras computadora1 = ComputadoraFactory.obtenerComputadora("Windows");
        Computadoras computadora2 = ComputadoraFactory.obtenerComputadora("Windows");
        Computadoras computadora3 = ComputadoraFactory.obtenerComputadora("Windows");


        assertEquals(1, Computadoras.getContador());
    }

    @Test
    @DisplayName("Test solo crear 2 instancia de windows")
    void testaaa2(){
        Computadoras computadora1 = ComputadoraFactory.obtenerComputadora("Windows");
        Computadoras computadora2 = ComputadoraFactory.obtenerComputadora("Mac16");
        Computadoras computadora3 = ComputadoraFactory.obtenerComputadora("Windows");


        assertEquals(1, Computadoras.getContador());
    }
}