package com.example.training060319_daytwo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Anagram {
    public boolean checkAnagrams(String word1, String word2){
        if (word1.length()!=word2.length()) return false;
        char array1[]=word1.toCharArray();
        char array2[]=word2.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);

        for (int i=0;i<word1.length();i++){
            if (array1[i]!=array2[i]) return false;
        }
        return true;
    };
    public static void main(String[] args){
        Anagram a=new Anagram();
        System.out.println(a.checkAnagrams("abc3defg","bca4fedg"));

        System.out.println(a.checkAnagrams("abc3defg","bca3fedg"));
    }
}
