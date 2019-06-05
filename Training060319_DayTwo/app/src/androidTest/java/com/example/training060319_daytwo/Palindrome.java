package com.example.training060319_daytwo;

public class Palindrome {
    public boolean checkPalindrome(String word){
        for (int i=0;i<word.length()-1;i++){
            if (word.charAt(i)!=word.charAt(word.length()-1-i)){
                return false;
            }
        }
        return true;
    };
    public static void main(String[] args){
        String a= "abcdedcba";
        Palindrome p=new Palindrome();
        System.out.println(p.checkPalindrome(a));
    }
}
