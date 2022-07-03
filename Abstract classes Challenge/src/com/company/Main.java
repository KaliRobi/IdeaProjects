package com.company;

// For this challenge, create an abstract class to define items that can be stored in a list.
// The class should contain 2 references to items which will represent the next and previous
// items (in the case of a linked list).
// I.e., if you call your abstract class ListItem, then it would have 2 member variables of
// type ListItem that will hold references to the next/right and previous/left ListItems.
//
// The abstract class will also need to hold a value - try to be as flexible as possible
// when defining the type of this value.
//
// The class will also need methods to move to the next item and back to the previous item,
// and methods to set the next and previous items.


import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

  SchedulledArrivingShipments newSc = new SchedulledArrivingShipments();

  newSc.receiveArrivingCargo();
        newSc.receiveArrivingCargo();
        newSc.receiveArrivingCargo();
        newSc.receiveArrivingCargo();
        newSc.receiveArrivingCargo();
        newSc.receiveArrivingCargo();


    }
}
