package com.ss.jb.five;

import java.util.Comparator;

public class alphabeticalComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        if(o1.charAt(0)>o2.charAt(0)){
            return 1;
        }
        if(o1.charAt(0)<o2.charAt(0)){
            return -1;
        }
        return 0;

    }
}
