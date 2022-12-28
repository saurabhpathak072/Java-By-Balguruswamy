import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StringDivision {
    public static void main(String[] args) {
        String choice = new String();
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Choose your Division: ");
        System.out.println("Honors");
        System.out.println("First");
        System.out.println("Second");
        System.out.println("Third");
        System.out.println("Fails");
        System.out.println("Enter your choice - - - >");
        try {
            choice = br.readLine();
            System.out.flush();
            switch (choice) {
                case "Honors":
                    System.out.println("Marks >= 80%");
                    break;
                case "First" :
                    System.out.println("Marks >= 65% and < 80%");
                    break;
                case "Second" :
                    System.out.println("Marks >= 55% and < 65%");
                    break;
                case "third" :
                    System.out.println("Marks >= 40% and < 55%");
                    break;
                case "Fails" :
                    System.out.println("Marks < 40%");
                    break;
                default:
                    break;
            }
        } catch (Exception e) {
            System.out.println("I/O Error");
        }
    }
}
