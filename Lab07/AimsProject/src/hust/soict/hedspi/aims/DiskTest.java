/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hust.soict.hedspi.aims;

import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.order.Order;
import hust.soict.hedspi.aims.utils.MyDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DuyKhanh
 */
public class DiskTest {
    public static void main(String[] args) {
        List<Media> listItems = new ArrayList<>();
        MyDate dateOrdered1 = new MyDate("second", "September", "twenty twenty");
        Order anOrderTest = new Order(dateOrdered1);

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        Book book1 = new Book("Aladin", "Manga", 18.99f);
        Book book2 = new Book("Naruto", "Manga", 20.05f);
        
        book1.addAuthor("Noname");
        book2.addAuthor("Kishimoto");

        listItems.add(dvd1);
        listItems.add(book2);
        listItems.add(book1);
        listItems.add(dvd2);
        anOrderTest.addMedia(listItems);

        anOrderTest.printOrderedWithLuckyItem();
    }
}
