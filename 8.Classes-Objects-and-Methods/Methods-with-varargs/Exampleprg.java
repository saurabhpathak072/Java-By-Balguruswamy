
 class Exampleprg {
    Exampleprg(String ... person){
        for (String name : person) {
            System.out.println("Hello " + name );
        }
    }
    public static void main(String[] args) {
         new Exampleprg("John","David","Suhel"); 
    }
}
