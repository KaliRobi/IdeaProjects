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


import java.util.*;

public abstract class Cargo {
    private long referenceId;
    private int trackingNumber;
    private int nextTrackingNumber;
    private int prevTrackingNumber;
    private String modOfTransport;
    private String priorityClass;
    private UUID shipmentUuid;

    public Cargo(long referenceId, int trackingNumber, int nextTrackingNumber, int prevTrackingNumber, String modOfTransport, String priorityClass, UUID shipmentUuid) {
        this.referenceId = referenceId;
        this.trackingNumber = trackingNumber;
        this.nextTrackingNumber = nextTrackingNumber;
        this.prevTrackingNumber = prevTrackingNumber;
        this.modOfTransport = modOfTransport;
        this.priorityClass = priorityClass;
        this.shipmentUuid = UUID.randomUUID();
    }

    public abstract void fullDescription();


    public Cargo() {

    }


    public void setShipmentUuid(){
        this.shipmentUuid = UUID.randomUUID();
    }

    public UUID getShipmentUuid() {
        return shipmentUuid;
    }


    public long getReferenceId() {
        return referenceId;
    }

    public void setReferenceId() {
        long num = UUID.randomUUID().toString().hashCode();
        if(num < 0){
            num = num * -1;
        }
        
        this.referenceId = num;
    }

    public int getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(int trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public int getNextTrackingNumber() {
        return nextTrackingNumber;
    }

    public void setNextTrackingNumber(int nextTrackingNumber) {
        this.nextTrackingNumber = nextTrackingNumber;
    }

    public int getPrevTrackingNumber() {
        return prevTrackingNumber;
    }

    public void setPrevTrackingNumber(int prevTrackingNumber) {
        this.prevTrackingNumber = prevTrackingNumber;
    }

    public String getModOfTransport() {
        return modOfTransport;
    }

    public void setModOfTransport() {
        List<String> MoTList = new ArrayList<String>(Arrays.asList("AIR", "SEA", "ROA", "RAI","AIR", "SEA", "ROA", "RAI"));

        Random randMot = new Random();
        int num = randMot.nextInt(7 );
        System.out.println(num);
        this.modOfTransport = MoTList.get(num);
    }

    public String getPriorityClass() {
        return priorityClass;
    }

    public void setPriorityClass() {
        ArrayList<String> proClassList = new ArrayList<>(Arrays.asList("A", "B", "B", "C", "C", "C", "C", "D", "D"));
        Random ran  = new Random();
        int num = ran.nextInt(8);
        this.priorityClass = proClassList.get(num);
    }
}
