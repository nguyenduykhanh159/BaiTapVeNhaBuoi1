package conghaimatran;

import java.util.Scanner;

public class CongHaiMaTran {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nhap so dong : ");
        int soDong = input.nextInt();
        System.out.print("Nhap so cot : ");
        int soCot = input.nextInt();

        int a[][] = new int[soDong][soCot];
        System.out.println("Nhap ma tran a : ");
        nhapMatran(a);
        int b[][] = new int[soDong][soCot];
        System.out.println("Nhap ma tran b : ");
        nhapMatran(b);

        int c[][] = new int[soDong][soCot];
        System.out.println("Ma tran tong la : ");
        sum(a, b);
    }

    public static void sum(int a[][], int b[][]) {
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

    public static void nhapMatran(int a[][]) {
        int soDong = a.length;
        int soCot = a[0].length;
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print("["+i+", "+j+"] = ");
                a[i][j] = input.nextInt();
            }
        }
        xuatMatran(a);
    }

    public static void xuatMatran(int a[][]) {
        int soDong = a.length;
        int soCot = a[0].length;
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.printf("%3d", a[i][j]);
            }
            System.out.println();
        }
    }
}
