package mangmotchieu;

import java.util.Scanner;

public class MangMotChieu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhap so phan tu cua mang : ");
        int n = input.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a["+i+"] = ");
            a[i] = input.nextInt();
        }
        sapXep(a);
        System.out.print("Mang duoc sap xep tang dan la : ");
        showArray(a);
        System.out.println("Tong cua cac phan tu trong day la : " + sum(a));
        System.out.println("Trung binh cong cac phan tu trong day la : " + average(a));
    }

    public static void sapXep(int a[]) {
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

    public static void showArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static int sum(int a[]) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    public static double average(int a[]) {
        return (double)sum(a) / a.length;
    }
}
