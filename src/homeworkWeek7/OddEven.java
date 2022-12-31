package homeworkWeek7;

import java.util.Scanner;

//Write a java program to input any number and find out if it’s odd or even
public class OddEven {
    public static void main(String [] args ){
        System.out.println("Enter any Number : ");               //print statement
        Scanner sc =new Scanner(System.in);                      //for taking user input value
        int i= sc.nextInt();                                     //storing input value

        if (i%2 == 0)                                            //for even number divide by 2
            System.out.println(" Input number is Even Number");
        else
            System.out.println(" Input number is Odd Number");
    }
}
