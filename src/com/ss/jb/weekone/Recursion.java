package com.ss.jb.weekone;

public class Recursion {

    public Boolean groupSumClump(Integer pos, Integer[] numbers, Integer sum){
        // Sum of zero can be made from any list
        if(sum ==0){
            return true;
        }
        // if can not reach sum with given values
        // (run out of values) return false;
        else if(pos>=numbers.length){
            return false;
        }
        // figure out if can reach sum with left over values
        else{
            // Figure out how many in a group
            Integer groupEnd= pos;
            while(groupEnd<numbers.length && numbers[pos]==numbers[groupEnd]){
                groupEnd++;
            }
            Integer groupSize = groupEnd-pos;

            // either use group or dont use group
            return groupSumClump(groupEnd, numbers, sum) || groupSumClump(groupEnd, numbers, sum-(numbers[pos]*groupSize));
        }
    }
}
