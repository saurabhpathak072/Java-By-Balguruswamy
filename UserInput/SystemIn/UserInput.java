import java.util.Scanner;

public class UserInput {
    public static void main(String args[]) {
        try (Scanner obj = new Scanner(System.in)) {
            System.out.println("Please Enter your Name : ");
            String name = obj.nextLine();
            System.out.println("Please Enter your age : ");
            int age = obj.nextInt();
            System.out.println("Please Enter your salary : ");
            float salary = obj.nextFloat();
            System.out.println("Name : " + name);
            System.out.println("Age : " + age);
            System.out.println("Salary : " + salary);
        }catch( Exception e){
            System.out.println("I/O Error " );
        }
       
    }
}
