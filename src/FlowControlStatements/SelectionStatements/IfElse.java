package FlowControlStatements.SelectionStatements;

public class IfElse {

    /*
    if you to print false and true body then use if else
     */
  /* syntax
    if(condition)
    {   true body
    }
    else
    {   false body
    }

    if else to take two options
  */
    public static void main (String[]args){
        int age = 21;
        if (age>22)
        {   System.out.println("Eligible for marriage");
        }else
        {   System.out.println("Not Eligible for marriage try after sometime");
        }

        if (true)
        {   System.out.println("Eligible for marriage");
            System.out.println("Eligible for marriage");
            System.out.println("Eligible for marriage");
            System.out.println("Eligible for marriage");
        }else
        {   System.out.println("Not Eligible for marriage try after sometime");
        }
    }
}
