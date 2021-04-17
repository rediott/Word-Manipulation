/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.FileInputStream;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class Stopwords_Removal {
        public static  String Stopwords_Removal(String in){
        String[] words = in.split("\\s+");
       
        
        ArrayList stopword = new ArrayList<>();
        String cleaned ="";
        try {
             
            FileInputStream  stop = new FileInputStream ("src\\stopwords.txt");
            byte[] x = new byte[stop.available()];
            stop.read(x);
            String[] data = new String(x).trim().split("\\n");
                    
            for (int i = 0; i < data.length; i++) {
                stopword.add(data[i].trim());
            }
            
            for (int i = 0; i < words.length; i++) {
                if (!(stopword.contains(words[i].trim().toLowerCase()))) {
                    cleaned=cleaned+words[i]+" ";
                   
                }
            }
            System.out.println(cleaned);
            
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cleaned;
    }
}
