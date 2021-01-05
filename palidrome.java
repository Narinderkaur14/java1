package javaproo;

public class palidrome {
	 public static  boolean isPalindrome(int x) {
	        
		 if ((x < 0) ||  (x % 10 == 0 && x != 0))
	         return false;
	    
	        int test = 0, mod = 0;
	//Generate only half number
	        while (test < x)
	        {
	            mod  = x % 10;
	            test = test * 10 + mod;
	            x = x /10;
	        }
	//Compare both number, in case test > x, devide it by 10
	        if ((test == x) || (x == test/10))
	            return true;
	        
	        
	        return false;
	 }
	public static void main(String[] args) {
	
     int x=121;
    System.out.println( isPalindrome(x));
	}
}
