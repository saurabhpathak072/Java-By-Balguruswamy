
 class Room {
    float length;
    float breadth;
    Room(Float d, Float e){
        length=d;
        breadth=e;
    }
    Room(float x){
        length=breadth=x;
    }
    float area(){
        return (length * breadth);
    }
}

/**
 * RoomArea
 */
public class RoomArea {

    public static void main(String[] args) {
        Room room1 = new Room(25.0f, 15.0f);
        Room room2 = new Room(20.0F);
        System.out.println("Reactangle area : "+ room1.area());
        System.out.println("Square area : "+ room2.area());
        
    }
}
