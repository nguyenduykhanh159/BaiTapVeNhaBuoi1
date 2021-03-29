/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hust.soict.hedspi.phuongtrinhbachai;

import hust.soict.hedspi.phuongtrinhbachai.secdegree.SecondDegreeEquation;
import java.util.Scanner;

/**
 *
 * @author DuyKhanh
 */
public class Test {
    public static void main(String[] args) {
        SecondDegreeEquation sec = new SecondDegreeEquation();
        Scanner input = new Scanner(System.in);

        System.out.print("Nhap a = ");
        int a = input.nextInt();
        System.out.print("Nhap b = ");
        int b = input.nextInt();
        System.out.print("Nhap c = ");
        int c = input.nextInt();

        sec.setA(a);
        sec.setB(b);
        sec.setC(c);
        System.out.println(sec.resolve());
    }
}
