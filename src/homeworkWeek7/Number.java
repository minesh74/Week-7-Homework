package homeworkWeek7;

import java.util.Scanner;

/*  Write a java program that tells us that Input number is odd or even?
                      HINT: use ternary operator (? :)   */
public class Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number :");
        int n = sc.nextInt();
        String s = (n % 2 == 0) ? "Even" : "Odd";      //Ternary oprator usedfudu
        System.out.println("Input number is :" + s);
    }
}