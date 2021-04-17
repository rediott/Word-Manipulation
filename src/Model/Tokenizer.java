/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.StringTokenizer;

/**
 *
 * @author LENOVO
 */
public class Tokenizer {
        public static String Tokenizer (String in){
        
        StringTokenizer defaultTokenizer = new StringTokenizer(in);
        String value = "Jumlah kata yang dipecah menjadi token  : " + defaultTokenizer.countTokens();
        System.out.println("Total number of tokens found : " + defaultTokenizer.countTokens());
        
        String [] tokened= new String[defaultTokenizer.countTokens()];

        for (int i = 0; i < tokened.length; i++) {
            tokened[i] = defaultTokenizer.nextToken();
        }
       
        for (int i = 0; i < tokened.length; i++) {
            value = value + "\n" + tokened[i];
        }
        return value;
        
    }
}
