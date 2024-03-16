package com.learning.core.day10;

import org.junit.Assert;
import org.junit.Test;
public class D10P08 {
	public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }
    @Test
    public void testMul() {
        D10P08 calculator = new D10P08();
        int result = calculator.mul(3, 6);
        Assert.assertEquals(18, result); 
    }

    @Test
    public void testDiv() {
        D10P08 calculator = new D10P08();
        int result = calculator.div(10, 2);
        Assert.assertEquals(5, result); 
    }
    

}