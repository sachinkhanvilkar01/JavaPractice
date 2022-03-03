package JavaOperators;

public class Operators23 {

    public static void main (String[]args){

        System.out.println(!true);
        System.out.println(!false);

        if(10>20){
            System.out.println("Sachin");
        }else{
            System.out.println("Sneha");
        }

        String res = 10>20?"Sachin":"Sneha";
        System.out.println(res);

        int y = 10<20? 100:200;
        System.out.println(y);
    }
}
