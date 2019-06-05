package com.example.training060319_daytwo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicate {

    public void findDuplicates(List<String> strings){

        Set<String> store = new HashSet<>();
        List<String> copy=new ArrayList<>();
        for (String string : strings) {
            if (store.add(string)==false) copy.add(string);
        }
        for (String string : copy){
            System.out.println(string);
        }
    }
    public static void main(String[] args){
        List<String> strings=new ArrayList<>();
        strings.add("ee");
        strings.add("ee1");
        strings.add("ee2");
        strings.add("ee3");
        strings.add("ee1");
        strings.add("ee2");
        Duplicate d=new Duplicate();
        d.findDuplicates(strings);
    }

}
