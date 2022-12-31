package homeworkWeek7;

import java.util.Scanner;

// Write a Java program to sum values of an array.
public class Sum_Array {
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int s= sc.nextInt();
        int array[] = new int[s];
        int sum=0;
        System.out.println("Enter the elements of the array :");
        for (int i=0; i<s; i++) {                                    //for condition
            array[i]= sc.nextInt();
        }
        for (int i=0; i< array.length; i++) {
            sum=sum+array[i];
        }
        System.out.println("sum =" +sum);
    }
}