/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class UsuarioDAOTest {
    
    public UsuarioDAOTest() {
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
     * Test of login method, of class UsuarioDAO.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        String user = "";
        String pass = "";
        int cod = 0;
        UsuarioDAO instance = new UsuarioDAO();
        
        Usuario usuario = new Usuario(1,"cristi","12345abc");
        
        
        Usuario expResult = null;
        Usuario result = instance.login(user, pass, cod);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of existUsuario method, of class UsuarioDAO.
     */
    @Test
    public void testExistUsuario() {
        System.out.println("existUsuario");
        String user = "";
        UsuarioDAO instance = new UsuarioDAO();
        boolean expResult = true;
        boolean result = instance.existUsuario(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertUsuario method, of class UsuarioDAO.
     */
    @Test
    public void testInsertUsuario() {
        System.out.println("insertUsuario");
        String nombre = "";
        String usuario = "";
        String correo = "";
        String password = "";
        UsuarioDAO instance = new UsuarioDAO();
        boolean expResult = true;
        boolean result = instance.insertUsuario(nombre, usuario, correo, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
