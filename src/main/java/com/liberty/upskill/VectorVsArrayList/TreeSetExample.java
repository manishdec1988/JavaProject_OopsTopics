package com.liberty.upskill.VectorVsArrayList;

/*
 * Difference between HashSet and HashTree
 * 
 * 1-HashSet is faster than the TreeSet.
   2-HashSet can store null objects, while TreeSet does not allow them.
   3-HashSet stores the objects in random order, whereas TreeSet applies the natural order of the elements.
 */

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		// Adding elements to the HashSet
		treeSet.add(22);
		treeSet.add(656);
		treeSet.add(9898);
		treeSet.add(9);
		treeSet.add(11);
		treeSet.add(10001);
		treeSet.add(10001);

		// Adding Duplicates
		treeSet.add(9898);
		treeSet.add(9);
		System.out.print("Display Tree set data: " + treeSet);

		// to check if treeset is empty or not.
		if (treeSet.isEmpty())
			System.out.print("Tree Set is empty.");
		else
			System.out.println("Tree Set size: " + treeSet.size());

		// To get the smallest element from the set
		System.out.println("First data: " + treeSet.first());

		// To get the largest value from set
		System.out.println("Last data: " + treeSet.last());

		// remove 61 from set.
		if (treeSet.remove(9898))
			System.out.println("Data is removed from tree set");
		else
			System.out.println("Data doesn't exist!");

		// Remove all
		treeSet.clear();
		if (treeSet.isEmpty())
			System.out.print("Tree Set is empty.");
		else
			System.out.println("Tree Set size: " + treeSet.size());
	}
}
