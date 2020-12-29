package javaproo;

public class LengthofString {
	 public static  int lengthOfLastWord(String s) {
	        
	        int len=0;
	        int rec=0;
	        for(int i=0;i<s.length();i++)
	        {
	            if(s.charAt(i)==' ')
	            {
	                len=0;
	                
	            }
	            else
	            {
	                len++;
	                rec=len;
	            }
	           
	        } return rec;
	        
	    }
	 public static void main(String[] args)
	 {
	String s="hello word";
System.out.println(lengthOfLastWord(s));
	 }
        
	}