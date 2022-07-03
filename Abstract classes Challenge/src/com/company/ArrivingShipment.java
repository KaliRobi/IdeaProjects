package com.company;

import java.util.UUID;

public class ArrivingShipment extends Cargo{


    public ArrivingShipment(long referenceId, int trackingNumber, int nextTrackingNumber, int prevTrackingNumber, String modOfTransport, String priorityClass, UUID ShipmentUuid) {
        super(referenceId, trackingNumber, nextTrackingNumber, prevTrackingNumber, modOfTransport, priorityClass, ShipmentUuid);
    }
    public ArrivingShipment() {

    }

    @Override
    public void fullDescription() {
        System.out.println("Full description of the Cargo "+ getTrackingNumber() + ": ");
        System.out.println(
           "TN: " + getTrackingNumber() + ";\n" +
            "Priority Class: " + getPriorityClass() + ";\n" +
            "Mod Of Transport:"+ getModOfTransport() + ";\n" +
            "Reference Type: " + getReferenceId()+ ";\n" +
            "Next Tracking Number: " + getNextTrackingNumber() + ";\n" +
            "Previous Tracking Number: " + getPrevTrackingNumber() + ";\n" +
            "UUID: " + getShipmentUuid()+ ";\n"
        );

    }


    @Override
    public UUID getShipmentUuid() {
        return super.getShipmentUuid();
    }

    @Override
    public void setShipmentUuid() {
        super.setShipmentUuid();
    }

    @Override
    public long getReferenceId() {
        return super.getReferenceId();
    }

    @Override
    public void setReferenceId() {
        super.setReferenceId();
    }

    @Override
    public int getTrackingNumber() {
        return super.getTrackingNumber();
    }

    @Override
    public void setTrackingNumber(int trackingNumber) {
        super.setTrackingNumber(trackingNumber);
    }

    @Override
    public int getNextTrackingNumber() {
        return super.getNextTrackingNumber();
    }

    @Override
    public void setNextTrackingNumber(int nextTrackingNumber) {
        super.setNextTrackingNumber(nextTrackingNumber);
    }

    @Override
    public int getPrevTrackingNumber() {
        return super.getPrevTrackingNumber();
    }

    @Override
    public void setPrevTrackingNumber(int prevTrackingNumber) {
        super.setPrevTrackingNumber(prevTrackingNumber);
    }

    @Override
    public String getModOfTransport() {
        return super.getModOfTransport();
    }

    @Override
    public void setModOfTransport() {
        super.setModOfTransport();
    }

    @Override
    public String getPriorityClass() {
        return super.getPriorityClass();
    }

    @Override
    public void setPriorityClass() {
        super.setPriorityClass();
    }
}
