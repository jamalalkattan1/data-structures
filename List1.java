package Summar2024;

public class List1 {

	class node {
		int data;
		node next;

		node(int data) {

			this.data = data;
		}

	}

	node head;

	void insert(int data) {
		node n = new node(data);
		if (head == null) {
			head = n;

		} else {
			node i = head;
			while (i.next != null) {
				i = i.next;
			}
			i.next = n;
		}
	}

	void insert1(int data, int p) {
		node n = new node(data);
		if (p == 0) {
			n.next = head;
			head = n;
		} else {
			node i = head;
			for (int j = 0; j < p; j++) {
				i = i.next;
			}
			n.next = i.next;
			i.next = n;
		}
	}

	void remove(int p) {

		if (p == 0) {
			node temp = head;
			head = temp.next;// head.next
			temp.next = null;
		}
		else {
			//remove from any other position
		}
	}
	
	int read(int p) {
		return p;
		
	}
	void modify(int data,int p) {
		
	}
int count() {
	return 0;   
	
}
	void print() {
		System.out.println(" [ ");
		node i = head;

		while (i != null) {
			System.out.print(i.data + " ");

			i = i.next;
		}
		System.out.println(" ] ");
	}
}
