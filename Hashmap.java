package javaproo;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {

	public static void main(String[] args) {
	String s="London";
		HashMap<String,String> Cityhashmap=new HashMap<>();
		Cityhashmap.put("London", "New York");
		Cityhashmap.put("Texcs", "USA");
		Cityhashmap.put("Ontario", "Canada");
		Cityhashmap.put("Malborne", "Australia");
for(String i:Cityhashmap.keySet())
{
	System.out.println(Cityhashmap.get(i)); 
	
}
		if (Cityhashmap.containsKey(s)) { 
            String a = Cityhashmap.get(s); 
            System.out.println("value for key"
                               + " \"vishal\" is:- " + a); 
        } 
	}
}