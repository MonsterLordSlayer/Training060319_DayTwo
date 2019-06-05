package com.example.training060319_daytwo;
import java.util.Arrays;
public class Table {
    public void printTables(){
        int[][] multiple = new int[10][10];
        for (int i=0;i<=9;i++){
            for (int j=0;j<=9;j++){
                multiple[i][j]=(i+1)*(j+1);
            }
            System.out.println(Arrays.toString(multiple[i]));
        }
    };
    public static void main(String[] args){
        Table t=new Table();
        t.printTables();
    }
}
