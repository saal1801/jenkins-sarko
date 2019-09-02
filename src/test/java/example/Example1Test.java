package example;

import org.junit.Test;

import static org.junit.Assert.*;

public class Example1Test {
    private Example1 example1=new Example1();

    @Test
    public void addition() {
        assertEquals(example1.addition(1,1),2);
    }
}