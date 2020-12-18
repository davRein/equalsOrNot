package de.dreinerts.equalsOrNot;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		isEqu e1 = new isEqu("David", "Reinerts");
		isEqu e2 = new isEqu("David", "Reinerts");
		
		boolean equal = e1.equals(e2);
		System.out.println(equal);
		
		int zahl = 5;
		
		int c = zahl == 1 ? zahl : zahl -1;
		System.out.println(c);
	}
}
