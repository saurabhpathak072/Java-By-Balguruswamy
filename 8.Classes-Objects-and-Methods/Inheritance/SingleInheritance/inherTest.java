class Room{
    int length, breadth;
    Room(int x, int y){
        length=x;
        breadth=y;
    }
    int area(){
        return (length * breadth);
    }
}

class Bedroom extends Room{         // Inheriting Room
    int height;
    Bedroom(int x, int y, int z){
        super(x, y);                // pass Values to SuperClass
        height =z;
    }
    int volume(){
        return (length * breadth * height);
    }
}
public class inherTest {
    public static void main(String[] args) {
        Bedroom room1 = new Bedroom(14,12,10);
        int area1 = room1.area();   // SuperClass Method
        int volume1 = room1.volume(); // BaseClass Method
        System.out.println("Area1 = "+area1);
        System.out.println("Volume = "+volume1);
    }
}
