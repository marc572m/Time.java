package com.company;

public class Main {

    public static void main(String[] args) {
	System.out.println("Hello World");

    int hour = 16;
    int minutes = 43;
    int seconds = 20;

    int oldhour = 16;
    int oldminutes = 16;
    int oldseconds = 10;

    //Seconds since midnight
    float Midnight = seconds+minutes*60+hour*3600;

    //Old seconds since midnight
    float oldMidnight = oldseconds+oldminutes*60+hour*3600;

    float Fullday = 86400;

    //Seconds remaining of the day
    float Day = 86400-Midnight;

    System.out.print("Seconds since midnight: ");
    System.out.println(Midnight);

    System.out.println();
    System.out.print("Seconds remaining of the day: ");
    System.out.println(Day);

    System.out.println();
    System.out.print("Percentage of the day passed: ");
    System.out.println(100/Fullday*Midnight+"%");

    System.out.println();
    System.out.print("Elapsed time: ");
    System.out.println(Midnight-oldMidnight);


    }
}
