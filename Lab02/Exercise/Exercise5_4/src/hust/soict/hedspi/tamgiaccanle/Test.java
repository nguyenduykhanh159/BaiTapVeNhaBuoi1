/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hust.soict.hedspi.tamgiaccanle;

import hust.soict.hedspi.tamgiaccanle.triangel.TamGiacCanLe;
import java.util.Scanner;

/**
 *
 * @author DuyKhanh
 */
public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TamGiacCanLe result = new TamGiacCanLe();

        System.out.print("Nhap chieu cao n : ");
        int n = input.nextInt();
        result.setN(n);
        result.showTriangel(result.getN());
    }
}
