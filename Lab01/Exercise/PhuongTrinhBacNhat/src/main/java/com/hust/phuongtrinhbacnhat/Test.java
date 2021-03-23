/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hust.phuongtrinhbacnhat;

import java.util.Scanner;

/**
 *
 * @author Nguyen Duy Khanh
 */
public class Test {
    public static void main(String[] args) {
        FirstDegreeEquation first = new FirstDegreeEquation();
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap a = ");
        int a = input.nextInt();
        System.out.println("Nhap b = ");
        int b = input.nextInt();

        first.setA(a);
        first.setB(b);
        System.out.println(first.resolve());
    }
}
