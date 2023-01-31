package com.calucation;

public class PrimeNumber {
	
	public boolean isPrime(int num) {
		boolean flag=true;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				flag=false;
				break;
				
			}
			else {
				flag=flag;
			}
		
		
		
		}
		
		return flag;
	}
	public static void main(String[] args) {
		PrimeNumber p = new PrimeNumber();
		System.out.println(p.isPrime(11));
		System.out.println(p.isPrime(15));
		System.out.println(p.isPrime(20));
		System.out.println(p.isPrime(17));
		System.out.println(p.isPrime(5));
		
	}

}
