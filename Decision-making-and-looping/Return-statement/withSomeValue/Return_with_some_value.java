
public class Return_with_some_value {
    public static void main(String args[]) {
        int m = 5, n = 10;
        int sum = calSum(m, n);     /* function call that return integer value 
                                    that is assigned to varible sum */
        System.out.println("Addition is " + sum);
    }

    public static int calSum(int x, int y) { // function signature indicates it returns integer
        return x + y;   /*  mandatory for this function to provide 
                            return statement with integer value */
    }
}
