package padroesestruturais.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedidaTest {

    @Test
    void deveRetornarMedidaEmMilhas() {
        Medida medida = new Medida();
        assertEquals(0.621371f, medida.getMilhas(1));
        assertEquals(2.4047055f, medida.getMilhas(3.87f));
    }

    @Test
    void deveRetornarMedidaEmKM() {
        Medida medida = new Medida();
        assertEquals(1.60934f, medida.getKM(1));
        assertEquals(0.24233466f, medida.getMilhas(0.39f));
    }
}