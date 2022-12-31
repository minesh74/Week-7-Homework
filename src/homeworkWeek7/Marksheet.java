package homeworkWeek7;
        /*Write a java program to input student Name, roll No, and three subjects Math, Science and
        English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
        Input, Marks should between 0 to 100”) and find out total, percentage and result.
        If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
        %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format */
import java.util.Scanner;

public class Marksheet {
    public static void main(String[] args) {
        int math, science, english, roll, sum;                          //declare integer
        String name;                                                    //declare string

        Scanner in = new Scanner(System.in);                           //scanner used
        System.out.print(" Input Student Name     :            ");            //print statement
        name = in.nextLine();
        System.out.print(" Enter Roll Number      :     ");
        roll = in.nextInt();
        math = in.nextInt();

        if (math <= 100) {                                                       //if (condition)
            System.out.println(" Enter Math Marks :      " + math);              // body
        } else                                                                   //else
            System.out.println("Invalid Input, Marks should between 0 to 100");  //else body
        science = in.nextInt();
        if (science <= 100) {
            System.out.println(" Enter Science Marks :" + science);
        }else                                                                   //else
            System.out.println("Invalid Input, Marks should between 0 to 100");
        english = in.nextInt();
        if (english <= 100) {
            System.out.println(" Enter English Marks :" + english);
        } else
            System.out.println("Invalid Input, Marks should between 0 to 100");
        sum = math + science + english;
        if (sum <= 300) {
            System.out.println("Total Marks :" + sum);
        } else {
            System.out.println("Invalid Marks, Re enter Marks");
        }
        int total = 300;
        float per = sum * 100 / total;
        String result ="";
        String grade ="";
        if (per >= 80) {
            grade = "A+";
            result = "PASS";
        } else if (per >= 60) {
            grade = "A";
            result = "PASS";
        } else if (per >= 50) {
            grade = "B";
            result = "PASS";
        } else if (per >= 35) {
            grade = "C";
            result = "PASS";
        } else {
            grade = "FAIL";
            result = "FAIL";
        }


             System.out.println("|------------------------------|");
             System.out.println("|--------MARKSHEET-------------|");
             System.out.println("|------------------------------|");
             System.out.println("|  NAME            "+name+"    |");
             System.out.println("|  Roll No.        "+roll+"    |");
             System.out.println("|------------------------------|");
             System.out.println("|  Subject           Marks     |");
             System.out.println("|------------------------------|");
             System.out.println("|    Maths          "+math+"   |");
             System.out.println("|    Sceince        "+science+"|");
             System.out.println("|    English        "+english+"|");
             System.out.println("|------------------------------|");
             System.out.println("|    Total      :   "+sum+"    |");
             System.out.println("|------------------------------|");
             System.out.println("|    Percentage :   "+per+"    |");
             System.out.println("|    Result     :   "+result+" |");
             System.out.println("|    Grade      :   "+grade+"  |");
             System.out.println("|------------------------------|");
}
                     }
