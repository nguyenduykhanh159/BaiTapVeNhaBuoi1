/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hust.soict.hedspi.aims.media;

/**
 *
 * @author DuyKhanh
 */
public class DigitalVideoDisc extends Disc implements Playable{
    public DigitalVideoDisc() {

    }

    public DigitalVideoDisc(String title, String category, float cost, int length, String director) {
        super(title, category, cost, length, director);
    }

    @Override
    public String printInfor() {
        return "DigitalVideoDisc{" + "title=" + this.getTitle() + ", category=" + this.getCategory() + ", cost=" + this.getCost() + ", director=" + this.getDirector() + ", length=" + this.getLength() + '}';
    }
    
    @Override
    public void play() {
        System.out.println("Playing DVD : " + this.getTitle());
        System.out.println("DVD length : " + this.getLength());
    }
}
