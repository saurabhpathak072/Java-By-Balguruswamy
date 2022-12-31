class Super{
    public void method() {
        System.out.println("Method Super");
    }
}

class Sub extends Super{
    public void method() {
        System.out.println("Method sub");
    }
}
public class DynamicDispatch {
    public static void main(String[] args) {
        Super A = new Sub();    // sub's object reference assigned Super type reference variable
        A.method(); // Sub's version of method will be called at runtime
        
    }
}
