package com.liberty.upskill.StreamsAndWriters;

import java.io.FileReader;
import java.io.IOException;

public class InputStreamExample
{
 public static void main(String[] args) throws IOException
 {
     FileReader sourceStream = null;
     try
     {
         sourceStream = new FileReader("C:\\Users\\n0257057\\Desktop\\input.txt");
    
         int temp;
         while ((temp = sourceStream.read()) != -1)
              System.out.print((char)temp);
     }
     finally
     {        
         if (sourceStream != null)            
             sourceStream.close();         
     }
 }
}
