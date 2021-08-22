package com.other.listlist;



class LinkedList {
	 Node head; 
	 Node removeNthFromEnd(Node head, int n) {
		Node slow = head;
		Node fast = head;
		Node prev = null;
	        int count = 0;
	        while(count < n) {
	             if(fast == null){
	                System.out.println("fast is null");
	            }
	            fast = fast.next;
	            count++;
	        }
	        while(fast != null) {
	             prev = slow;
//	             System.out.print(prev.val+" | ");
	             fast = fast.next;
	             slow = slow.next;
	        }
	        prev.next = slow.next;
	         while(prev != null){
//	             System.out.print(prev.val+" -> ");
	             prev = prev.next;
	        }
	        return prev;
	    }
	
	/* Inserts a new Node at front of the list. */
    public void push(int new_data) 
    { 
        Node new_node = new Node(new_data); 
        new_node.next = head; 
        head = new_node; 
    } 
  
    /* This function prints contents of linked list starting from 
        the given node */
    public void printList(Node tnode) 
    { 
        while (tnode != null) 
        { 
            System.out.print(tnode.data+" "); 
            tnode = tnode.next; 
        } 
    }
	
}

public class LinkedListApplication {

	public static void main(String[] args) {
		LinkedList llist = new LinkedList(); 
		  
        llist.push(5); 
        llist.push(4); 
        llist.push(3); 
        llist.push(2); 
        llist.push(1); 
  

        llist.printList(llist.head); 
  
        Node node= llist.removeNthFromEnd(llist.head , 5); // Delete node at position 4 
        System.out.println();
        llist.printList(llist.head); 
   
	}

}
