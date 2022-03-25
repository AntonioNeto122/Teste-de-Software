package test;

import main.NotaBimestral;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotaBimestralTest {

    NotaBimestral nota = new NotaBimestral();

    @Test
    public void testeParticaoEquivalencia() {
        
        assertEquals("Nota Válida", nota.nota(7));
        assertEquals("Nota Inválida", nota.nota(-1));
        assertEquals("Nota Inválida", nota.nota(12));
    }

    @Test
    public void testeAnaliseValorLimite() {
       
        assertEquals("Nota Inválida", nota.nota(-1));
        assertEquals("Nota Válida", nota.nota(0));
        assertEquals("Nota Válida", nota.nota(10));
        assertEquals("Nota Inválida", nota.nota(11));
    }
}