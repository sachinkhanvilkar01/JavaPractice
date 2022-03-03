package FlowControlStatements.SelectionStatements;

import java.util.Scanner;

public class ElseIf_02 {

    public static void main (String []args){

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter username");
        String userName = s1.next();
        System.out.println("Enter password");
        String passWord = s1.next();

        if(userName.equals("Sachin")&& passWord.equals("Sneha"))
        {
            System.out.println("Login success!!!!");
            System.out.println(userName+" ---- "+ passWord);
        }else
        {
            System.out.println("Login fail!!!!");
            System.out.println(userName +" ---- "+ passWord );
        }

    }
}
