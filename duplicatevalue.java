package javaproo;

import java.util.Scanner;

public class duplicatevalue {
public static void main(String[] args) {
		
		int a[],n;
		Scanner s=new Scanner(System.in);
				System.out.println("enter the elements");	
		n=s.nextInt();
		a=new int[n];
		int i=0;
		
		System.out.println("enter"+n+ "elements");
		for( i=0;i<n;i++)
		{
	a[i]=s.nextInt();
		}
		System.out.println("duplicate item is:");	
		for(i=0;i<n;i++)
		{
			for( int j=i+1;j<n;j++) 
			{
				if(a[i]==a[j])
				{
					
					
				System.out.println(a[i]);	
				}
			}
			
				}
			}
		}


