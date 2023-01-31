package com.ciq.Primetest;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.calucation.MathFormula;

public class MathTest {
	@BeforeClass
	public static void BeforeClass() {
		System.out.println("before class");
	}
	@Test
	public void test() {
		MathFormula m = new MathFormula();
		int a= 20;
		int b= 30;
		int exp=50;
		int aut=m.add(a, b);
		assertEquals(exp, aut);
	}
	
	@Test
	public void test2() {
		MathFormula n = new MathFormula();
		assertEquals(40, n.add(20, 20));
		
		
	}

	@Test
	public void test3() {
		MathFormula p = new MathFormula();
		assertEquals(-10, p.add(-20, 10));
		
		
	}

	@Test
	public void test4() {
		MathFormula r = new MathFormula();
		assertEquals(-10, r.add(20, -30));
		
		
	}
	
	@Test (expected = IllegalArgumentException.class)
	
	public void test5() {
		MathFormula s= new MathFormula();
		s.sum(-20, 10);
	}
	

	@AfterClass
	public static void Afterclass() {
		System.out.println("After class");
	}
}
