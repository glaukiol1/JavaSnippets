package com.company;

public class JavaDurationString {
    public static void main(String[] args) {
        System.out.println(
                getDurationString(3500)
        );
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes >= 0 && seconds >= 0 && seconds <= 59) {
            int hours = minutes / 60;
            int leftOverMin = minutes % 60;
            return hours + "h " + leftOverMin + "m " + seconds + "s";
        } else {
            return "Invalid Value";
        }
    }

    public static String getDurationString(int seconds) {
        if (seconds >= 0) {
            int minutes = seconds / 60;
            int leftOverSeconds = seconds % 60;
            int hour = minutes / 60;
            int leftOverMinutes = minutes % 60;
            return hour + "h " + leftOverMinutes + "m " + leftOverSeconds + "s ";
        } else {
            return "Invalid value";
        }
    }
}
