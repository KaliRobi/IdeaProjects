package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        addInOrder("Perth", placesToVisit);
        addInOrder("Melbourne", placesToVisit);
        addInOrder("Brisbane", placesToVisit);
        addInOrder("Canberra", placesToVisit);
        addInOrder("Adelaide", placesToVisit);
        addInOrder("Darwin", placesToVisit);
        addInOrder("Sydney", placesToVisit);
        addInOrder("Sydney", placesToVisit);
//        placesToVisit.add("Sydney");
//        placesToVisit.add("Melbourne");
//        placesToVisit.add("Brisbane");
//        placesToVisit.add("Perth");
//        placesToVisit.add("Canberra");
//        placesToVisit.add("Adelaide");
//        placesToVisit.add("Darwin");
//
          printList(placesToVisit);
//
//        placesToVisit.add(1, "Alice Springs");
//        printList(placesToVisit);
//
//        placesToVisit.remove(4);
//        printList(placesToVisit);
//
//
//        printList(placesToVisit);
        visit(placesToVisit);
    }
    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i= linkedList.iterator(); // accessing the elements of the list. I = one element on the list
        while(i.hasNext()){ //while there isa  next element we are printing it out
            System.out.println("now visiting " + i.next());

        }
        System.out.println("=======================");
    }

    private static boolean addInOrder(String newCity, LinkedList<String> linkedList){
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while(stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity); //0 = equal
            if(comparison == 0){
                //equal do not add
                System.out.println(newCity + " is ready included as a destination");
                return  false;
            } else if(comparison> 0){ // new item should appear before that one
                // we need to move it back here because  .next() already moved to the next entry
                stringListIterator.previous();
                stringListIterator.add(newCity); // so the new item appears in the -1 index of the current one
                return true;
            } else if (comparison < 0){
                // move to the next city
            }
        }
        stringListIterator.add(newCity);
        return true;
    }
    private static void visit(LinkedList cities){
        Scanner sca = new Scanner(System.in);
        boolean quit = false;
        boolean  isGoingForward = true;
        ListIterator<String> listIterator = cities.listIterator();
        // there is no actual current position, this is why we need to play with the back back forward forward
        // so when we go forward or backward we record our direction in one variable
        if(cities.isEmpty()){
            System.out.println("no cities in the itinerary");
            return;
        } else {
            System.out.println("now visiting " + listIterator.next());
        }
        while(!quit) {
            int action = sca.nextInt();
            sca.nextLine();
            switch (action){
                case 0:
                    System.out.println("Holiday over");
                    quit = true;
                    break;
                case 1:
                    if(!isGoingForward){ // we ceheck the direction, if were not going forward so far then we need to do it niw
                        // and now se set the is going forward as true
                      if (listIterator.hasNext()){
                          listIterator.next();
                      }
                      isGoingForward = true;
                }
                    if(listIterator.hasNext()) {
                        System.out.println( "visiting " + listIterator.next());
                    } else {
                        System.out.println("end of the list");
                        isGoingForward = false;
                    }
                    break;
                case 2:
                    if(isGoingForward){
                        if (listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        isGoingForward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("we are at the start of the list");
                        isGoingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }

    }
    private static void printMenu(){
        System.out.println("Available actions: \npress ");
        System.out.println("0 - to quit\n" +
                           "1 - go to the next city\n" +
                            "2 - got to the previous city\n" +
                            "3 - print menu options ");
    }








}
