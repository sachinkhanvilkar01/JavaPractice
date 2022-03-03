package FlowControlStatements.LoopingStatements;
//If you know number iteration then use for loop
public class For_ForEachLoop {
    public static void main(String[]args) {
        int[] a = {10, 20, 30, 40};
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);

        System.out.println("##########################");

        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }


        System.out.println("##########################");
        for(int x :a)
        {
            System.out.println(x);
        }
    }
}
