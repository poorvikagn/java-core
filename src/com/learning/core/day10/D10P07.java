package com.learning.core.day10;
import org.junit.Assert;
import org.junit.Test;
public class D10P07 {
	public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    @Test
    public void testAdd() {
        D10P07 calculator = new D10P07();
        int result = calculator.add(4, 6);
        Assert.assertEquals(10, result); 
    }

    @Test
    public void testSub() {
        D10P07 calculator = new D10P07();
        int result = calculator.sub(9, 2);
        Assert.assertEquals(7, result); 
    }
		
	
}