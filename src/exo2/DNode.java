package exo2;

public class DNode {

	private int element;
	private DNode next, prev;
	
	public DNode(int i, DNode p, DNode n) {
		element = i;
		prev = p;
		next = n;
	}

	public int getElement() {
		return element;
	}

	public void setElement(int element) {
		this.element = element;
	}

	public DNode getNext() {
		return next;
	}

	public void setNext(DNode next) {
		this.next = next;
	}

	public DNode getPrev() {
		return prev;
	}

	public void setPrev(DNode prev) {
		this.prev = prev;
	}
	
}
