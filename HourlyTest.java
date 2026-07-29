/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package personshourly;

import java.time.LocalDate;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author RAGHA
 */
public class HourlyTest {
    
    public HourlyTest() {
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
    public void testGetJob() {
        Hourly h = new Hourly("Alice", LocalDate.of(2025, 1, 1),
                              101, 20.0, 40.0, "Developer");
        assertEquals("Developer", h.getJob());
    }

    @Test
    public void testGetPayRate() {
        Hourly h = new Hourly("Alice", LocalDate.of(2025, 1, 1),101, 20.0, 40.0, "Developer");
        assertEquals(20.0, h.getPayRate(), 0.001); 
    }

    @Test
    public void testHoursAttribute() {
        Hourly h = new Hourly("Alice", LocalDate.of(2025, 1, 1), 101, 20.0, 40.0, "Developer");
        assertTrue(h.getHours() > 0);
    }
}
