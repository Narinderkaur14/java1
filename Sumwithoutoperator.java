package javaproo;

public class Sumwithoutoperator {
	  public static int getSum(int a, int b) {
	      
	        if (b > 0) { 
	            while (b > 0) { 
	                a++; 
	                b--; 
	            } 
	        } 
	        if (b < 0) { // when 'b' is negative 
	            while (b < 0) { 
	                a--; 
	                b++; 
	            } 
	        } 
	        return a;
	       
	       
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(getSum(2,9));
	}

}
