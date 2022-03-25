package test;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.Ano;

import static org.junit.jupiter.api.Assertions.*;

class AnoTest {
    Ano ano = new Ano();

    @Test
    public void testeParticaoEquivalencia() {
        
        Assertions.assertEquals("Data Inválida", ano.tempAno(1800));
        Assertions.assertEquals("Data Válida", ano.tempAno(1922));
        Assertions.assertEquals("Data Inválida", ano.tempAno(2021));
    }

    @Test
    public void testeAnaliseValorLimite() {
       
        Assertions.assertEquals("Data Inválida", ano.tempAno(1899));
        Assertions.assertEquals("Data Válida", ano.tempAno(1900));
        Assertions.assertEquals("Data Válida", ano.tempAno(2020));
        Assertions.assertEquals("Data Inválida", ano.tempAno(2021));
    }

}