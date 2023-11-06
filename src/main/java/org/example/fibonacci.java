package org.example;
import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Wie viele zahlen");
        int durchgaenge = sc.nextInt();
        fibonacc(durchgaenge);
    }
    public static int fibonacc(int durchgaenge){
        int b = 0;
        int a = 1;
int c = 0;
        for (int i = 0; i < durchgaenge; i++){
            c = b + a;
            System.out.println(c);
            b=a;
            a=c;
        }
        return c;
    }
}
