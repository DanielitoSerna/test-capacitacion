package org.personalsoft;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculadoraTest {
	
	Calculadora  calculadora = new Calculadora(2, 2);

	@Test
    public void testSuma() {
		
        assertEquals(4, calculadora.getPrimerNumero() + calculadora.getSegundoNumero());
    }
	
	@Test
    public void testResta() {
		int valor = 0;
        assertEquals(0, calculadora.getPrimerNumero() - calculadora.getSegundoNumero());
    }
}
