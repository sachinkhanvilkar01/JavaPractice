package JavaOperators;

public class UnariOperators {

    public static void main(String [] args){
        int a=10;
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(a--);
        System.out.println(--a);
        System.out.println(a);

        int b = 10;
        System.out.println(b++ + ++b); //22 a=12
        System.out.println(b++ - ++b); // 12 - 14 = -2

        System.out.println(b-- + --b);// 14 + 12 = 26

    }
}
