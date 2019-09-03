package example;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Example1Test {
    private Example1 example1=new Example1();

    @Test
    public void addition() {
        assertEquals(example1.addition(1,1),2);
    }
}