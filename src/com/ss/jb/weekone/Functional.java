package com.ss.jb.weekone;

import java.util.ArrayList;
import java.util.List;

public class Functional {

    // For every element in the list get the remainder (last digit)
    public List<Integer> right(List<Integer> x){
        List<Integer> result = new ArrayList<Integer>();
        x.forEach((y) -> result.add(y%10));
        return result;
    }

    // For every element in the list double it
    public List<Integer> dob(List<Integer> x){
        List<Integer> result = new ArrayList<Integer>();
        x.forEach((i)-> result.add(i*2));
        return result;
    }

    // For every element in the list remove any occurrences of "x"
    public List<String> remove(List<String> x) {
        List<String> result = new ArrayList<String>();
        x.forEach((i)->{
            Integer pos=i.indexOf("x");
            while(pos>=0){
                if(pos==i.length()-1){
                    i=i.substring(0,pos);
                }
                else{
                    i=i.substring(0,pos)+i.substring(pos+1);
                }
                pos=i.indexOf("x");
            }
            result.add(i);
        });
        return result;
    }
}
