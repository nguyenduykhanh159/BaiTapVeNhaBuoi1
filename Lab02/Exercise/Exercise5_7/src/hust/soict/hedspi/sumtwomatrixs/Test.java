/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hust.soict.hedspi.sumtwomatrixs;

import hust.soict.hedspi.sumtwomatrixs.sum.TongHaiMaTran;
import java.util.Scanner;

/**
 *
 * @author DuyKhanh
 */
public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TongHaiMaTran sum = new TongHaiMaTran();

        System.out.print("Nhap so dong : ");
        int soDong = input.nextInt();
        System.out.print("Nhap so cot : ");
        int soCot = input.nextInt();

        int a[][] = new int[soDong][soCot];
        sum.setA(a);
        System.out.println("Nhap ma tran a : ");
        sum.nhapMatran(sum.getA());
        int b[][] = new int[soDong][soCot];
        sum.setB(b);
        System.out.println("Nhap ma tran b : ");
        sum.nhapMatran(sum.getB());

        int c[][] = new int[soDong][soCot];
        System.out.println("Ma tran tong la : ");
        sum.sum(sum.getA(), sum.getB());
    }
}
