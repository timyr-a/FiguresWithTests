package com.company.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuadrangleTest {

    Quadrangle quadrangle;

    @Before
    public void setUp() throws Exception {
        quadrangle = new Quadrangle(5, 6, 7, 8);
    }

    @Test
    public void testGetName() throws Exception {
        assertEquals("Четырёхугольник", quadrangle.getName());
    }

    @Test
    public void testGetSquare() throws Exception {
        assertEquals(Double.NaN, quadrangle.getSquare(), 0);
    }

    @Test
    public void testGetPerimeter() throws Exception {
        assertEquals(26, quadrangle.getPerimeter(), 0);
    }
}