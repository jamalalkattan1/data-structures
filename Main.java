package Summar2024;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l = new List();
		l.print();

		l.insert(5);
		l.print();

		l.insert(7);
		l.print();

		l.insert(1);
		l.insert(-5);
		l.insert(10);
		l.print();

		l.insert(8, 1);
		l.print();

		l.insert(90, 0);
		l.print();

		l.remove(0);
		l.print();

		l.count();
System.out.println("-----------------");
		l.insert1(8);
		l.insert1(9);
		l.insert1(7);
		l.insert1(3);
		l.insert1(2);
		l.insert1(1);
		l.print();
		
		
		

	}

}
