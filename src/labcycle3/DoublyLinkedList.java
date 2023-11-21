package labcycle3;

import java.util.*;

class DLL{
	class Node{
		int data;
		Node llink;
		Node rlink;
		public Node(int data) {
			this.data=data;
			this.rlink=null;
			this.llink=null;
		}
	}
	
	Node head,tail;
	public void insert(int data) {
		Node newNode=new Node(data);
		if (head==null) {
			head=tail=newNode;
			head.llink=null;
			tail.rlink=null;
		}
		else {
			tail.rlink=newNode;
			newNode.llink=tail;
			tail=newNode;
			tail.rlink=null;
		}
	}
	
	public void delete(int key) {
		Node ptr=head;
		try {
		while(ptr!=null) {
			if(ptr.data==key) {
				if (ptr==head) {
					head=head.rlink;
					head.llink=null;
				}
				
				
				else if (ptr==tail) {
					tail=tail.llink;
					tail.rlink=null;
				}
				else {
					ptr.llink.rlink=ptr.rlink;
					ptr.rlink.llink=ptr.llink;
				}
				break;
			}
			ptr=ptr.rlink;
		}
		}
		catch(Exception e) {
			System.out.println();
		}
	}
	public void display() {
		Node ptr=head;
		if(head==null) {
			System.out.println("the list is Empty.");
			return;
		}
		System.out.println("Elements of the Doubly Linked List : ");
		while(ptr!=null) {
			System.out.print(ptr.data+" ");
			ptr=ptr.rlink;
			
		}
		System.out.println();
	}
	 
}

public class DoublyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DLL dll=new DLL();

		Scanner sc=new Scanner(System.in);
		System.out.print("1. Insert\n2. Delete\n3. Display\n4. Exit\n");
		System.out.print("Enter your choice : ");
		int c=sc.nextInt();
		while(c!=4) {
			switch(c) {
			case 1:
				System.out.print("Enter the element to be inserted : ");
				int data=sc.nextInt();
				dll.insert(data);
				dll.display();
				break;
			case 2:
				System.out.print("Enter the element to be deleted : ");
				int key=sc.nextInt();
				dll.delete(key);
				dll.display();
				break;
			case 3:
				dll.display();
				break;
			default:
				System.out.println("Invalid Choice");
			}
			System.out.print("Enter your choice : ");
			c=sc.nextInt();
		}

	}

}
