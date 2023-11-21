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
	
	public void delete(int key) {
		Node ptr=head;
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
	
	 
}

public class DoublyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
