package test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import example.Person;
import example.Translator;
import org.junit.Test;
import static org.junit.Assert.*;


public class TranslatorTest {
    
    @Test
    public void testgetTemporaryMessage(){
        Translator t = new Translator(null, 0,0);
        assertTrue(t.getTemporaryMessage().equalsIgnoreCase("This is a temporary standard message"));
    }
    
    @Test
    public void testgetMessageByName(){
        Person p = new Person();
        p.setNamn("sara");
        Translator t = new Translator(p,0,0);
        assertTrue(t.getMessageByName().equalsIgnoreCase("Det var ett fint namn!"));
        p.setNamn("karl");
        assertTrue(t.getMessageByName().equalsIgnoreCase("Ett ordentligt namn!"));
        p.setNamn("christofer");
        assertTrue(t.getMessageByName().equalsIgnoreCase("Ja det ar ju ocksa ett okej namn"));
        p.setNamn("josefin");
        assertTrue(t.getMessageByName().equalsIgnoreCase("Njea det namnet godkanner vi inte riktigt."));
    }
    
    @Test
    public void testgetMessageByAge(){
        Person p = new Person();
        p.setOld(5);
        Translator t = new Translator(p,1,0);
        assertTrue(t.getMessageByAge().contains("Du ar inte gammal n"));
        p.setOld(55);
        assertTrue(t.getMessageByAge().contains("Du ar i livets gylle"));
        p.setOld(555);
        assertTrue(t.getMessageByAge().contains("oj du var gammal"));
    }
    
    @Test
    public void testgetMessageByGender(){
        Person p = new Person();
        p.setKon("man");
        Translator t = new Translator(p,2,0);
        assertTrue(t.getMessageByGender().contains("Oj vilka stora m"));
        p.setKon("woman");
        assertTrue(t.getMessageByGender().contains("Vilket fint hår du ha"));
        p.setKon("somethin");
        assertTrue(t.getMessageByGender().contains("SOMETHING IS NOT A"));
        p.setKon("test");
        assertTrue(t.getMessageByGender().contains("Du ser bra ut idag"));
    }
    
    @Test
    public void testgetMessageByOccupation(){
        Person p = new Person();
        p.setJob("programmerare");
        Translator t = new Translator(p,3,0);
        assertTrue(t.getMessageByOccupation().contains("Du ar en del av framtide"));
        p.setJob("larare");
        assertTrue(t.getMessageByOccupation().contains("Du skapar framtidens ledar"));
        p.setJob("elev");
        assertTrue(t.getMessageByOccupation().contains("Oj du har en bra framtid du"));
        p.setJob("grane");
        assertTrue(t.getMessageByOccupation().contains("Hoppas ditt jobb gar bra"));
        p.setJob("somOne");
        assertTrue(t.getMessageByOccupation().contains("Konstigt jobb det dar?"));
    }
    
    @Test
    public void testgetMessage(){
        Person p = new Person();
        p.setOld(55);
        p.setJob("programerare");
        p.setNamn("sanna");
        p.setKon("woman");
        for(int x=0; x<100; x++){
            int random = (int)(Math.random()*4);
            Translator t = new Translator(p,random,0);
            assertTrue(
                    (t.getMessage().contains(" var ett fint namn")) ||
                    (t.getMessage().contains("Du ar i livets gyllende ar, vad trevl")) ||
                    (t.getMessage().contains("Vilket fint hår du h")) ||
                    (t.getMessage().contains("Du ar en del av fra")));
        }
        
    }
    
}
