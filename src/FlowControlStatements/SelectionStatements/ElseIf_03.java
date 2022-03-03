package FlowControlStatements.SelectionStatements;

import java.util.Scanner;

public class ElseIf_03 {

    public static void main(String[]args){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Please enter day and know % discount applicable");
        String day = s1.next();

        if(day.equals("Monday")||day.equals("Tuesday")||day.equals("Wednesday"))
        {
            System.out.println("Discount is 10%");
        }else if (day.equals("Thursday")|| day.equals("Friday"))
        {
            System.out.println("Discount is 5%");
        }else if (day.equals("Saturday")||day.equals("Sunday"))
        {
            System.out.println("Discount is 2%");
        }else
        {
            System.out.println("Please enter correct day");
        }

    }
}
