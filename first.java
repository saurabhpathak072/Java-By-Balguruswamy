class IncrementData
{
    short s = 3;
}

class SampleOne
{   
    public static void main(String args[])
    {
        IncrementData inc = new IncrementData();

        short a = inc.s;
        short b= a++; 
        short c = ++a;
        

        System.out.println("Java is better than c++");
        System.out.println("a "+ a );
        System.out.println("b "+ b );
        System.out.println("c "+ c );
    }
}