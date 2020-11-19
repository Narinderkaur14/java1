
package javaproo;

public class queue {
	static  int queue[]=new int[5];
	int n=5;
	  static int  front=-1;
	 static int  rear=-1;
	int x;
	void enqueue(int x)
	{
		if(rear==n-1)
		{
			System.out.println("queue overflow:"); 
		}
		else if(front==-1 && rear==-1)
		{
			front=rear=0;
			queue[rear]=x;
			System.out.println(x); 
		}
		else
		{
			rear++;
			queue[rear]=x;
			System.out.println(x); 
		}
			
			
	}
	void dequeue()
	{
		 if(front==-1 && rear==-1)
		{
			
			System.out.println("queue is empty"); 
		}
		 else if(front== rear)
			{
				front=rear=-1;
				
				System.out.println("queue is empty:"); 
    	
    	}
		 else
			{
			 front++;
			 
		
			
			
	    } 
	
	}
	


	public static void main (String[] args) 
    
	{
		queue q=new queue();
		q.enqueue(2);
		q.enqueue(7);
	q.enqueue(5);
		q.dequeue();
		for(int i=front;i<=rear;i++)
		{
		System.out.println(queue[i]);
}
}
}