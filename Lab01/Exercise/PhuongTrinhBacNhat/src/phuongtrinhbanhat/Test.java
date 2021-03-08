package phuongtrinhbanhat;

import java.util.Scanner;

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
