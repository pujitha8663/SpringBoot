package com.calucation;

public class MathFormula {

	public int add(int a,int b) {
		
		return(a+b);
	}
	
	public void multitable(int a) {
		for(int i =1; i<=10;i++) {
			System.out.println(a*i);
		}
}
	public int sum(int a,int b) {
		if(a<0||b<0) {
			throw new IllegalArgumentException();
		}
		return a+b;
	}
	
	
	
	public static void main(String[] args) {
		MathFormula m = new MathFormula();
		System.out.println(m.add(10, 9));
		System.out.println(m.add(5, -19));
		System.out.println(m.add(-12, 9));
		System.out.println(m.add(18, -19));
		System.out.println(m.add(10, 9));
		m.multitable(4);
		System.out.println(m.sum(-20, 10));
	}
	
	
	
}
