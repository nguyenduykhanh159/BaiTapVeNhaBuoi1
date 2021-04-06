/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hust.soict.hedspi.garbage;

import java.util.Random;

/**
 *
 * @author DuyKhanh
 */
public class GarbageCreator {
    public static void main(String[] args) {
        Random r = new Random(123);
        long start = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < Math.pow(2, 19); i++) {
            s += r.nextInt(2);
        }
        System.out.println(System.currentTimeMillis() - start);
        System.out.println(s);
        System.gc();
    }
}
