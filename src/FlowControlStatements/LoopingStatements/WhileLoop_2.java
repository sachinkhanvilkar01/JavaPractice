package FlowControlStatements.LoopingStatements;

import java.util.Scanner;

public class WhileLoop_2 {
    public static void main(String[]args){
        int guess = 25;
        Scanner s1 = new Scanner(System.in);


        while(true)
        {
            System.out.println("Enter guess value.....");
            int userGuess = s1.nextInt();

            if (guess==userGuess)
            {
                System.out.println("Your guess is correct Congratulation.....");
                break;
            }else if (userGuess>guess)
            {
                System.out.println("Your guess value is more than guess.... try again");
            }else
            {
                System.out.println("Your guess value is less than guess.... try again");
            }
        }

    }
}
