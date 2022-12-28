import java.util.ArrayList;
import java.util.Collection;

public class EnhanceForLoop {
    public static void main(String args[]) {
        System.out.println();
        String states[] ={"TamilNadu","AndhraPradesh","UttarPradesh","Rajasthan"};
        for (int i = 0; i < states.length; i++) {
            System.out.println("Standard for-loop : state name : "+ states[i]);
        }
        System.out.println();
        for(String i : states){             // Enhanced for loop
            System.out.println("Enhanced for-loop : state name : " + i);
        }
        System.out.println();
        ArrayList<String> cities = new ArrayList<String>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("calcutta");
        cities.add("Chennai");
        System.out.println();
        for (int i = 0; i < cities.size(); i++) {
            System.out.println("Standard for-loop : city name : " + cities.get(i));
        }
        System.out.println();
        for (String city : cities) {        // Enhanced for loop
            System.out.println("Enhanced for-loop : city name : " + city);
        }
        System.out.println();
        System.out.println("In collection");
        System.out.println();
            printcollection(cities);
    }
    public static<AnyType> void printcollection(Collection<AnyType> c){
        for (AnyType val : c) {
            System.out.println(val);
        }
    }
}
