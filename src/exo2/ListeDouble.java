package exo2;

public class ListeDouble {

	private DNode head, trail;
	private long size;
	
	private ListeDouble() {
		DNode head = new DNode(0, null, null);
		DNode trail = new DNode(0, head, null);
		head.setNext(trail);
		size = 0;
	}
	
	public void create() {
		
	}
	
    public void read() {
        DNode current = head.getNext();
        while (current != trail) {
            System.out.print(current.getElement() + " ");
            current = current.getNext();
        }
        System.out.println();
    }
    
    public void update(int oldValue, int newValue) {
        DNode current = head.getNext();
        while (current != trail) {
            if (current.getElement() == oldValue) {
                current.setElement(newValue);
                return;
            }
            current = current.getNext();
        }
        System.out.println("Élément non trouvé.");
    }
    
    public static void main(String[] args) {
    	
    }
}
