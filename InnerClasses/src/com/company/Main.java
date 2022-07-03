package com.company;

import java.util.Scanner;

public class Main {
        private static Scanner scanner = new Scanner(System.in);
        private static Button btnPrint = new Button("Print");
    public static void main(String[] args) {
	    // static
        //nonstatic, inner class
        //local class
        //anonymous inner class

//        Gearbox mcLaren = new Gearbox(6);
//        Gearbox.Gear first = mcLaren.new Gear(1, 12.3); //inner class call
//        System.out.println(first.driveSpeed((1000)));

//            Gearbox mcLaren = new Gearbox(6);
//            mcLaren.addGear(1,5.3);
//            mcLaren.addGear(2,10.6);
//            mcLaren.addGear(3,15.9);
//            mcLaren.operateClutch(true);
//            mcLaren.changeGear(1);
//            mcLaren.operateClutch(false);
//            System.out.println(mcLaren.wheelSpeed(1000));
//            mcLaren.changeGear(2);
//            System.out.println(mcLaren.wheelSpeed(3000));
//            mcLaren.operateClutch(true);
//            mcLaren.changeGear(3);
//            mcLaren.operateClutch(false);
//            System.out.println(mcLaren.wheelSpeed(6000));

                // local class because it was used only here and applicable only here
//                class ClickListener implements Button.OnClickListener{
//                     public ClickListener(){
//                             System.out.println("I have been attached");
//                     }
//
//                        @Override
//                        public void onClick(String title) {
//                                System.out.println(title+ " was clicked");
//                        }
//                }
//            btnPrint.setOnClickListener(new ClickListener());
//                listen();
            btnPrint.setOnClickListener((new Button.OnClickListener() {
                    @Override
                    public void onClick(String title) {
                            System.out.println("title was clicked");
                    }
            }));
    }
    private static void listen() {
            boolean ttt = false;
            while(!ttt){
                    int choice = scanner.nextInt();
                    scanner.nextLine();
                    switch (choice){
                            case 0:
                                      ttt = true;
                                      break;
                            case 1:
                                    btnPrint.onClick();
                                    break;
                    }
            }
    }
}
