/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hust.soict.hedspi.phuongtrinhbacnhat;

import hust.soict.hedspi.phuongtrinhbacnhat.firstdegree.FirstDegreeEquation;
import java.util.Scanner;

/**
 *
 * @author DuyKhanh
 */
public class Test {
    public static void main(String[] args) {
        FirstDegreeEquation first = new FirstDegreeEquation();
        Scanner input = new Scanner(System.in);

        System.out.print("Nhap a = ");
        int a = input.nextInt();
        System.out.print("Nhap b = ");
        int b = input.nextInt();

        first.setA(a);
        first.setB(b);
        System.out.println(first.resolve());
    }
}
