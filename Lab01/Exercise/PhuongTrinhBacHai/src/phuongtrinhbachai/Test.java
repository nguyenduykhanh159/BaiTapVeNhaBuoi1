package phuongtrinhbachai;

import java.util.Scanner;

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
