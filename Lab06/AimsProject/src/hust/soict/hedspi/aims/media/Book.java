/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DuyKhanh
 */
public class Book extends Media{
    private List<String> authors = new ArrayList<String>();

    public Book() {
        
    }

    public Book(String title, String category, float cost) {
        super(title, category, cost);
        this.authors = authors;
    }

    public Book(String title) {
        super(title);
    }

    public Book(String title, String category) {
        super(title, category);
    }

    public Book(String title, String category, List<String> authors) {
        super(title, category);
        this.authors = authors;
    }
    
    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }
    
    public int addAuthor(String authorName) {
        if (authors.isEmpty() || authors.contains(authorName) == false) {
            authors.add(authorName);
//            System.out.println("The author has been added");
            return 1;
        }
//        System.out.println("The author already existed");
        return 0;
    }
    
    public int removeAuthor(String authorName) {
        if (authors.contains(authorName) == false) {
            System.out.println("Remove unsuccessfully");
            return 0;
        }
        authors.remove(authorName);
        System.out.println("Remove successfully");
        return 1;
    }
    
    @Override
    public String printInfor() {
        return "Book{" + "title=" + this.getTitle() + ", category=" + this.getCategory() + ", cost=" + this.getCost() + ", authors=" + authors + '}';
    }
}
