package labcycle3;

public class DoublyLinkedListTrial {
	// Node class to represent each node in the doubly linked list
	class Node {
		int data;
		Node prev;
		Node next;

		public Node(int data) {
			this.data = data;
			this.prev = null;
			this.next = null;
		}
	}

	// Head and tail of the doubly linked list
	Node head, tail;

	// Method to add a new node at the end of the doubly linked list
	public void addNode(int data) {
		Node newNode = new Node(data);

		// If the list is empty, make the new node as head and tail
		if (head == null) {
			head = tail = newNode;
			head.prev = null;
			tail.next = null;
		} else {
			// Else, add the new node after the tail and update the tail
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
			tail.next = null;
		}
	}

	// Method to delete a given element from the doubly linked list
	public void deleteNode(int key) {
		Node current = head;

		// Traverse through the list to find the node with the given key
		while (current != null) {
			// If the current node contains the key, delete it
			if (current.data == key) {
				// If the node to be deleted is the head node
				if (current == head) {
					head = head.next;
					head.prev = null;
				}
				// If the node to be deleted is the tail node
				else if (current == tail) {
					tail = tail.prev;
					tail.next = null;
				}
				// If the node to be deleted is any other node
				else {
					current.prev.next = current.next;
					current.next.prev = current.prev;
				}
				break;
			}
			current = current.next;
		}
	}

	// Method to display the contents of the doubly linked list
	public void display() {
		Node current = head;
		if (head == null) {
			System.out.println("The list is empty.");
			return;
		}
		System.out.println("Contents of the doubly linked list:");
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		DoublyLinkedListTrial dll = new DoublyLinkedListTrial();

		// Add nodes to the doubly linked list
		dll.addNode(1);
		dll.addNode(2);
		dll.addNode(3);
		dll.addNode(4);
		dll.addNode(5);

		// Display the contents of the list before deletion
		dll.display();

		// Delete a given element from the list
		dll.deleteNode(3);

		// Display the contents of the list after deletion
		dll.display();
	}
}