package exo1;

public class ListeSimple {

	private Node head;
	private long size;
	
	public ListeSimple() {
		head = null;
		size = 0;
	}
	
	public void create(int element) {
		Node node = new Node(element, null);
		if(head == null) {
			head = node;
		} else {
			Node tmp = head;
			while(tmp.getNext() != null) {
				tmp = tmp.getNext();
			}
			tmp.setNext(node);
		}
	}
	
	public void read() {
		Node current = head;
		while(current.getNext() != null) {
			System.out.print(current.getElement() + " | ");
			current = current.getNext();
		}
		System.out.println(current.getElement());
	}
	
	public void update(int remplaced, int newNode) {
		Node current = head;
		while (current.getNext() != null){
			if(current.getElement() == remplaced) {
				current.setElement(newNode);
			} else {
				current = current.getNext();
			}
		}
	}
	
	public void delete (int deleted) {
		Node previous = null;
		Node current = head;
		while(current.getNext() != null && current.getElement() != deleted) {
			previous = current;
			current = current.getNext();
		}
		if(current != head) {
			previous.setNext(current.getNext());
		}
		else {
			head = current.getNext();
		}
	}
	
	public void insert(int inserted) {
		Node current = new Node(inserted, head);
		head = current;
	}
	
	public void penultimate() {
		Node current = head;
		while(current.getNext().getNext() != null) {
			current = current.getNext();
		}
		System.out.println(current.getElement());
	}
	
	public void reverse() {
	    Node previous = null;
	    Node current = head;
	    Node next = null;
	        
	    while (current != null) {
	        next = current.getNext();
	        current.setNext(previous);
	        previous = current;
	        current = next;	        
	        }
	        
	    head = previous; 
	}
	
	public void swapNodes(int element1, int element2) {
	    if (element1 == element2) {
	        return;
	    }

	    Node prevX = null, prevY = null, node1 = null, node2 = null;	
	    Node current = head;

	    while (current != null) {
	        if (current.getNext() != null && current.getNext().getElement() == element1) {
	            prevX = current;
	            node1 = current.getNext();
	        }
	        if (current.getNext() != null && current.getNext().getElement() == element2) {
	            prevY = current;
	            node2 = current.getNext();
	        }
	        current = current.getNext();
	    }

	    if (node1 == null || node2 == null) {
	        return;
	    }

	    if (prevX != null) {
	        prevX.setNext(node2);
	    } else {
	        head = node2;
	    }

	    if (prevY != null) {
	        prevY.setNext(node1);
	    } else {
	        head = node1;
	    }

	    Node temp = node1.getNext();
	    node1.setNext(node2.getNext());
	    node2.setNext(temp);
	}
	    

	
	public static void main(String[] args) {
		System.out.println("Hello world");
		
		ListeSimple liste = new ListeSimple();
		
		liste.create(1);
		liste.create(2);
		liste.create(3);
		liste.create(4);
		liste.read();
		
		liste.update(3, 50);
		liste.read();
		
		liste.delete(2);
		liste.read();
		
		liste.insert(19);
		liste.read();
		
		liste.penultimate();
		
		liste.reverse();
		
		liste.read();
		
		liste.swapNodes(50, 19);
		
		liste.read();
	}
}
