package co.trystan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    
    public void leapYearsTest() {
        assertEquals(true, App.leapYears(2020)); // On test une insertion, qui doit retourner "true" quand on execute la fonction "leapYears", dans la class "App", avec comme paramètre (2020) 
        assertEquals(false, App.leapYears(2021));
        assertEquals(false, App.leapYears(1989));
        assertEquals(false, App.leapYears(2200));
    }

    @Test

    public void fooBarQixTest(){
        assertEquals("Foo", App.fooBarQix(6));
        assertEquals("BarBar", App.fooBarQix(5));
        //assertEquals("QixQix", App.fooBarQix(77));
        //assertEquals("BarBar", App.fooBarQix(555));
    }

    @Test

    public void numberInWordsTest() {
        assertEquals("zero", App.numberInWords(0));
        assertEquals("un", App.numberInWords(1));
        assertEquals("dix", App.numberInWords(10));
        assertEquals("douze", App.numberInWords(12));
    }
    
}

