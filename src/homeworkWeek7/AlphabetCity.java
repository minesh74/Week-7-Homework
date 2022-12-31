package homeworkWeek7;
        /*Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
          any other alphabet should be invalid entry */
import java.util.Scanner;

public class AlphabetCity {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char a;
        System.out.print("Enter any Alphabet from A to F :");
        a=sc.next().charAt(0);

        if (a=='A') {
            System.out.println("City name is : Abu Dhabi");
        } else if(a == 'B') {
            System.out.println("City name is : BOMBAY");
        } else if (a == 'C') {
            System.out.println("City name is : Chennai");
        } else if (a == 'D') {
            System.out.println("City name is : Dubai");
        } else if (a == 'E') {
            System.out.println("City name is : Edmonton");
        } else if (a == 'F') {
            System.out.println("City name is : Florida");
        } else {
            System.out.println("Invalid entry");
        }
    }
}