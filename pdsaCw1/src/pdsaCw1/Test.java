package pdsaCw1;

import java.util.Scanner;

class LinkedLi{
	class Node{
		int data;
		Node next;
		
		
		public Node(int data) {
			this.data=data;
			next=null;
		}
			
	}
	Node head=null;
	Node tail=null;
	
	public void addNode(int x) {
		Node node=new Node(x);
		
		if(head==null) {
			head=node;
			tail=node;
		}
		else {
			tail.next=node;
			tail=node;
		}
	}

	
	public void show() {
		Node nod=head;
		System.out.println("Marks of all students :");
		while(nod!=null) {
			System.out.println(nod.data);
			nod=nod.next;
		}
	}
	int totPass=0;     //store total passed number
	
	public void showPass() {
		Node nod1=head;
		
		while(nod1!=null) {
			if(nod1.data>70) {
				totPass=totPass+1;
			}
			nod1=nod1.next;
		}
		
		System.out.println("Passed Number of Students :"+totPass);
		
	}
	int totFail=0;            //store total failed number
	public void showFail() {
		Node nod2=head;
		
		
		while(nod2!=null) {
			if(nod2.data<70) {
				totFail=totFail+1;
			}
			nod2=nod2.next;
					
		}
		System.out.println("Failed Number of Students :"+totFail);
		
		
			
	}
	Double average=0.0;     //store average marks 
	public void showAverage(int students) {
		Node nod3=head;
		Double tot=0.0;
		
		while(nod3!=null) {
			tot=tot+nod3.data;
			nod3=nod3.next;
		}
		average=tot/students;
		System.out.println("Average screening test Mark is :"+average);
		
	}
	
	
	
	
}

public class Test {

	public static void main(String[] args) {
		
		int students;   //store the number of students
		LinkedLi obj=new LinkedLi();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the student limit ");
		students=sc.nextInt();

		   for(int x=0;x<students;x++) {
			System.out.println("Enter marks ");
			int y=sc.nextInt();
		    obj.addNode(y);
		
			
			
		}
		 obj.show();
		 obj.showPass();
		 obj.showFail();
		 obj.showAverage(students);         //here number of students are passed through the method for calculating average
		   
		   
		
	

	}

}
