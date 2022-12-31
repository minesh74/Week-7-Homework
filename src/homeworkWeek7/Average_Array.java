package homeworkWeek7;

import java.util.Scanner;
              //  Write a Java program to calculate the average value of array elements.
public class Average_Array {
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int s= sc.nextInt();
        int array[] = new int[s];
        int sum=0;
        double av =0;
        System.out.println("Enter the elements of the array :");
        for (int i=0; i<s; i++) {                                     //for (condition){
            array[i]= sc.nextInt();                                   //           body
        }                                                             //         }
        for (int i=0; i< array.length; i++) {
            sum=sum+array[i];
        }
        av =sum/array.length;
        System.out.println("The average value of array element :" +av);

    }

}
