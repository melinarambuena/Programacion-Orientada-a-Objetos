/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit_ej_03_validador_contrasenas;

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
public class validador_de_contrasenasTest {
    
    public validador_de_contrasenasTest() {
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
     * Test of PasswordValidator method, of class validador_de_contrasenas.
     */
    @Test
    public void testPasswordValidator() {
        System.out.println("PasswordValidator");
        char j = ' ';
        String contrasena = "";
        String letra = "";
        boolean bandera = false;
        boolean especialC = false;
        boolean especialMin = false;
        validador_de_contrasenas instance = new validador_de_contrasenas();
        boolean expResult = false;
        boolean result = instance.PasswordValidator(j, contrasena, letra, bandera, especialC, especialMin);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
