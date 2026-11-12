package lab2;

public class Main {

    // returns the sum of two numbers
    public static int add(int a, int b) {
        return a + b;
    }

    // checks whether a number is even
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println("SC&D Lab 02 - Introduction to GitHub");
        System.out.println("Name: Abdul Kareem (2024F-BSE-247)");
        System.out.println("Sum of 10 and 20 = " + add(10, 20));
        System.out.println("Is 7 even? " + isEven(7));
    }
}
