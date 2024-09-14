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
class DerivedX extends Derived
{
    public int P,Q;
    public DerivedX()
    {
        System.out.println("DerivedX constructor");
    }
    public void Sun()
    {
        System.out.println("Inside DerivedX Sun");
    }
}
public class Multilevel
{
    public static void main(String A[]) 
    {
        DerivedX dobj = new DerivedX();
        dobj.Fun();
        dobj.Gun();
        dobj.Sun();
    }
}



