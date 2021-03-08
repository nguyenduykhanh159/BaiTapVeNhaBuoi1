package hephuongtrinhbacnhat;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        SystemFirstDegreeEquation sys = new SystemFirstDegreeEquation();
        Scanner input = new Scanner(System.in);

        System.out.print("Nhap a11 = ");
        int a11 = input.nextInt();
        System.out.print("Nhap a12 = ");
        int a12 = input.nextInt();
        System.out.print("Nhap b1 = ");
        int b1 = input.nextInt();
        System.out.print("Nhap a21 = ");
        int a21 = input.nextInt();
        System.out.print("Nhap a22 = ");
        int a22 = input.nextInt();
        System.out.print("Nhap b2 = ");
        int b2 = input.nextInt();

        sys.setA11(a11);
        sys.setA12(a12);
        sys.setA21(a21);
        sys.setA22(a22);
        sys.setB1(b1);
        sys.setB2(b2);
        System.out.println(sys.resolve());
    }
}
