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
 * @author hp
 */
public class AdminTest {
    
    public AdminTest() {
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
     * Test of getLength_of_service method, of class Admin.
     */
    @Ignore
    @Test
    public void testGetLength_of_service() {
        System.out.println("getLength_of_service");
        Admin instance = new Admin();
        int expResult = 0;
        int result = instance.getLength_of_service();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLength_of_service method, of class Admin.
     */
    @Ignore
    @Test
    public void testSetLength_of_service() {
        System.out.println("setLength_of_service");
        int length_of_service = 0;
        Admin instance = new Admin();
        instance.setLength_of_service(length_of_service);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRank_of_adminstration method, of class Admin.
     */
    @Ignore
    @Test
    public void testGetRank_of_adminstration() {
        System.out.println("getRank_of_adminstration");
        Admin instance = new Admin();
        int expResult = 0;
        int result = instance.getRank_of_adminstration();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRank_of_adminstration method, of class Admin.
     */
    @Ignore
    @Test
    public void testSetRank_of_adminstration() {
        System.out.println("setRank_of_adminstration");
        int rank_of_adminstration = 0;
        Admin instance = new Admin();
        instance.setRank_of_adminstration(rank_of_adminstration);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add_advertisements method, of class Admin.
     */
    @Test
    public void testAdd_advertisements() {
        System.out.println("add_advertisements");
        ArrayList<Advertisement> Adv =  new ArrayList<Advertisement>();   
       Advertisement aa= new Advertisement ("three days","20567","kau student");
         Adv.add(aa);
        int index = 0;
        Admin instance = new Admin();
        String expResult ="three days";
        String result =aa.Getevent_specifications();
        assertEquals(result,expResult);
     
    }

    /**
     * Test of searchAdv method, of class Admin.
     */
    @Test
    public void testSearchAdv() {
        System.out.println("searchAdv");
        Advertisement aa= new Advertisement ("three days","20567","kau student");
        Advertisement bb= new Advertisement ("three days","20568","kau student");
        ArrayList<Advertisement> Adv = new ArrayList<Advertisement>();
        Adv.add(aa);
        Adv.add(bb);
        String Advertisement_code = "20567";
        Admin instance = new Admin();
        int expResult =0;
        int result = instance.searchAdv(Adv, Advertisement_code);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of delet_addvertisements method, of class Admin.
     */
    @Test
    public void testDelet_addvertisements() {
        System.out.println("delet_addvertisements");
        
        Advertisement aa= new Advertisement ("three days","20567","kau student");
        Advertisement bb= new Advertisement ("three days","20568","kau student");
        ArrayList<Advertisement> Adv = new ArrayList<Advertisement>();
        Adv.add(aa);
        Adv.add(bb);
        ArrayList<Advertisement> expArray = new ArrayList<Advertisement>();
        expArray.add(aa);
        expArray.add(bb);
        String Advertisement_code = "20568";
        Admin instance = new Admin();
        instance.delet_addvertisements(Adv, Advertisement_code);
        assertNotEquals(expArray,Adv);
    
    }

    /**
     * Test of categorization_addvertisements method, of class Admin.
     */
    @Ignore
    @Test
    public void testCategorization_addvertisements() {
        System.out.println("categorization_addvertisements");
        Admin instance = new Admin();
        instance.categorization_addvertisements();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of provide_leadership_on_issues method, of class Admin.
     */
    @Ignore
    @Test
    public void testProvide_leadership_on_issues() {
        System.out.println("provide_leadership_on_issues");
        Admin instance = new Admin();
        instance.provide_leadership_on_issues();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Admin.
     */
    @Ignore
    @Test
    public void testToString() {
        System.out.println("toString");
        Admin instance = new Admin();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
