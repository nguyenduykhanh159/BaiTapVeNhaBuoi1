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
public class DateUtils {
    public static int indexOfArray(String array[], String s) {
        for (int i = 0; i < array.length; i++) {
            if (s.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }

    public static int compareTwoDates(MyDate date1, MyDate date2) {
        String date1String = date1.printFormat("yyyy-MM-dd");
        String date2String = date2.printFormat("yyyy-MM-dd");
        return date1String.compareTo(date2String);
    }

    public static void sortDate(MyDate dateArray[]) {
        for (int i = 0; i < dateArray.length - 1; i++) {
            for (int j = i + 1; j < dateArray.length; j++) {
                if (compareTwoDates(dateArray[i], dateArray[j]) > 0) {
                    MyDate tmp = dateArray[i];
                    dateArray[i] = dateArray[j];
                    dateArray[j] = tmp;
                }
            }
        }
    }
}
