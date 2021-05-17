package com.ss.jb.five;

import java.util.List;

import static java.util.stream.Collectors.joining;

public class CommaSeparatedString {
    public String cSS(List<Integer> a) {

        // Make stream of integer using .stream()
        // apply a method on every element using map
        // the result is a Stream<String>, so use
        // .collect(joining(",") to join strings
        return a.stream().map((i) -> {
            if(i %2 == 0) {
                return "e" + i;
            } else {
                return "o" + i;
            }
        }).collect(joining(","));
    }
}
