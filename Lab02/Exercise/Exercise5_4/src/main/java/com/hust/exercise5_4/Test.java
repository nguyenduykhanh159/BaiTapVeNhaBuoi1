/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hust.exercise5_4;

import java.util.Scanner;

/**
 *
 * @author Nguyen Duy Khanh
 */
public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TamGiacCanLe result = new TamGiacCanLe();
        
        System.out.println("Nhap chieu cao n : ");
        int n = input.nextInt();
        result.setN(n);
        result.showTriangel(result.getN());
    }
}
