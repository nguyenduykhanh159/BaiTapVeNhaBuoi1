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
import java.util.Scanner;

/**
 *
 * @author DuyKhanh
 */
public class Aims {
    public static Order createOrder(MyDate dateOrder) {
        if (Order.checknbOrders()) {
            System.out.println("Create order successfully");
            return new Order(dateOrder);
        } 
        System.out.println("Create order unsuccessfully");
        return null;
    }
        
    public static void showMenu() {
        System.out.println("Order Management Application: ");
        System.out.println("--------------------------------");
        System.out.println("1. Create new order");
        System.out.println("2. Add item to the order");
        System.out.println("3. Delete item by title");
        System.out.println("4. Display the items list of order");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
    }
    
    public static void main(String[] args) {
        Order order = null;
        List<Media> listItems = new ArrayList<>();

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
//        order.addMedia(listItems);

        MyDate dateOrder = new MyDate("second", "September", "twenty twenty");
        
        Scanner input = new Scanner(System.in);
        int choose;
     
        do {
            showMenu();
            System.out.print("Enter the choose : ");
            choose = input.nextInt();
            
            switch(choose) {
                case 1 : {
                    order = createOrder(dateOrder);
                    break;
                }
                case 2 : {
                    if (order == null) {
                        System.out.println("The order has not been created");
                    } else {
                        order.addMedia(listItems);
                    }
                    break;
                }
                case 3 : {
                    if (order == null) {
                        System.out.println("The order has not been created");
                    } else {
                        input.nextLine();
                        System.out.print("Enter the title of the item want to delete : ");
                        String title = input.nextLine();
                        order.removeItemByTitle(title);
                    }
                    break;
                }
                case 4 : {
                    if (order == null) {
                        System.out.println("The order has not been created");
                    } else {
                        order.printOrdered();
//                        order.printOrderedWithLuckyItem();
                    }
                    break;
                }
                case 0 : {
                    break;
                }
                default : {
                    System.out.println("Please choose again!");
                    break;
                }
            }
        } while(choose != 0);
    }
}
