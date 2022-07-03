package com.company;

public class Main {

    public static void main(String[] args) {
	//getDurationString(61, 0);
        System.out.println(getDurationString(3945));
    }
    public static String getDurationString(int minutes, int seconds){
        if(minutes >= 0){
            if(seconds >= 0 && seconds <=59){
                int allSeconds = minutes * 60 + seconds;
                int hours = allSeconds / 3600;
                int resMinutes = (allSeconds % 3600) / 60;
                int resSec = (allSeconds % 3600) % 60;
               return hours + "h " + resMinutes +"m " + resSec + "s ";
            } else {
                return "Invalid e Value";
        }
    }
        else {
            return "Invalid Value";
        }
}
    public static String getDurationString(int seconds){
        if(seconds >=0 ){
            int mins = seconds  / 60;
            int sec  = seconds  % 60;
            return getDurationString(mins, sec);
        } else {
            return "Invalid data";
        }

    }



}
