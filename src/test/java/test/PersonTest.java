package test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import example.Person;
import org.junit.Test;
import static org.junit.Assert.*;

public class PersonTest {
    
    @Test
    public void testgenerateMessage(){
        Person p = new Person();
        p.setOld(50);
        p.setNamn("sara");
        p.setGender("name2");
        p.setJob("programmerare");
        
        for(int x=0; x<100; x++){
            p.generateMessage();
            assertTrue((p.getMessage().contains("Det var ett fint namn")) ||
                    (p.getMessage().contains("Du ar i livets gyllende ar, vad")) ||
                    (p.getMessage().contains("Vilket fint h")) ||
                    (p.getMessage().contains("Du ar en del av fr")));
                    
        }
   }

    
    @Test
    public void testsetMessage(){
        Person p = new Person();
        p.setMessage("testConfirmation");
        assertTrue(p.getMessage().equalsIgnoreCase("testConfirmation"));
    }
    
}
