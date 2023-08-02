/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit_ej_05_validador_fechas;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Melina Narambuena
 */
public class DateValidatorTest {
    
    public DateValidatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of diaValido method, of class DateValidator.
     */
    @Test
    public void testDiaValido() {
        System.out.println("diaValido");
        int dia = 0;
        boolean diaValido = false;
        DateValidator instance = new DateValidator();
        instance.diaValido(dia, diaValido);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of mesValido method, of class DateValidator.
     */
    @Test
    public void testMesValido() {
        System.out.println("mesValido");
        int mes = 0;
        boolean mesValido = false;
        DateValidator instance = new DateValidator();
        instance.mesValido(mes, mesValido);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of anioBisiesto method, of class DateValidator.
     */
    @Test
    public void testAnioBisiesto() {
        System.out.println("anioBisiesto");
        int anio = 0;
        boolean anioBisiesto = false;
        DateValidator instance = new DateValidator();
        instance.anioBisiesto(anio, anioBisiesto);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
