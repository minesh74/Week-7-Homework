package homeworkWeek7;

import java.util.Scanner;

/*Write a java program input sales id, seller's name, sales amount, and salary basic and
              then fined this sales */
public class Commission {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int id;
        double amount, comm;
        String name;
        System.out.println("Enter Seller's Name    :");
        name = in.nextLine();
        System.out.println("Enter Seller's ID NO.  :");
        id = in.nextInt();
        System.out.println("Enter the Sales Amount :");
        amount = in.nextInt();
                                                              //Nested if else statment
        if (amount > 0 && amount < 10000)                     //if (condition)
            comm = amount * 2 / 100;                          //    if body
        else if (amount >= 10000 && amount < 200000)          //else if (condition)
            comm = amount * 5 / 100;                          //else body
        else if (amount >= 20000 && amount < 300000)
            comm = amount * 10 / 100;
        else if (amount >= 30000 && amount < 500000)
            comm = amount * 20 / 100;
        else                                                       //else
            comm = amount * 35 / 100;                              //else body
        System.out.println("Sales                 :" +amount);
        System.out.println("Commission            :" +comm);
    }

    }
