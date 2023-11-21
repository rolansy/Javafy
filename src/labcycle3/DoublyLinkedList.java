package labcycle3;

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
	
	 
}

public class DoublyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
