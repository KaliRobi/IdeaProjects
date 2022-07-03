package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//Create a concrete class from your abstract list item class and use this in a LinkedList
// class to implement a linked list that will add items in order (so that they are sorted
// alphabetically). Duplicate values are not added.
//
// Note that you are creating your own LinkedList class here, not using the built-in Java one..
//
// The rules for adding an item to the linked list are:
//  If the head of the list is null, make the head refer to the item to be added.
//  If the item to be added is less than the current item in the list, add the item before the
//      current item (i.e., make the previous item's "next" refer to the new item, and the new item's
//      "next" refer to the current item).
//  If the item to be added is greater than the current item, move onto the next item and compare
//      again (if there is no next item then that is where the new item belongs).
//
// Care will be needed when inserting before the first item in the list (as it will not have a previous
// item).


public class SchedulledArrivingShipments {
    private LinkedList<ArrivingShipment> shipments = new LinkedList<ArrivingShipment>();
    NumberRange newRange =  new NumberRange();






    public void receiveArrivingCargo(){

        ArrivingShipment arrivingShipmentInstance = new ArrivingShipment();
        arrivingShipmentInstance.setModOfTransport();
        arrivingShipmentInstance.setTrackingNumber(newRange.retriveNumberFromRange());
        arrivingShipmentInstance.setShipmentUuid();
        arrivingShipmentInstance.setPriorityClass();
        arrivingShipmentInstance.setReferenceId();
        System.out.println("#########################################");
        arrivingShipmentInstance.fullDescription();
        System.out.println("##########  ####### ######## ######");

    }




}
