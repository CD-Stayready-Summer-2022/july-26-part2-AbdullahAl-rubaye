package cd.get.ready.algorithms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CountDuplicates {
    /**
     * Example of overloading a function that accepts a Array String
     * @param input
     * @return
     */
    public Integer countDuplicates(String[] input){
        return null;
    }

    /**
     * Example of overloading a function that accepts a Array of Integers
     * @param input
     * @return
     */
    public Integer countDuplicates(Integer[] input){

        Set<Integer> dupes = new HashSet<Integer>();
        int d=0;
        for (Integer i : input) {
            if (input[i]>1) {
                d= input[i];
            }
        }

        return d;
    }


    }

