package com.example.training060319_daytwo;

public class FizzBuzz {
    public void printfizzbuzz(int number){
        String answer="";
        if (number%3==0)answer+="Fizz";
        if (number%5==0)answer+="Buzz";
        if (!answer.isEmpty())System.out.println(answer);
    }
    public static void main(String[] args){

        FizzBuzz f=new FizzBuzz();
        f.printfizzbuzz(15);
        f.printfizzbuzz(3);
        f.printfizzbuzz(5);
        f.printfizzbuzz(2);
    }
}
