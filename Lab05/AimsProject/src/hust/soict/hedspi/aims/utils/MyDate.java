/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hust.soict.hedspi.aims.utils;

/**
 *
 * @author DuyKhanh
 */
public class MyDate {
    private String day;
    private String month;
    private String year;

    public MyDate() {

    }

    public MyDate(String day, String month, String year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    String monthNameArray[] = {"January", "February", "March", "April", "May", "June", "July", "August",
            "September", "October", "November", "December"};
    String month3CharArray[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug",
            "Sep", "Oct", "Nov", "Dec"};
    String monthNumArray[] = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};

    String dayNameArray[] = {"first", "second", "third", "fourth", "fifth"};
    String day3CharArray[] = {"1st", "2nd", "3rd", "4th", "5th"};
    String dayNumArray[] = {"01", "02", "03", "04", "05"};

    String yearNameArray[] = {"twenty fifteen", "twenty sixteen", "twenty seventeen", "twenty eighteen",
            "twenty nineteen", "twenty twenty"};
    String yearNumArray[] = {"2015", "2016", "2017", "2018", "2019", "2020"};

    public void print() {
        String dayString = this.day;
        String monthString = this.month;
        String yearString = this.year;

        if (DateUtils.indexOfArray(monthNameArray, monthString) != -1 &&
                DateUtils.indexOfArray(dayNameArray, dayString) != -1 &&
                DateUtils.indexOfArray(yearNameArray, yearString) != -1)
        {
            dayString = day3CharArray[DateUtils.indexOfArray(dayNameArray, dayString)];
            yearString = yearNumArray[DateUtils.indexOfArray(yearNameArray, yearString)];

            System.out.println(monthString + " " + dayString + " " + yearString);
        }
        else if (DateUtils.indexOfArray(monthNameArray, monthString) == -1 ||
                DateUtils.indexOfArray(dayNameArray, dayString) == -1 ||
                DateUtils.indexOfArray(yearNameArray, yearString) == -1)
        {
            System.out.println("Error date");
        }
    }

    public String printFormat(String formatDate) {
        String dayNum = dayNumArray[DateUtils.indexOfArray(dayNameArray, this.day)];
        String monthNum = monthNumArray[DateUtils.indexOfArray(monthNameArray, this.month)];
        String yearNum = yearNumArray[DateUtils.indexOfArray(yearNameArray, this.year)];
        String monthString = month3CharArray[DateUtils.indexOfArray(monthNameArray, this.month)];

        switch (formatDate) {
            case "yyyy-MM-dd": {
                return (yearNum + "-" + monthNum + "-" + dayNum);
            }
            case "d/M/yyyy": {
                return (Integer.parseInt(dayNum) + "/" + Integer.parseInt(monthNum) + "/" + yearNum);
            }
            case "dd-MMM-yyyy": {
                return (dayNum + "-" + monthString + "-" + yearNum);
            }
            case "MMM d yyyy": {
                return (monthString + " " + Integer.parseInt(dayNum) + " " + yearNum);
            }
            case "mm-dd-yyyy": {
                return (monthNum + "-" + dayNum + "-" + yearNum);
            }
            default: {
                System.out.println("Error format");
                return null;
            }
        }
    }
}
