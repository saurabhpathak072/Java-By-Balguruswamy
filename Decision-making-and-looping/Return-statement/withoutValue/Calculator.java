

public class Calculator {
    public static void main(String args[]) {
        int m=7,n=5;
        displaySum(m,n);    // call function that return nothing
    }
    // function displaySum signature indicates it is void function;
    // means it returns nothing to the caller.

    public static void displaySum(int x, int y){
   
        int sum = x+y;
        if(sum>=0){
            System.out.println("Addition is " + sum);
            return;     // return to the caller without any value.
        }
        System.out.println("This statement will be executed only when sum is negative");
    }
}
