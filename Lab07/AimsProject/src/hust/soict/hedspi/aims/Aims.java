    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hust.soict.hedspi.aims;

import hust.soict.hedspi.aims.media.AbstractItemFactory;
import hust.soict.hedspi.aims.media.BookFactory;
import hust.soict.hedspi.aims.media.CDFactory;
import hust.soict.hedspi.aims.media.DVDFactory;
import hust.soict.hedspi.aims.media.Media;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DuyKhanh
 */
public class Aims {
    public static List<Media> listOfProducts = new ArrayList<Media>();
        
    public static Media createItemFromConsole(AbstractItemFactory factory) {
        return factory.createMediaItemFromConsole();
    }
    
    public static void showAdminMenu() {
        int choose;
        do {
            System.out.println("Product Management Application: ");
            System.out.println("--------------------------------");
            System.out.println("1. Create new item");
            System.out.println("2. Delete item by title");
            System.out.println("3. Display the items list");
            System.out.println("0. Exit");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2-3");
        
            Scanner input = new Scanner(System.in);
            System.out.print("Enter your choose : ");
            choose = input.nextInt();
            switch(choose) {
                case 1 : {
                    showCreationMenu();
                    break;
                }
            
                case 2 : {
                    if (listOfProducts.isEmpty()) {
                        System.out.println("LIST ITEMS IS EMPTY!");
                    } else {
                        input.nextLine();
                        int check = 0;
                        System.out.print("Enter the title of item : ");
                        String title = input.nextLine();
                        for (int i = 0; i < listOfProducts.size(); i++) {
                            if (listOfProducts.get(i).getTitle().equals(title) == true) {
                                listOfProducts.remove(listOfProducts.get(i));
                                System.out.println("DELETE ITEM SUCCESSFULLY!");
                                check = 1;
                            } else {
                                check = 0;
                            }
                        }
                        if (check == 0) {
                            System.out.println("ITEM NOT EXIST IN LIST!");
                        }
                    }
                    break;
                }
            
                case 3 : {
                    System.out.println("***********************Items***********************");
                    for (int i = 0; i < listOfProducts.size(); i++) {
                        System.out.println((i + 1) + ". " + listOfProducts.get(i).printInfor());
                    }
                    System.out.println("***************************************************");
                    break;
                }
               
                case 0 : {
                    break;
                }
            
                default : {
                    System.out.println("Please choose again!");
                }
            }
        } while (choose != 0);
    }
    
    public static void showCreationMenu() {
        int choose;
        do {
            System.out.println("Creation Item: ");
            System.out.println("--------------------------------");
            System.out.println("1. Create new DVD");
            System.out.println("2. Create new CD");
            System.out.println("3. Create new Book");
            System.out.println("0. Exit");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2-3");
        
            Scanner input = new Scanner(System.in);
            System.out.print("Enter your creation : ");
            choose = input.nextInt();
            switch(choose) {
                case 1 : {
                    System.out.println("CREATE NEW DVD");
                    Media dvd = createItemFromConsole(new DVDFactory());
                    listOfProducts.add(dvd);
                    System.out.println("CREATE DVD SUCCESSFULLY!");
                    break;
                }
            
                case 2 : {
                    System.out.println("CREATE NEW CD");
                    Media cd = createItemFromConsole(new CDFactory());
                    listOfProducts.add(cd);
                    System.out.println("CREATE CD SUCCESSFULLY!");
                    break;
                }
            
                case 3 : {
                    System.out.println("CREATE NEW BOOK");
                    Media book = createItemFromConsole(new BookFactory());
                    listOfProducts.add(book);
                    System.out.println("CREATE BOOK SUCCESSFULLY!");
                    break;
                }
            
                case 0 : {
                    break;
                }
            
                default : {
                    System.out.println("Please choose again!");
                }
            }
        } while (choose != 0);
    }
    
    public static void main(String[] args) {
        showAdminMenu();
    }
}
