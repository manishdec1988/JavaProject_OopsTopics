package com.liberty.upskill.StreamsAndWriters;

import java.io.*;  

public class StreamsAndWriters {  
    public static void main(String[] args) {  
        try {  
            Writer w = new FileWriter("C:\\Users\\n0257057\\Desktop\\output.txt");  
            String content = "This is how we can write in output txt file Angu!!!";  
            w.write(content);  
            w.close();  
            System.out.println("Writing is Done!!!");  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }  
}  