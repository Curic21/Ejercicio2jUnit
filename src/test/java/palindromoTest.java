

import com.mycompany.ejercicio02junit.palindromo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jordi Eslava Barrera
 * @version 1.00
 */
public class palindromoTest {

    public palindromoTest() {
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
    

    @Test
    public void testJunit() {
        System.out.println("test: testJunit");
        palindromo oTest = new palindromo();
        assertNotNull("objeto palindromo creado", oTest);
        assertEquals("Tiene que devolver la palabra seres", oTest.getPalindromo("seres"), "seres");
        assertTrue("gePalindromo: Debe devolver seres", "seres".equals(oTest.getPalindromo("seres")));
        if ("seres" != oTest.getPalindromo("seres")) {
            fail("getPalindromo: Debe devolver seres ");
        }      
        assertSame("prueba getReference", oTest, oTest.getReference());
        assertNotSame("no son el mismo objeto", oTest);
    }
}
