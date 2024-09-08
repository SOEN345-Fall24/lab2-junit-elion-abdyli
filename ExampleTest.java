package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExampleTest {

    @Test
    void function_A() {
        new org.example.Example(0,0).Function_A(0);
        new org.example.Example(0,0).Function_A(1);
    }
    


    @Test
    void function_B() {
        new org.example.Example(0,0).Function_B(6);
        new org.example.Example(0,0).Function_B(5);
    }
}
