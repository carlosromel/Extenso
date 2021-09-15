/*
 * Copyright(c) 2012 Carlos Romel Pereira da Silva <carlos.romel@gmail.com>
 */
package br.eti.romel.lounge.extenso;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * @author <a href="carlos.romel@gmail.com">Carlos Romel</a>
 */
public class FormatadoTest {

    @Test
    public void testFormatado() {
        final Double valor = (Double) 1.01;
        final String extenso = new Extenso(valor).toStringFormatted();
        final String esperado = "Um real e um centavo.";
        
        assertEquals(esperado, extenso);
    }
}
