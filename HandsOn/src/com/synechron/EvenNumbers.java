package com.synechron;

import java.util.ArrayList;

public class EvenNumbers {
	private ArrayList<Integer> A1;	
	private ArrayList<Integer> A2;	
	
	public ArrayList<Integer> storeEvenNumbers(int n) {
		ArrayList<Integer> evenNumberList = new ArrayList<Integer>();
		for (int i = 2; i <= n; i += 2) {
			evenNumberList.add(i);
		}
		A1= evenNumberList;
		return evenNumberList;
	}

	public ArrayList<Integer> printEvenNumbers() {
		ArrayList<Integer> evenNumberList = new ArrayList<Integer>();
		for (Integer intObject : A1) {
			int temp = (intObject.intValue() * 2);
			System.out.print(temp+",");
			evenNumberList.add(temp);
		}
		A2= evenNumberList;
		return evenNumberList;
	}
	
	public int retrieveEvenNumber(int n) {
		int i=0;
		for (Integer integer : A1) {
			if (n== integer.intValue()) {
				i=n;
			}
		}
		return i;
	}
	
	public static void main(String[] args) {
		EvenNumbers obj = new EvenNumbers();
		obj.storeEvenNumbers(20);
		obj.printEvenNumbers();
		System.out.println("\n\n"+obj.retrieveEvenNumber(13));
	}

}
