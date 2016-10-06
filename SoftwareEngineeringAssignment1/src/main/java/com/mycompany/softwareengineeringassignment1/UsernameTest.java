package com.mycompany.softwareengineeringassignment1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class UsernameTest
{
    @Test
    public void UsernameTest()
    {
        String name = "John";
        String age = "21";
        
        String expected = "John21";
        String result = Student.getUsername(name, age);
        
        assertEquals(expected, result);  
    }
}