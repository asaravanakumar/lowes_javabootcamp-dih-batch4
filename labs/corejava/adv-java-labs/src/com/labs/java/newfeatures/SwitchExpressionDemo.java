package com.labs.java.newfeatures;

public class SwitchExpressionDemo {
    public static void main(String[] args) {
        // alarm - monday - 4 am
        // rest of the weekdays - 5 am
        // weekends - 8 am

        WeekDay day = WeekDay.MONDAY;

        String time = null;

        // Switch Statement

//        switch(day) {
//            case MONDAY:
//                time = "4am";
//                break;
//            case TUESDAY:
//            case WEDNESDAY:
//            case THURSDAY:
//            case FRIDAY:
//                time = "5am";
//                break;
//            case SATURDAY:
//            case SUNDAY:
//                time = "8am";
//        }

        // Switch Expression #1
        time = switch(day) {
            case MONDAY -> "4am";
            case TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> "5am";
            case SATURDAY, SUNDAY -> "8am";
            default -> "Invalid Day";
        };

        // Switch Expression #2
        time = switch(day) {
            case MONDAY: yield "4am";
            case TUESDAY, WEDNESDAY, THURSDAY, FRIDAY: yield "5am";
            case SATURDAY, SUNDAY: yield "8am";
            default: yield "Invalid Day";
        };

        System.out.println("Alarm set at " + time);

    }

    enum WeekDay {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    }
}
