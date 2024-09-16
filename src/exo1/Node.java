package exo1;

public class Node {

	private int element;
	private Node next;
	
	
	public Node(int i, Node n) {
		element = i;
		next = n;
	}


	public int getElement() {
		return element;
	}


	public void setElement(int newElement) {
		element = newElement;
	}


	public Node getNext() {
		return next;
	}


	public void setNext(Node newNext) {
		next = newNext;
	}	
	
}
