package com.other.listlist;

import java.util.HashSet;
import java.util.Set;

class LinkNode {

	Node head = null;

	public void add(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	public void traverse(Node head) {
		while (head != null) {
			System.out.print(head.data + " | ");
			head = head.next;
		}
	}

	public void searchKthNodeFromEndOfLinkList(int k) {
		Node slow = head;
		Node fast = head;
		int count = 1;

		while (count < k) {
			count++;
			fast = fast.next;
		}

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next;
		}
		System.out.println("search data from the last node : " + slow.data);
	}

	public void deleteKthNodeFromEndOfTheList(int k) {
		Node slow = head;
		Node fast = head;
		Node prev = null;
		int count = 1;
		while (count < k) {
			count++;
			fast = fast.next;
		}
		while (fast != null && fast.next != null) {
			prev = slow;
			fast = fast.next;
			slow = slow.next;
		}
		if (prev == null) {
			head = head.next;
		} else {
			prev.next = slow.next;
			prev = head;
			head = prev;
		}
		traverse(head);
	}

	public void swapNodesInPairs() {
		Node current = head;
		while (current != null && current.next != null) {
			int temp = current.data; // data swapping instead of address swapping
			current.data = current.next.data;
			current.next.data = temp;
			current = current.next.next;
		}
		traverse(head);
	}

	public void removeDuplicateFromSortedList() {
		Node current = head;
		while (head != null && current.next != null) {
			if (current.data == current.next.data) {
				current.next = current.next.next;
			} else {
				current = current.next;
			}
		}
		traverse(head);
	}

	public void deleteNodeUnsortedArray() {
		Node current = head;
		Node previous = null;
		Set<Integer> set = new HashSet<Integer>();

		while (current != null) {
			if (set.contains(current.data)) {
				previous.next = current.next;
			} else {
				previous = current;
				set.add(current.data);
			}
			current = current.next;
		}
		traverse(head);
	}

	public void deleteDuplicates() {
		Node current = new Node(0);
		Node previous = current;
		while (head != null) {
			// If two node's values are equal, skip all of them.
			if (head.data == head.next.data) {
				while (head.next != null && head.data == head.next.data)
					head = head.next;
			} else {
				current.next = head;
				current = head;
			}
			head = head.next;
		}
		current.next = null;
		head = previous.next;
		traverse(head);
	}
}

public class DeleteAndFindKthNodeFromLinkedList {

	public static void main(String[] args) {
		LinkNode node = new LinkNode();
		node.add(9);
		node.add(9);
		node.add(2);
		node.add(3);
		node.add(1);
		node.add(1);
		node.add(1);

		System.out.println("List : ");
		node.traverse(node.head);

		System.out.println("\n----------------");
		// node.searchKthNodeFromEndOfLinkList(1);
		// node.deleteKthNodeFromEndOfTheList(5);
		// node.swapNodesInPairs();
		node.deleteDuplicates();

	}

}
