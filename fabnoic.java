package javaproo;

import java.util.Scanner;

public class fabnoic {
	public static int fab(int n)
	{
		//if(n==0 || n==1)
		if(n<=1)
		{
		return n;
		}
		return fab(n-1)+fab(n-2);
		
	
	}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n;
		System.out.println("enter the no");
		n=s.nextInt();
		System.out.println("fibnoic series of nth number is:");
		System.out.println(fab(n));
				
	}

}



