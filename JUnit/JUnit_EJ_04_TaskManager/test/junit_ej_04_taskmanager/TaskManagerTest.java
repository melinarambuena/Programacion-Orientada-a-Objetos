/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit_ej_04_taskmanager;

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
public class TaskManagerTest {
    
    public TaskManagerTest() {
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
     * Test of inicializarAgregar method, of class TaskManager.
     */
    @Test
    public void testInicializarAgregar() {
        System.out.println("inicializarAgregar");
        String e = "";
        TaskManager instance = new TaskManager();
        instance.inicializarAgregar(e);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar method, of class TaskManager.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        TaskManager instance = new TaskManager();
        instance.eliminar();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of recorrer method, of class TaskManager.
     */
    @Test
    public void testRecorrer() {
        System.out.println("recorrer");
        TaskManager instance = new TaskManager();
        instance.recorrer();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
