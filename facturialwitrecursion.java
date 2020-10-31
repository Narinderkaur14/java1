package javaproo;

import java.util.Scanner;

public class facturialwitrecursion {
	public static int fact(int n)
	{
	if(n<=1)
	{
		return n;	
	}
	else
	{
		return  n*fact(n-1);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n;
		System.out.println("enter the no");
		n=s.nextInt();
		System.out.println("factorial of nth number is:");
		System.out.println(fact(n));
	}

}

