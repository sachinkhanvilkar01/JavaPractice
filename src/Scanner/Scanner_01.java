package Scanner;

import java.util.Scanner;

public class Scanner_01 {

    public static void main (String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Emp Id: ");
        int empId = s.nextInt();

        System.out.println("Enter Emp Name: ");
        String empName = s.next();

        System.out.println("Enter Emp Salary: ");
        double empSal = s.nextDouble();

        if(empSal>10000)
        {
            System.out.println("Good employee!!!!");
            System.out.println(empId+"...."+empName+"...."+empSal);
        }else
        {
            System.out.println("Very good employee!!");
            System.out.println(empId+" #### "+empName+" #### "+empSal);
        }
        s.close();

    }
}
