/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hust.soict.hedspi.mangmotchieu.array;

import java.util.Scanner;

/**
 *
 * @author DuyKhanh
 */
public class MangMotChieu {
    private int a[];

    public MangMotChieu() {

    }

    public MangMotChieu(int[] a) {
        this.a = a;
    }

    public int[] getA() {
        return a;
    }

    public void setA(int[] a) {
        this.a = a;
    }

    public void nhapMang(int a[]) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.print("a["+i+"] = ");
            a[i] = input.nextInt();
        }
    }

    public void sapXep(int a[]) {
        int temp = a[0];
        for (int i = 0; i <= a.length - 2; i++) {
            for (int j = i + 1; j <= a.length - 1; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public void showArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public int sum(int a[]) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    public double average(int a[]) {
        return (double)sum(a) / a.length;
    }
}
