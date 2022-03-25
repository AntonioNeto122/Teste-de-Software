package test;

import main.Motorista;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MotoristaTest {

    Motorista motorista = new Motorista();

    @Test
    void testeParticaoEquivalencia() {
        
        assertEquals("Renovação a cada 10 anos!", motorista.renova_cnh(39));
        assertEquals("Renovação a cada 5 anos!", motorista.renova_cnh(59));
        assertEquals("Renovação a cada 3 anos!", motorista.renova_cnh(78));
    }


    @Test
    void testeAnaliseValorLimite() {
        
        assertEquals("Renovação a cada 10 anos!", motorista.renova_cnh(49));
        assertEquals("Renovação a cada 5 anos!", motorista.renova_cnh(51));
        assertEquals("Renovação a cada 3 anos!", motorista.renova_cnh(71));
    }
}