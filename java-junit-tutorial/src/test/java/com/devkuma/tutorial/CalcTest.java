package com.devkuma.tutorial;

import com.devkuma.tutorial.junit.Calc;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;

public class CalcTest {

    public void plus() {
        Calc calc = new Calc();
        
        int expected = 7;
        
        int actual = calc.plus(5, 2);

        assertEquals(expected, actual);
    }

    @Test
    public void minus() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Calc calc = new Calc();
        
        int expected = 3;

        Method method = Calc.class.getDeclaredMethod("minus", int.class, int.class);
        method.setAccessible(true);
        int actual = (int) method.invoke(calc, 5, 2);

        assertEquals(expected, actual);
    }

    @Test
    public void multiply() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Calc calc = new Calc();

        int expected = 10;

        Method method = Calc.class.getDeclaredMethod("multiply", int.class, int.class);
        method.setAccessible(true);
        int actual = (int) method.invoke(calc, 5, 2);

        assertEquals(expected, actual);
    }
    
}
