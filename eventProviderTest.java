/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author erada
 */
public class eventProviderTest {
    
    public eventProviderTest() {
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
     * Test of getEvent_provider_name method, of class eventProvider.
     */
    @Ignore
    @Test
    public void testGetEvent_provider_name() {
        System.out.println("getEvent_provider_name");
        eventProvider instance = new eventProvider();
        String expResult = "";
        String result = instance.getEvent_provider_name();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEvent_provider_name method, of class eventProvider.
     */
    @Ignore
    @Test
    public void testSetEvent_provider_name() {
        System.out.println("setEvent_provider_name");
        String event_provider_name = "";
        eventProvider instance = new eventProvider();
        instance.setEvent_provider_name(event_provider_name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEvent_provider_type method, of class eventProvider.
     */
    @Ignore
    @Test
    public void testGetEvent_provider_type() {
        System.out.println("getEvent_provider_type");
        eventProvider instance = new eventProvider();
        String expResult = "";
        String result = instance.getEvent_provider_type();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEvent_provider_type method, of class eventProvider.
     */
    @Ignore
    @Test
    public void testSetEvent_provider_type() {
        System.out.println("setEvent_provider_type");
        String event_provider_type = "";
        eventProvider instance = new eventProvider();
        instance.setEvent_provider_type(event_provider_type);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add_event method, of class eventProvider.
     */
    @Test
    public void testAdd_event() {
        System.out.println("add_event");
        ArrayList<event> event = new ArrayList<>();
        event ev1 = new event("orphanage", 10, 5043, "KAU", 6, "Students", 8, "entertainments-study groups");
        event.add(ev1);
        eventProvider instance1 = new eventProvider("Farah", "");
//        instance1.add_event(event, 0);
        int expected_code = 5043;
        assertEquals(event.get(0).getEvent_code(), expected_code, 1);
        assertNotNull(event);
        
       
        
    }

    /**
     * Test of delete_event method, of class eventProvider.
     */
    
    @Test (timeout = 40)
    public void testDelete_event() {
        System.out.println("delete_event");
        ArrayList <event> event = new ArrayList<>();
        event e = new event("orphanage", 10, 5043, "KAU", 6, "Students", 8, "entertainments-study groups");
        event.add(e);
        int eventCode_expected = 0;
        eventProvider instance = new eventProvider("Farah", "");
        String expected_name = "Farah";
        instance.delete_event(event, 5043);
        assertEquals(instance.event_provider_name, expected_name);
        assertEquals(eventCode_expected, event.get(0).event_code, 1);
        
    }

    /**
     * Test of search method, of class eventProvider.
     */
    @Ignore
    @Test
    public void testSearch() {
        System.out.println("search");
        ArrayList<event> event = null;
        int eventCode = 0;
        eventProvider instance = new eventProvider();
        int expResult = 0;
        int result = instance.search(event, eventCode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of accept_volunteer method, of class eventProvider.
     */
    @Ignore
    @Test
    public void testAccept_volunteer() {
        System.out.println("accept_volunteer");
        eventProvider instance = new eventProvider();
        instance.accept_volunteer();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class eventProvider.
     */
    @Ignore
    @Test
    public void testToString() {
        System.out.println("toString");
        eventProvider instance = new eventProvider();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
