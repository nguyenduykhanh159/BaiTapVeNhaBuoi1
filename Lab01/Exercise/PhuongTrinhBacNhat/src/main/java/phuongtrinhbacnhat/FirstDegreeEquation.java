/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phuongtrinhbacnhat;
/**
 *
 * @author Admin
 */
public class FirstDegreeEquation {
    private int a;
    private int b;
    
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    
    public String resolve() {
        if (this.getA() == 0 && this.getB() == 0) {
            return ("Phuong trinh co vo so nghiem");
        }
        else if (this.getA() != 0) {
            return ("Phuong trinh co nghiem duy nhat x = " + -(double)this.getB()/this.getA());
        }
        return ("Phuong trinh vo nghiem");
    }
}
