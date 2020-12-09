package tr.edu.medipol.yazilimaraclari;

import static org.junit.Assert.*;

import org.junit.Test;

public class HarfSaydirmaAppTest {

    @Test
    public void testHarfleriSaydir() {

        String cumle = "Medipol Universitesi";

        int sonuc = HarfSaydirmaApp.harfleriSaydir(cumle);

        assertEquals(19, sonuc);

    }

}