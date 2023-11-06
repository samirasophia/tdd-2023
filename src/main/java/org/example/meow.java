package org.example;
import java.util.Scanner;
public class meow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] brett = new int[10][10];
        int n = 5;
        int y = 5;
        System.out.println("meow");
        String richtung = sc.nextLine();

        switch (richtung) {
            case "w":
                int b = w(brett, n);
                n += b;
                break;
            case "s":
                int a = s(brett, n);
                n += a;
                break;
            case "a":
                int c = a(brett, y);
                y += c;
                break;
            case "d":
                int e = d(brett, y);
                y += e;

                break;
            case "start":
                int k = start1(n, y);
                n = k;
                y = k;
        }
        System.out.println("senkrecht: " + n + " horizontal: " + y);
    }
    public static int w(int [][]brett,  int n){
        n++;
        return n;
    }
    public static int s (int [][]brett,  int n) {
        n--;
        return n;
    }
    public static int a (int [][]brett, int y) {
        y++;
        return y;
    }
    public static int d (int [][]brett,  int y) {
        y--;
        return y;
    }
    public static int start1 ( int n, int y) {
    n = 0;
    y = 0;
       return n;
    }
}
