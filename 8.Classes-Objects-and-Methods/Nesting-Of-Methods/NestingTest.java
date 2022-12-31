/**
 * Nesting
 */
class Nesting {
    int m,n;
    Nesting(int x, int y){
        m=x;n=y;
    }
    int largest(){
        if(m>= n){
            return (m);
        }
        else
            return (n);
    }
    void display(){
        int large = largest();      // Calling a method
        System.out.println("Largest Value : "+ large);
    }
    
}
public class NestingTest {
    public static void main(String[] args) {
        Nesting nesting = new Nesting(50,40);
        nesting.display();
    }
}
