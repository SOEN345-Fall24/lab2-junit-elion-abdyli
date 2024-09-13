package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExampleTest {

    @Test
    void function_A() {

        assertEquals(0,new org.example.Example(0,0).Function_A(0));
        assertEquals(1, new org.example.Example(0,0).Function_A(1));
    }

    @Test
    void function_B() {
        assertEquals(6,new org.example.Example(0,0).Function_B(6));
        assertEquals(5,new org.example.Example(0,0).Function_B(5));
    }
    
}
