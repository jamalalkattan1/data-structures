package Summar2024;

public class List {

	int A[];
	int maxSize;
	int end;
	int max;

	List() {
		maxSize = 1000;
		end = -1;
		max = 3;
		A = new int[maxSize];
	}

	void insert(int data) {
		end++;
		A[end] = data;
	}

	void insert(int data, int p) {

		for (int i = end; i >= p; i--) {

			A[i + 1] = A[i];// Shift to items from last item to the item we need to put new item on it
		}
		A[p] = data;
		end++;
		//O(N)//
	}

	void insert1(int data) {//O(1)// IF WE NOT INTER THE IF STATMENT 
		//O(N)//IF WE  INTER THE IF STATMENT

		if (end == max - 1) {
			max *= 2;
			int B[] = new int[max];
			for (int i = 0; i <= end; i++) {
				B[i] = A[i];

			}
			A=B;
		}
		end++;
		A[end] = data;
	}

	void remove(int p) {// Shift to all elemts that are in right belnsbeh to the postion go them to the
		// left
		for (int i = p; i < end; i++) {
			A[i] = A[i + 1];
			end--;
		}
		//O(1)// BEST CASE 
		//O(N)// WOREST CASE 
	}

	int count() {//O(1)//
		return end + 1;

	}

	void modify(int data, int p) {//O(1)//
		A[p] = data;
	}

	int read(int p) {//O(1)//
		return A[p];

	}

	void print() {
		System.out.print(" [ ");
		for (int i = 0; i <= end; i++) {
			System.out.print(A[i] + " , ");
		}
		System.out.println(" ] ");
	}

}
