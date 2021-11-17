package Advance_DSA;

public class LinkedList {
	private int data;
	
	private LinkedList next;
	
	public LinkedList() {
		
	}
	public LinkedList(int data) {
		this.data = data;
	}

	
	public static void main(String[] args) {
		

		LinkedList node1 = new LinkedList();
		node1.data = 1;
		
		LinkedList node2 = new LinkedList();
		node2.data = 2;
		
		LinkedList node3 = new LinkedList();
		node1.data = 3;
		
		LinkedList node4 = new LinkedList();
		node2.data = 4;
		
		LinkedList node5 = new LinkedList();
		node1.data = 5;
		
		LinkedList node6 = new LinkedList();
		node2.data = 6;
	
		node1.next =node2;
		node2.next =node3;
		node3.next =node4;
		node4.next =node5;
		node5.next =node6;
		node6.next =null;

		
		System.out.println(node1.next.data);
		
		
	}
}
