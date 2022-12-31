package homeworkWeek7;
         /*WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
        salary*/
import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int basic,id;
        double hra, da, pf,gs, ta;
        String name;
        System.out.println ("Enter the name of the Employee :");
       name = in.nextLine();
        System.out.println ("Enter the  Employee ID NO. :");
        id = in.nextInt();
       System.out.println("Enter the Basic salary :");
       basic = in.nextInt();
       da=basic*8/100;
       hra =basic*10/100;
       ta =basic*9/100;
       pf = basic*20/100;
       gs =basic+da+hra+ta-pf;
               System.out.println("|------------------------------|");
               System.out.println("|       Salary Slip            |");
               System.out.println("|------------------------------|");
               System.out.println("|Employee's ID   :    "+id+   "|");
               System.out.println("|Employee's Name :    "+name+ "|");
               System.out.println("|------------------------------|");
               System.out.println("|Basic Salary    :    "+basic+"|");
               System.out.println("|HRA 10%         :    "+hra+  "|");
               System.out.println("|TA 8%           :    "+ta+   "|");
               System.out.println("|DA 9%           :    "+da+   "|");
               System.out.println("|PF-20&          :    "+pf+   "|");
               System.out.println("|------------------------------|");
               System.out.println("|Gross Salary    :    "+gs+   "|");
               System.out.println("|------------------------------|");
    }
}