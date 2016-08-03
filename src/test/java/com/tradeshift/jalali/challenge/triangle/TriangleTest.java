package com.tradeshift.jalali.challenge.triangle;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TriangleTest {
	    
    @Test ( expected = InvalidShapeException.class)
    public void testInvalidShapeException() throws InvalidShapeException {
    	new Triangle(1, 2, 3);
	}
    
    @Test
    public void testTriangleCreation() throws InvalidShapeException{
    	Triangle triangle = new Triangle(2, 2, 3);
    	assertNotNull(triangle);
    }
    
    @Test
    public void testEquilateralTriangle() throws InvalidShapeException{
    	Triangle equilateralTriangle = new Triangle(1, 1, 1);
    	String equilateralType = equilateralTriangle.getType();
    	assertEquals(TriangleType.EQUILATERAL.getType(), equilateralType);
    	assertTrue(equilateralTriangle.isEquilateral());
    	assertFalse(equilateralTriangle.isIsosceles());
    	assertFalse(equilateralTriangle.isScalene());
    }
    
    @Test
    public void testIsoscelesTriangle() throws InvalidShapeException{
    	Triangle isoscelesTriangle = new Triangle(1, 2, 2);
    	String isoscelesType = isoscelesTriangle.getType();
    	assertEquals(TriangleType.ISOSCELES.getType(), isoscelesType);
    	assertTrue(isoscelesTriangle.isIsosceles());
    	assertFalse(isoscelesTriangle.isEquilateral());
    	assertFalse(isoscelesTriangle.isScalene());
    }

    @Test
    public void testScaleneTriangle() throws InvalidShapeException{
    	Triangle scaleneTriangle = new Triangle(2, 3, 4);
    	String scaleneType = scaleneTriangle.getType();
    	assertEquals(TriangleType.SCALENE.getType(), scaleneType);
    	assertTrue(scaleneTriangle.isScalene());
    	assertFalse(scaleneTriangle.isEquilateral());
    	assertFalse(scaleneTriangle.isIsosceles());
    }
    
}
