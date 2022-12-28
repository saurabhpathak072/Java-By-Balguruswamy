

public class CityGuids {
    public static void main(String args[]) {
        char choice;
        System.out.println("Select Your Choice");
        System.out.println("M -> Madras ");
        System.out.println("B -> Bobbay");
        System.out.println("C -> Calcutta");
        System.out.println("Choice - - ->");
        System.out.flush();     // Clear the output stream after writing the left-over bytes (if any).
        try {
            switch (choice = (char) System.in.read()) {
                case 'M':
                case 'm': System.out.println("Madras : Booklet 5 ");
                        break;
                    
                case 'B':
                case 'b': System.out.println("Bombay : Booklet 9 ");
                        break;

                case 'c':
                case 'C':System.out.println("Calcutta : Booklet 15");
                        break;
            
                default: System.out.println(" Invalid Choice (IC) ");
                    break;
            }
        } catch (Exception e) {
            System.out.println(" I/O Error");
        }
    }
}
