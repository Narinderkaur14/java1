package javaproo;

import java.util.Stack;

public class MyQueue {
	private static Stack<Integer> input=new Stack<>();
	private static  Stack<Integer> output=new Stack<>();
	 public MyQueue() {
	        
	    }
	    
	    /** Push element x to the back of queue. */
	    public void push(int x) {
	    	input.push(x);
	        
	    }
	    
	    /** Removes the element from in front of queue and returns that element. */
	    public int pop() {
	    	if(output.isEmpty()) {
	    		shiftStacks();
	    		
	    	}
	    	return output.pop();
	        
	    }
	    
	    /** Get the front element. */
	    public int peek() {
	    	if(output.isEmpty()) {
	    		shiftStacks();
	    		
	    	}
	    	return output.peek(); 
	    }
	    
	    /** Returns whether the queue is empty. */
	    public boolean empty() {
	    	
	        return input.isEmpty()&& output.isEmpty();
	    }
	    public void shiftStacks()
	    {
	    	while(!input.isEmpty())
	    	{
	    		int temp=input.pop();
	    		output.push(temp);
	    	}
	    }
	    	
	    	
	    public static void main(String[] args)
		{
	    	MyQueue obj=new MyQueue();
	    	obj.push(2);
	    	obj.push(3);
	    	obj.push(4);
	    	
	    	int param=obj.pop();
	    		
	    	System.out.println(param);
	    	System.out.println("peek element is:");
	     int param3 = obj.peek();
	    	  System.out.println(param3);
	    	  
	    	 boolean param4 = obj.empty();
	    	 System.out.println(param4);
		}
	    }



