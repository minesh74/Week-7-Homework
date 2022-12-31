package homeworkWeek7;
          /*Write a java program to print the numbers between 1 to 100 which can be divided by 3
            and 5 separately. */
public class DividebyNum {
    public static void main(String [] args){                         //main method
        System.out.println("Number divided by 3:");
        for (int i=1; i<=100; i++)                     //for loop
        {
          if (i%3 == 0)
              System.out.print(i+",");
        }
        System.out.println();
        System.out.println("Number divided by 5:");
        for (int i=1; i<=100; i++) {                          //for loop
            if (i % 5 == 0)
                System.out.print(i + ",");
        }
    }


}
