/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author LENOVO
 */
public class Freq_Words {
        public static String Freq_Words(String in){
        Map<String,Integer> freq=new TreeMap<>();
        String words[]=in.split(" ");
        
        for(int i=0;i<words.length;i++)
        {

            if(freq.containsKey(words[i]))
            {
                freq.put(words[i], freq.get(words[i])+1);
            }
            else
            {
                freq.put(words[i],1);
            }
        }
       String value ="";
       for(Map.Entry<String,Integer> entry: 
                    freq.entrySet())
        {
            value = value + entry.getKey()+" : "+entry.getValue()+"\n";
        }
       return value;
    }
}
