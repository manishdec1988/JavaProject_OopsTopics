package com.liberty.upskill.LinkedList;

import java.util.LinkedHashSet;

/*
 * 1-A LinkedHashSet is an ordered version of HashSet that maintains a doubly-linked List across all elements
 * 2-Iteration in LinkedHashSet is as per insertion order
 * 3-LinkedHashSet provides collection of unique objects
 */

public class LinkedHashSetExample {
	public static void main(String[] args) {
		LinkedHashSet<String> linkedset = new LinkedHashSet<String>();

		// Adding element to LinkedHashSet
		linkedset.add("Sudharsan");
		linkedset.add("Veera");
		linkedset.add("Sandeep");
		linkedset.add("Manish");
		linkedset.add("Amit");
		linkedset.add("Mani");
		linkedset.add("Random");

		// This will not add new element as A already exists
		linkedset.add("Manish");
		linkedset.add("Random");

		System.out.println("Size of LinkedHashSet = " + linkedset.size());
		System.out.println("Original LinkedHashSet:" + linkedset);
		System.out.println("Removing Random from LinkedHashSet: " + linkedset.remove("Random"));
		System.out.println("Trying to Remove Random which is not " + "present: " + linkedset.remove("Random"));
		System.out.println("Checking if Manish is present=" + linkedset.contains("Manish"));
		System.out.println("Updated LinkedHashSet: " + linkedset);
	}
}
