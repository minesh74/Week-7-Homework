package homeworkWeek7;

import java.util.Scanner;

/*Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
                “ZERO”  */
public class Pos_Neg {
                 public static void main(String[] args) {
                     Scanner sc =new Scanner(System.in);
                    System.out.println("Enter any Number : ");
                    int num = sc.nextInt();
                    if (num>0){                                            //if else condition
                        System.out.println(num+" is POSITIVE Number");
                    }
                    else if (num<0) {
                        System.out.println(num+"  is NEGATIVE Number");
                    }
                    else if (num==0) {
                        System.out.println(num+"  is ZERO Number");
                    }
                 }
}
