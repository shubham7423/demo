package com.calculator.calculator;

import org.junit.Test;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testApp()
    {
    	App a= new App(0, 0);
    	a.a=5;
    	a.b=10;
        assertEquals(15, a.add());
        assertEquals(-5, a.sub());
    }
}
