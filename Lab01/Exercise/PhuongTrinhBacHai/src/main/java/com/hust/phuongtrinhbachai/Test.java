/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hust.phuongtrinhbachai;

import java.util.Scanner;

/**
 *
 * @author Nguyen Duy Khanh
 */
public class Test {
    public static void main(String[] args) {
        SecondDegreeEquation sec = new SecondDegreeEquation();
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap a = ");
        int a = input.nextInt();
        System.out.println("Nhap b = ");
        int b = input.nextInt();
        System.out.println("Nhap c = ");
        int c = input.nextInt();

        sec.setA(a);
        sec.setB(b);
        sec.setC(c);
        System.out.println(sec.resolve());
    }
}
