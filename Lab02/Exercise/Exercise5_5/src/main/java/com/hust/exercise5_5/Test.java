/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hust.exercise5_5;

import java.util.Scanner;

/**
 *
 * @author Nguyen Duy Khanh
 */
public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DayInMonth d = new DayInMonth();
        int year;
        String monthString;

        int result;
        do {
            System.out.println("Nhap nam : ");
            year = input.nextInt();
            input.nextLine();
            System.out.println("Nhap thang : ");
            monthString = input.nextLine();
            d.setYear(year);
            d.setMonthString(monthString);
            result = d.dayInMonth(d.getYear(), d.getMonthString());
        } while(result == 0);
        System.out.println("Thang " + monthString + " co " + result + " ngay");
    }
}
