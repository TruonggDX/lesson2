package demo2;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String inPut=sc.nextLine();
        System.out.print("Chuoi sau khi viet in : ");
        inPut=inPut.toUpperCase();
        System.out.println(inPut);
    }
}
