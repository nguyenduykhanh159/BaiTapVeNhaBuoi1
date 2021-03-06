package com.hust.phuongtrinhbachai;

public class SecondDegreeEquation {
    private int a;
    private int b;
    private int c;

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

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public String resolve() {
        int delta = this.getB() * this.getB() - 4 * this.getA() * this.getC();
//        System.out.println(Math.sqrt(delta));

        if (delta == 0) {
            return ("Phuong trinh co nghiem duy nhat x = " + -(double)this.getB()/(2 * this.getA()));
        }
        else if (delta > 0) {
            return ("Phuong trinh co 2 nghiem phan biet x1 = " + (-(double)b + Math.sqrt(delta))/(2 * a)
                    + " va x2 = " + (-(double)b - Math.sqrt(delta))/(2 * a));
        }
        return ("Phuong trinh vo nghiem");
    }
}
