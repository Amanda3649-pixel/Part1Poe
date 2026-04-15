/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package TestAttempt2;

import org.junit.jupiter.api.Test;

import com.mycompany.part1poe.Checking;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lab_services_student
 */
public class TestForPoe {
   
    
    
    @Test
    public void testUsername(){
    Checking c = new Checking();
    assertEquals(true, c.checkUserName("user_"));
}
    @Test
    public void testPasswordValidity(){
        Checking c = new Checking();
        assertEquals(true, c.checkPasswordComplexity("Yuyu@5678"));
        
    }
    @Test
    public void testPhoneValid() {
        Checking c = new Checking();
        assertEquals(true, c.checkCellPhoneNumber("+27485671234"));
    }
    }
    

