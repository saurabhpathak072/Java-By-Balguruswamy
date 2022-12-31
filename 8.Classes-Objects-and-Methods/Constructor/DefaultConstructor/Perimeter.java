
class Perimeter {
    int length, breadth;

    // default Constructor
    Perimeter( ){
        length = 0;
        breadth = 0;
    }

    // Parameterized Constructor
    Perimeter(int x, int y){
        length=x;
        breadth = y;
    }

    void cal_perimeter(){
        int peri;

        peri = 2 * (length + breadth);
        System.out.println("The Perimeter of the rectangle is : "+ peri);
    }
}

/**
 * Ex_default_c
 */
class Ex_default_c {

    public static void main(String[] args) {
        Perimeter p1 = new Perimeter();     // Calling default Constructor
        Perimeter p2 = new Perimeter(5, 10); // Calling Parameterized Constructor
        p1.cal_perimeter();
        p2.cal_perimeter();
    }
}
