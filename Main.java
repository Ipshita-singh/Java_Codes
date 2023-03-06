package com.company;

public class Main {

    public static void main(String[] args) {
        printYearsAndDays(1440);
    }
    public static void printYearsAndDays(long minutes){
        if(minutes<0){
            System.out.println("Invalid Value");
        }
        else{
            long hour = (minutes/60);
            long day = (hour/24);
            long YY = (day/365);
            long dd = (day%365);
            System.out.println(minutes + " min = " + YY + " y and " + dd + " d");
        }
    }
}
