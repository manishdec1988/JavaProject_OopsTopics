package com.liberty.upskill.map;

import java.util.*;

/*
 * The Map interface maps unique keys to values. A key is an object that you use to retrieve a value at a later date.
*/

public class MapExample {

   public static void main(String[] args) {
      Map mapObject = new HashMap(); 
      mapObject.put("Mani", "1");
      mapObject.put("Manish", "2");
      mapObject.put("Sudharshan", "3");
      mapObject.put("Sandeep", "4");
      mapObject.put("Amit", "5");
      mapObject.put("Veera", "6");

      System.out.println("Print all Map Elements: "+mapObject);
      System.out.println("Print Size of Map Elements: "+mapObject.size());
      System.out.println("Print values of Map Elements: "+mapObject.values());
      System.out.println("Print key from the Map: "+mapObject.keySet());
   }
}
