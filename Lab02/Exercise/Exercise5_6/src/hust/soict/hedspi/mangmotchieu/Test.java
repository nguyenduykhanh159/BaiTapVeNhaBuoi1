/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hust.soict.hedspi.mangmotchieu;

import hust.soict.hedspi.mangmotchieu.array.MangMotChieu;
import java.util.Scanner;

/**
 *
 * @author DuyKhanh
 */
public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MangMotChieu array = new MangMotChieu();

        System.out.print("Nhap so luong phan tu : ");
        int n = input.nextInt();
        int a[] = new int[n];
        array.setA(a);
        array.nhapMang(array.getA());
        System.out.print("Mang da nhap la : "); array.showArray(array.getA());
        array.sapXep(array.getA());
        System.out.print("Mang duoc sap xep la : "); array.showArray(array.getA());
        System.out.println("Tong cua cac phan tu trong day la : " + array.sum(array.getA()));
        System.out.println("Trung binh cong cac phan tu trong day la : " + array.average(array.getA()));
    }
}
