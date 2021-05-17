package com.ss.jb.five;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LetterAThreeLetter {


    /*
        - Create Stream<String> using .stream()
        - filter those that start with a and have length of 3 via .filter()
        - Form newly made Stream<String> into a List<String?
          via .collect(Collectors.toList())
     */
    public List<String> lATL(List<String> a) {
        return a.stream().filter(i ->i.startsWith("a")&& i.length()==3 ).collect(Collectors.toList());
    }
}
