/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hephuongtrinhbacnhat;

/**
 *
 * @author Admin
 */
public class SysFirstDegreeEquation {
    private int a11;
    private int a12;
    private int a21;
    private int a22;
    private int b1;
    private int b2;

    public int getA11() {
        return a11;
    }

    public void setA11(int a11) {
        this.a11 = a11;
    }

    public int getA12() {
        return a12;
    }

    public void setA12(int a12) {
        this.a12 = a12;
    }

    public int getA21() {
        return a21;
    }

    public void setA21(int a21) {
        this.a21 = a21;
    }

    public int getA22() {
        return a22;
    }

    public void setA22(int a22) {
        this.a22 = a22;
    }

    public int getB1() {
        return b1;
    }

    public void setB1(int b1) {
        this.b1 = b1;
    }

    public int getB2() {
        return b2;
    }

    public void setB2(int b2) {
        this.b2 = b2;
    }
    
    public String resolve() {
        int d = this.getA11() * this.getA22() - this.getA21() * this.getA12();
        int d1 = this.getB1() * this.getA22() - this.getB2() * this.getA12();
        int d2 = this.getA11() * this.getB2() - this.getA21() * this.getB1();
        
        if (d != 0) {
            return ("He phuong trinh co nghiem (x1, x2) = " + "(" + (double)d1/d + ", " + (double)d2/d + ")");
        } 
        else if (d == 0 && d1 == 0 && d2 == 0) {
            return ("He phuong trinh co vo so nghiem");
        }
        return ("He phuong trinh vo nghiem");
    }
}
