package ngaycuathang;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DayInMonth d = new DayInMonth();
        int year;
        String monthString;

        int result;
        do {
            System.out.print("Nhap nam : ");
            year = input.nextInt();
            input.nextLine();
            System.out.print("Nhap thang : ");
            monthString = input.nextLine();
            d.setYear(year);
            d.setMonthString(monthString);
            result = d.dayInMonth(d.getYear(), d.getMonthString());
        } while(result == 0);
        System.out.println("Thang " + monthString + " co " + result + " ngay");
    }
}
