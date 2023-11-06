package org.example;
import java.util.Scanner;
public class Spielbrett2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] [] brett = new int[10][10];
int n = 0;
int y = 0;
        System.out.println("1");
        int start = sc.nextInt();

        if (start == 1) {
            while (true) {
                System.out.println("aaaaaaaaaaaaaaaaaaaaa");
               String o = sc.nextLine();
                if (o.equalsIgnoreCase("w")) {
                    int b =    w1(brett, n, y);
                } else if (o.equalsIgnoreCase("s")){
                   int b = s1(brett,n,y);
                } else if (o.equalsIgnoreCase("d")){
                    int b = d1(brett,n, y);
                }  if (o.equalsIgnoreCase("a")){
                    int b =  a1(brett, n, y);
                } else {
                    System.out.println("invalid");
                }
            }
        }
    }


        public static int w1(int[] [] brett,int n, int y) {
n++;
return n;
        }

        public static int s1(int[] [] brett,int n, int y) {
            n--;
            return n;
        }

        public static int d1(int[] [] brett,int n, int y) {
y++;
return y;
        }

        public static int a1(int[] [] brett,int n, int y) {
y--;
return y;
        }}

