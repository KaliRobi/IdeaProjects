package com.company;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumberRange {
    private int start = 100000;
    private int end = 100015;

    private List<Integer> integerList = generateRange(start, end);

    public NumberRange() {
        this.integerList = integerList;

    }

    public int length(){
        return integerList.size();
    }


     private List<Integer> generateRange (int start, int end) {

        List<Integer> integerRange =  IntStream.rangeClosed(start,end)
                .boxed()
                .collect(Collectors.toList());
        return  integerRange;

  }

    public Integer retriveNumberFromRange(){
        Iterator<Integer>  iterator = integerList.iterator();
        if(iterator.hasNext()){
            int forReturn  = integerList.get(integerList.indexOf(iterator.next()));
            System.out.println(forReturn);
            integerList.remove(integerList.indexOf(forReturn));
            return forReturn;
        }
        else{
            return -1;
        }
    }


    }


