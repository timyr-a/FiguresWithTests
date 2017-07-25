package com.company.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    Triangle triangle;

    @Before
    public void setUp() throws Exception {
        triangle = new Triangle(5, 6, 8);
    }

    @Test
    public void testGetPerimeter() throws Exception {
        assertEquals(19, triangle.getPerimeter(), 0);
    }

    @Test
    public void testGetSquare() throws Exception {
        assertEquals(14.981, triangle.getSquare(), 0.001);
    }

    @Test
    public void testGetName() throws Exception {
        assertEquals("Треугольник", triangle.getName());
    }
}