package homeworkWeek7;

import java.util.Arrays;

//Write a Java program to sort a numeric array and a string array.
public class Sort_Array {
    public static void main(String [] args){
        int [] n_array1 ={101,209,150,300,890,700,
                          570,480,230,180,430,190,
                          275,450,350,160};

        String [] s_array2 ={"minesh",
                              "patel",
                              "java",
                              "language",
                               "hello",
                               "world"};
        System.out.println("Original numeric array :" + Arrays.toString(n_array1));
        Arrays.sort(n_array1);
        System.out.println("Sorted numeric array :" + Arrays.toString(n_array1));

        System.out.println("Original string array :" + Arrays.toString(s_array2));
        Arrays.sort(s_array2);
        System.out.println("Sorted string array :" + Arrays.toString(s_array2));
    }


}
