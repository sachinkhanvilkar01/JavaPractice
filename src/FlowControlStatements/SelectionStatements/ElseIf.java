package FlowControlStatements.SelectionStatements;

import java.util.Scanner;

public class ElseIf {
    /*
    else if to take multiple options

    syntax
    if(condition)
    {
    }else if (condition)
    {
    }else if (condition)
    {
    }else
    {
    }
    */

    public static void main (String[]args){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = s1.nextInt();

        if (num==0)
        {   System.out.println("Zeroooooooo");
        }else if (num < 0)
        {   System.out.println("Nagative");
        }else
        {   System.out.println("Positive");
        }

    }
}
