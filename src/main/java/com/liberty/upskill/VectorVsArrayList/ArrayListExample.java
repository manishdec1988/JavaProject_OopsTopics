package com.liberty.upskill.VectorVsArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList<String> myList = new ArrayList<String>(6);
		myList.add("Sudharsan");
		myList.add("Veera");
		myList.add("Veera");
		myList.add("Sandeep");
//		myList.add(null);
		myList.add("Mani");
		myList.add("Amit");
		myList.add("Manish");
	

		/* Print Unsorted List */
		System.out.println("The arraylist contains the following elements Unsorted: ");
		for (String counter : myList) {
			System.out.println(counter);
		}

		System.out.println("***************************************************************************************");

		/* Print Reverse List */
		System.out.println("The arraylist contains the following elements in reverse oder: ");
		Collections.reverse(myList);
		for (String counter : myList) {
			System.out.println(counter);
		}

		System.out.println("***************************************************************************************");

		/* Print sorted List */
		Collections.sort(myList);
		/* Sorted List */
		System.out.println("The arraylist contains the following elements sorted: ");
		for (String counter : myList) {
			System.out.println(counter);
		}

		System.out.println("***************************************************************************************");
		// Retrieve elements from the arrayList
		// 1st way: loop using index and size list
		for (int i = 0; i < myList.size(); i++) {
			System.out.println("Index: " + i + " - Item: " + myList.get(i));
		}

		System.out.println("***************************************************************************************");

		// addAll(Collection c) method
		ArrayList<String> ArrayListOne = new ArrayList<String>();
		ArrayListOne.add("Mani");
		ArrayListOne.add("Manish");
		ArrayListOne.add("Amit");

		ArrayList<String> ArrayListTwo = new ArrayList<String>();
		ArrayListTwo.add("Veera");
		ArrayListTwo.add("Sandeep");
		ArrayListTwo.add("Sudharsan");

		ArrayListOne.addAll(ArrayListTwo);// adding second list in first list
		Iterator itr = ArrayListOne.iterator();
		System.out.println("Print the final ArrayList after adding ArrayListOne+ArrayListTwo : ");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("***************************************************************************************");
		// Checking index of an item
		int indexPosition = myList.indexOf("Manish");
		System.out.println("The index of Manish is: " + indexPosition);

		// Checking if array list is empty
		boolean check = myList.isEmpty();
		System.out.println("Checking if the arraylist is empty: " + check);

		// Getting the size of the list
		int size = myList.size();
		System.out.println("The size of the list is: " + size);

		// Checking if an element is included to the list
		boolean element = myList.contains("Sandeep");
		System.out.println("Checking if the arraylist contains the object Sandeep: " + element);

		// Replacing an element
		myList.set(1, "updatedName");
		System.out.println("The arraylist after the replacement is: " + myList);

		// Removing items
		// removing the item in index 0
		myList.remove(0);

		// removing the first occurrence of item "Item3"
		myList.remove("Item3");

		System.out.println("The final contents of the arraylist are: " + myList);

	}

}
