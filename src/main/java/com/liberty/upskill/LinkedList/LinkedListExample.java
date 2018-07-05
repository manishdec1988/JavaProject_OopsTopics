package com.liberty.upskill.LinkedList;

import java.util.*;

public class LinkedListExample
{
    public static void main(String args[])
    {
        // Creating object of class linked list
        LinkedList<String> myList = new LinkedList<String>();
 
        // Adding elements to the linked list
        myList.add("Sudharsan");
		myList.add("Veera");
		myList.add("Sandeep");
		myList.add("Manish");
		myList.add("Amit");
		myList.add("Mani");
		myList.add("Random");
        System.out.println("Linked list : " + myList);
 
        // Removing elements from the linked list
        myList.remove("Amit");
        myList.remove("Manish");
        myList.removeFirst();
        myList.removeLast();
      
        System.out.println("Linked list after deletion: " + myList);
 
        // Finding elements in the linked list
        boolean status = myList.contains("Sandeep");
 
        if(status)
            System.out.println("List contains the element 'Sandeep' ");
        else
            System.out.println("List doesn't contain the element 'Sandeep'");
 
        // Number of elements in the linked list
        int size = myList.size();
        System.out.println("Size of linked list = " + size);
 
        // Get and set elements from linked list
        Object element = myList.get(2);
        System.out.println("Element returned by get() : " + element);
        myList.set(2, "NewTeamMember");
        System.out.println("Linked list after change : " + myList);
    }
}
