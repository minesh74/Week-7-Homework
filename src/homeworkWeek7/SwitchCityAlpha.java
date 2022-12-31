package homeworkWeek7;
       /*Input any alphabet from “A" to “F” and print their city name accordingly if
        any other alphabet should be invalid entry using switch statement. */
import java.util.Scanner;

public class SwitchCityAlpha {
    public static void main(String[] args) {
        String a;
        System.out.print("Enter any Alphabet from A to F :");
        Scanner sc = new Scanner(System.in);
        a = sc.next();

        //switch statement
        switch (a){                                                  //switch(expression)
            case "A":
                System.out.println("City name is : Abu Dhabi ");
                break;
            case "B":
                System.out.println("City name is : BOMBAY");
                break;
            case "C":
                System.out.println("City name is : Chennai");
                break;
            case "D" :
                System.out.println("City name is : Dubai");
                break;
            case "E" :
                System.out.println("City name is : Edmonton");
                break;
            case "F" :
                System.out.println("City name is : Florida");
                break;
            default:
                System.out.println("Invalid Entry");
        }
    }
}
