

public class Nested_loop {
    public static void main(String args[]) {
        int p,q;
        System.out.println("The right angle triangle of @ is Shown below : ");
        for(p=0;p<10;p++){
            for(q=0;q<=p;q++){
                System.out.print("@");
            }
            System.out.println("  ");
        }
    }
}
