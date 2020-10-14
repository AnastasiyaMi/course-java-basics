package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class TimeTest {
    public static void main (String[] args) {
        Time hoursMinutesSeconds  = new Time (2,20,24 );
        Time totalSeconds = new Time (8424);
        System.out.printf ("Hours: %d, Minutes: %d, Seconds: %d", hoursMinutesSeconds.getHours(), hoursMinutesSeconds.getMinutes(),
                hoursMinutesSeconds.getSeconds());
        System. out.printf (". TotalSeconds: %d\n", hoursMinutesSeconds.getTotalSeconds());

    }
}
