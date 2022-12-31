package homeworkWeek7;

import java.util.Scanner;
          /*Write a java program to input any two number and ask user to enter their symbol (+, -,
             /, *) find addition, Subtraction, multiplication and division according to their symbol
             (using if else)*/
public class NumSymbol {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number :");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number :");
        int num2 = sc.nextInt();
        System.out.println("Enter any Symbol from (+,-,*,/) :");
        String symbol=sc.next();

        if (symbol.equals("+")){
            System.out.println("Addition is :" +(num1+num2));
        } else if (symbol.equals("-")) {
            System.out.println("Suntraction is :" +(num1-num2));
        } else if (symbol.equals("*")) {
            System.out.println("Multiplication is :" +(num1*num2));
        } else if (symbol.equals("/")) {
            System.out.println("division is :" +(num1/num2));
        } else {
                System.out.println(("Invalid Symbol" ));
            }

    }
}
