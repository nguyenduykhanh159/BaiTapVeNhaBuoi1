/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hust.exercise5_7;

import java.util.Scanner;

/**
 *
 * @author Nguyen Duy Khanh
 */
public class CongHaiMaTran {
    private int a[][];
    private int b[][];

    public CongHaiMaTran() {
        
    }

    public CongHaiMaTran(int[][] a, int[][] b) {
        this.a = a;
        this.b = b;
    }

    public int[][] getA() {
        return a;
    }

    public void setA(int[][] a) {
        this.a = a;
    }
    
    public int[][] getB() {
        return b;
    }

    public void setB(int[][] b) {
        this.b = b;
    }
    
    public void nhapMatran(int a[][]) {
        Scanner input = new Scanner(System.in);
        int soDong = a.length;
        int soCot = a[0].length;
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.println("["+i+", "+j+"] = ");
                a[i][j] = input.nextInt();
            }
        }
        xuatMatran(a);
    }

    public void xuatMatran(int a[][]) {
        int soDong = a.length;
        int soCot = a[0].length;
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.printf("%3d", a[i][j]);
            }
            System.out.println();
        }
    }
    
    public void sum(int a[][], int b[][]) {
        int c[][] = new int[a.length][b[0].length];
        int soDong = a.length;
        int soCot = b[0].length;
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        xuatMatran(c);
    }
}
