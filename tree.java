package javaproo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class tree
{
		
		public static void main(String[] args)
		{
		bst b= new bst();
	    Node root=null;
	    
	            root=b.insert(root, 8);
		        root=b.insert(root, 3);
				root=b.insert(root, 6);
				root=b.insert(root, 10);
				root=b.insert(root, 4); 
		        root=b.insert(root, 1);
				root=b.insert(root, 14);
				root=b.insert(root,17);
			System.out.println("inorder");
				b.inorder(root);
				
				System.out.println("preorder");
				b.preorder(root);
				System.out.println();

				System.out.println("postorder");
				b.postorder(root);
				System.out.println();
				System.out.println("sum of  tree element:"+ b.getsumelement(root));

				System.out.println("Difference even odd node of  tree element:"+ b.diffevenoddelement(root));

				System.out.println("total no.of node in tree :"+ b.totalnode(root));

				System.out.println("height of the  tree is :"+ b.maxDepth(root));

			 b.printatlevel(root);

		}
			
			
}		
			
	
class Node
	{
		int data;
		Node left;
		Node right;
	}
	class bst
	{
		public Node createnewnode(int k)
		{
			Node a=new Node();
			a.data=k;
			a.left=null;
			a.right=null;
			return a;
		}
		public Node insert(Node node,int val)
		{
			if(node==null)
			{
				return createnewnode(val);
			}
			if(val<node.data)
			{
				node.left=insert(node.left,val);
			}
			if(val>node.data)
			{
				node.right=insert(node.right,val);
			}
			return node;
		}
		public void inorder(Node node)
		{
			if(node==null)
			{
				return ;
			}
			inorder(node.left);
			System.out.println(node.data+"");
			inorder(node.right);
		}
			
			
	public void preorder(Node node)
	{
		if(node==null)
		{
			return ;
		}
		System.out.println(node.data+"");
		preorder(node.left);
		
		preorder(node.right);
	}
		
		
		public void postorder(Node node)
		{
			if(node==null)
			{
				return ;
			}
			postorder(node.left);
			
			postorder(node.right);
			System.out.println(node.data+"");
		}
		
		public int getsumelement(Node node)
		{
			if(node==null)
			{
				return 0;
			}
		
			return node.data+ getsumelement(node.left)+getsumelement(node.right);
			
		}
		public int diffevenoddelement(Node node)
		{
			if(node==null)
			{
				return 0;
			}
		
			
			
			return node.data- diffevenoddelement(node.left)-diffevenoddelement(node.right);
			
		}
		public int totalnode(Node node)
		{
			if(node==null)
			{
				return 0;
			}
		
			return 1+ totalnode(node.left)+totalnode(node.right);
			
		}
		public void printatlevel(Node node)
		{
			if(node==null)
			{
				return ;
			}
		
		Queue<Node> q=new LinkedList<Node>();
		
         q.add(node);
         Stack<Node> ss=new Stack<Node>();
			
		while(q.size()>0)
		{
			Node p=q.remove();
			ss.push(p);
			
			if(p.right!=null)
			{
				q.add(p.right);
			}
			if(p.left!=null)
			{
				q.add(p.left);
			}
		
			}
		while(ss.size()>0) 
		{
			System.out.println(ss.pop().data +"");
		}
		}


			
		int maxDepth(Node node)  
	    { 
	        if (node == null) 
	            return 0; 
	        else 
	        	
	        { 
	           
	            int lDepth = maxDepth(node.left); 
	            int rDepth = maxDepth(node.right); 
	   
	            
	            if (lDepth > rDepth) 
	                return (lDepth + 1); 
	             else 
	                return (rDepth + 1)
	                		; 
	        } 
	    } 
    } 
			
			
			
	
	
	
					

	
	
	
