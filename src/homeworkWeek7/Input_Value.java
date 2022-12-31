package homeworkWeek7;

import java.util.Scanner;

//Write a program that tells us input value is number or an alphabet or symbol.
public class Input_Value {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char c;
        System.out.println("Enter any Character:");
        c=sc.next().charAt(0);
        if (c>='a' && c<='z') {                                            // //Nested if else statment
            System.out.println("Entered character is samll alphabet");
        } else if (c>='A' && c<='Z') {
            System.out.println("Entered character is Capital alphabet");
        }
          else if (c>='0' && c<='9') {
            System.out.println("Entered character is Number ");
        } else {
            System.out.println("Entered character is Symbol ");
        }

    }
}
