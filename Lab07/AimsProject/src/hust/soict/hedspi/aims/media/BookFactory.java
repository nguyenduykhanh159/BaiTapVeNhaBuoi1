/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hust.soict.hedspi.aims.media;

import java.util.Scanner;

/**
 *
 * @author DuyKhanh
 */
public class BookFactory implements AbstractItemFactory{
    @Override
    public Media createMediaItemFromConsole() {
        Book book = new Book();
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter title : ");
        book.setTitle(input.nextLine());
        System.out.print("Enter category : ");
        book.setCategory(input.nextLine());
        System.out.print("Enter cost : ");
        book.setCost(input.nextFloat());
        System.out.print("Enter count of author : ");
        int count = input.nextInt();
        for (int i = 0; i < count; i++) {
            input.nextLine();
            System.out.print("Enter author " + (i + 1) + " : ");
            book.addAuthor(input.nextLine());
        }
        
        return book;
    }
}
