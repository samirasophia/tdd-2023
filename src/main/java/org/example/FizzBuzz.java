package org.example;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println();
    }

    public static String fizzBuzz(int x) {
        String y;
        if (x % 3 == 0 && x % 5 == 0) {
            y = "Fizzbuzz";
            System.out.println("FizzBuzz!");
return y;
        }
        if (x % 3 == 0) {
            System.out.println("Fizz");
            y = "Fizz";
            return y;
        }
        if (x % 5 == 0) {
            System.out.println("Buzz");
            y = "Buzz";
            return y;
        } else {
            return String.valueOf(x);
        }

    }
}



