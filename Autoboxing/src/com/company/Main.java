package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
       // ArrayList<int> newArray = new ArrayList<int[]>(); // cannot be primitive type

        Integer integer = new Integer(54);

        ArrayList<Integer> integerArray =  new ArrayList<Integer>();
        for(int i =0; i < 10; i++){
            integerArray.add(Integer.valueOf(i));
            //converting a prim type to an Integer (auto boxing)
        }

        for(int i =0; i < 10; i++){
            System.out.println(i + " ---> " + integerArray.get(i).intValue());
            // unboxing when we take it from the wrapper class to integer
        }

        //point is that we need to do this if we want to use the classes instead of
        // primitive types. this is necessary in arraylists for example
        Integer myIntValue = 56;  // which means Integer.valueOf(56)
        int myInt  = myIntValue.intValue();  // myInt.intValue()

        ArrayList<Double> doubArr = new ArrayList<Double>();
        for(double i = 0.0; i <= 10.0; i += 0.5){
            doubArr.add(i);
        }
        for (int i = 0; i < doubArr.size(); i++){
            double value = doubArr.get(i);
        }

    }
}
