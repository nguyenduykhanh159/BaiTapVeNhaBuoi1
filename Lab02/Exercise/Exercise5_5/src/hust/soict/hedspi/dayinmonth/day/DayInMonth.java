/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hust.soict.hedspi.dayinmonth.day;

/**
 *
 * @author DuyKhanh
 */
public class DayInMonth {
    private int year;
    private String monthString;

    public DayInMonth() {

    }

    public DayInMonth(int year, String monthString) {
        this.year = year;
        this.monthString = monthString;
    }


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMonthString() {
        return monthString;
    }

    public void setMonthString(String monthString) {
        this.monthString = monthString;
    }

    public boolean isNumeric(String monthString) {
        try {
            Integer.parseInt(monthString);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public boolean isLeapYear(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
    }

    public int dayInMonth(int year, String monthString) {
        if (isNumeric(monthString) == true) {
            int changeNumeric = Integer.parseInt(monthString);
            switch(changeNumeric) {
                case 1, 3, 5, 7, 8, 10, 12 -> {
                    return 31;
                }
                case 4, 6, 9, 11 -> {
                    return 30;
                }
                case 2 -> {
                    if (isLeapYear(year) == true) return 29;
                    else return 28;
                }
                default -> {
                    return 0;
                }
            }
        }
        else {
            switch(monthString) {
                case "Jan", "Mar", "May", "Jul", "Aug", "Oct", "Dec" -> {
                    return 31;
                }
                case "Apr", "Jun", "Sep", "Nov" -> {
                    return 30;
                }
                case "Feb" -> {
                    if (isLeapYear(year) == true) return 29;
                    else return 28;
                }
                default -> {
                    return 0;
                }
            }
        }
    }
}
