package com.liberty.upskill.map;

import java.util.*;

class HashMapExample {
	public static void main(String args[]) {
		// create and populate hash map
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(101, "Manish");
		map.put(102, "Mani");
		map.put(103, "Sandeep");
		map.put(104, "Veera");
		System.out.println("Printing Values before remove: " + map);
		// Remove value for key 102
		map.remove(102);
		System.out.println("Printing Values after remove: " + map);
	}
}
