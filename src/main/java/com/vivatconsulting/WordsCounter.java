package com.vivatconsulting;

import java.util.StringTokenizer;

public class WordsCounter {

    public static int numberOfWords(String str)  {

        if(str ==null || str.isEmpty()) throw new NullPointerException();

        StringTokenizer tokens = new StringTokenizer(str);
        int size =tokens.countTokens();

        for (int i = 0; i <size ; i++) {
            System.out.printf("%d %s" ,i,tokens);
        }
        System.out.println(tokens.countTokens());

        return size;
    }
}
