package com.framework.hometask1.utils;

public class DateUtil {

    public static String isTodayHoliday(String day) {
        boolean isTodayHoliday = switch (day) {
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> false;
            case "SATURDAY", "SUNDAY" -> true;
            default -> throw new IllegalStateException("Unknown day");
        };
        return isTodayHoliday ? "Today is holiday!" : "Today is not holiday!";
    }
}
