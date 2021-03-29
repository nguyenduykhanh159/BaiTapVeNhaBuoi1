/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hust.soict.hedspi.aims;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.order.Order;
import hust.soict.hedspi.aims.utils.MyDate;

/**
 *
 * @author DuyKhanh
 */
public class DiskTest {
    public static void main(String[] args) {
        MyDate dateOrdered1 = new MyDate("second", "September", "twenty twenty");
        Order anOrderTest = new Order(dateOrdered1);

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Naruto", "Anime", "Kishimoto", 71, 20.05f);

        DigitalVideoDisc[] orderListTest;
        orderListTest = new DigitalVideoDisc[]{dvd1, dvd3, dvd4, dvd2};
        anOrderTest.addDigitalVideoDisc(orderListTest);

        System.out.println(dvd1.search("The Lion King"));
        System.out.println(dvd1.search("Lion"));
        System.out.println(dvd1.search("lion"));
        System.out.println(dvd1.search("lion King"));

        anOrderTest.printOrderedWithoutLuckyItem();
    }
}
