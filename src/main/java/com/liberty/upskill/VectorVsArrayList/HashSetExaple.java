package com.liberty.upskill.VectorVsArrayList;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

/*
 * 1-HashSet doesn’t maintain any order, the elements would be returned in any random order.
   2-HashSet doesn’t allow duplicates. If you try to add a duplicate element in HashSet, the old value would be overwritten.
   3-HashSet allows null values however if you insert more than one nulls it would still return only one null value.
   4-HashSet is non-synchronized.
 */

public class HashSetExaple {
	public static void main(String args[]) {
		// HashSet declaration
		HashSet<String> Obj = new HashSet<String>();

		// Adding elements to the HashSet
		Obj.add("Mani");
		Obj.add("Manish");
		Obj.add("Amit");
		Obj.add("Sudharshan");
		Obj.add("Sandeep");
		Obj.add("Veera");
		// Addition of duplicate elements
		Obj.add("Manish");
		Obj.add("Amit");
		// Addition of null values
		Obj.add(null);
		Obj.add(null);

		// Iterating over hash set items
		System.out.println("****************Display the values in HashSet:************************");
		Iterator<String> i = Obj.iterator();
		while (i.hasNext())
			System.out.println(i.next());

		// Removing the values from Hasset
		Obj.remove("Manish");
		Obj.remove("Amit");

		// Display the value after removing the names
		System.out.println("********Display the values after removing the Name from HashSet:****************");
		Iterator<String> j = Obj.iterator();
		while (j.hasNext())
			System.out.println(j.next());
		
		System.out.println("**********************************************************");
		System.out.println("Size of the HashSet:"+Obj.size());
		
		System.out.println("**********************************************************");
		System.out.println("Size of the HashSet is Empty:"+Obj.isEmpty());
		
		System.out.println("**********************************************************");
		System.out.println("Check Manish is available in HashSet:"+Obj.contains("Manish"));
		System.out.println("Check Veera is available in HashSet:"+Obj.contains("Veera"));

	}

}