class Base
{
    public int A,B;
    public Base()
    {
        System.out.println("Base constructor");
    }
    public void Fun()
    {
        System.out.println("INside Base fun");
    }
}

class Derived extends Base    // class Derived : public Base
{
    public int X,Y;
    public Derived()
    {
        System.out.println("Deived constructor");
    }
    public void Gun()
    {
        System.out.println("Inside Derived gun");
    }
}
class SingleX
{
    public static void main(String A[]) 
    {
        Base bobj1 = new Base();
        Derived dobj1 = new Derived();
        Base bobj2 = new Derived();
        Derived dobj2 = new Base();
    }
}
