/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hust.soict.hedspi.test.utils;

import hust.soict.hedspi.aims.utils.DateUtils;
import hust.soict.hedspi.aims.utils.MyDate;

/**
 *
 * @author DuyKhanh
 */
public class DateTest {
    public static void main(String[] args) {
        MyDate date1 = new MyDate("second", "September", "twenty nineteen");
        MyDate date2 = new MyDate("first", "April", "twenty fifteen");
        MyDate date3 = new MyDate("fifth", "July", "twenty twenty");
        MyDate date4 = new MyDate("fourth", "Octo", "2020");

        date1.print();
        date2.print();
        date3.print();
        date4.print();

        System.out.println();
        System.out.println(date1.printFormat("yyyy-MM-dd"));
        System.out.println(date1.printFormat("d/M/yyyy"));
        System.out.println(date2.printFormat("dd-MMM-yyyy"));
        System.out.println(date2.printFormat("MMM d yyyy"));
        System.out.println(date3.printFormat("mm-dd-yyyy"));
        System.out.println(date3.printFormat("yyyymmdd"));

        System.out.println();
        System.out.println(DateUtils.compareTwoDates(date1, date2));
        System.out.println(DateUtils.compareTwoDates(date1, date3));

        System.out.println();
        MyDate dateArray[];
        dateArray = new MyDate[]{date1, date2, date3};
        DateUtils.sortDate(dateArray);
        System.out.print("DateArray after sorting is : ");
        for (int i = 0; i < dateArray.length; i++) {
            System.out.print(dateArray[i].printFormat("yyyy-MM-dd") + " ");
        }
        System.out.println();
    }
}
