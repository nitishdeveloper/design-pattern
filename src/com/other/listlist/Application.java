package com.other.listlist;

class ReverseLinkedList {
	Node head;

	// prints content of double linked list
	void printList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	public Node reverseBetween(Node head, int m, int n) {
		if (head == null) {
			return null;
		}
		Node current = head;
		Node previous = null;
		while (m > 1) {
			previous = current;
			current = current.next;
			m--;
			n--;
		}
		Node backwardPtr = previous;
		Node farwordPtr = current;
		Node tempPtr = null;
		while (n > 0) {
			tempPtr = current.next;
			current.next = previous;
			previous = current;
			current = tempPtr;
			n--;
		}

		if (backwardPtr != null) {
			backwardPtr.next = previous;
		} else {
			head = previous;
		}

		farwordPtr.next = current;

		return head;
	}

	public Node reverseInGroups(Node head, int k) {
		// base case
		if (head == null) {
			return null;
		}
		Node current = head;
		Node previous = null;
		int count = 0;
		while (count < k && current != null) {
			Node next = current.next;
			current.next = previous;
			previous = current;
			current = next;
			count++;
		}

		head.next = reverseInGroups(current, k);
		return previous;
	}

	public Node reverseKGroup(Node head, int k) {
		Node newHead = new Node(0);
		newHead.next = head;
		Node current = newHead;
		Node tail = current;

		int count = 0;
		while (tail != null) {
			for (count = 0; count < k && tail.next != null; count++) {
				tail = tail.next;
			}
			if (count < k) {
				return newHead.next;
			}
			Node nextCurrent = null;
			while (current.next != tail) {
				Node temp = current.next;
				if (nextCurrent == null) {
					nextCurrent = temp;
				}
				current.next = temp.next;
				temp.next = tail.next;
				tail.next = temp;
			}
			current = nextCurrent;
			tail = current;
		}
		return newHead.next;
	}

	public Node getIntersectionNodeUsingDifferenceNodeCount(Node headA, Node headB) {
		Node currentA = headA;
		Node currentB = headB;
		int nodeAcount = 0;
		int nodeBcount = 0;

		while (currentA != null || currentB != null) {
			if (currentA != null) {
				nodeAcount++;
				currentA = currentA.next;
			}
			if (currentB != null) {
				nodeBcount++;
				currentB = currentB.next;
			}
		}

		int nodeDifference = 0;

		if (nodeAcount > nodeBcount) {
			nodeDifference = nodeAcount - nodeBcount;
			return getIntersectionNodePoint(nodeDifference, headA, headB);
		} else {
			nodeDifference = nodeBcount - nodeAcount;
			return getIntersectionNodePoint(nodeDifference, headB, headA);
		}
	}

	public Node getIntersectionNodePoint(int diff, Node currA, Node currB) {

		Node nodeA = currA;
		Node nodeB = currB;

		for (int i = 0; i < diff; i++) {
			if (nodeA == null) {
				return nodeA;
			}
			nodeA = nodeA.next;
		}
		while (nodeA != null && nodeB != null) {
			nodeA = nodeA.next;
			nodeB = nodeB.next;
			System.out.println("nodeA : "+nodeA.data+" nodeB : "+nodeB.data);
			if (nodeA.data == nodeB.data) {
				 return currA;
			}
			nodeA = nodeA.next;
			nodeB = nodeB.next;
		}
	  return null;	
	}
	
	public Node getIntersectionNodeUsingTwoPointer(Node headA, Node headB){
	     
		Node currentA = headA;
		Node currentB = headB;
        
        while(currentA != currentB){
               if(currentA != null){
                  currentA = currentA.next;
               }else{
                 currentA = headB;
               }
             if(currentB != null){
                  currentB = currentB.next;
               }else{
                 currentB = headA;
               }
          }
      return currentA;

}
}
public class Application {

	public static void main(String[] args) {
		ReverseLinkedList list = new ReverseLinkedList();
		Node head= new Node(4); 
        head.next = new Node(1); 
        head.next.next = new Node(8); 
        head.next.next.next = new Node(4); 
        head.next.next.next.next = new Node(5); 
		
		Node head2 = new Node(5); 
		head2.next = new Node(0); 
		head2.next.next = new Node(1);
		head2.next.next.next = new Node(8);
		head2.next.next.next.next = new Node(4);
		head2.next.next.next.next.next = new Node(5);

		System.out.println("Given Linked list");
		list.printList(head);
		head = list.getIntersectionNodeUsingTwoPointer(head, head2);
		System.out.println("");
		System.out.println("Reversed linked list ");
		list.printList(head);

	}

}
