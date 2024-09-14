class Base
{
    public int A,B;
    
    public void Fun()
    {
        System.out.println("INside Base Fun");
    }
    public void Gun()
    {
        System.out.println("INside Base Gun");
    }
    public void Sun()
    {
        System.out.println("INside Base Sun");
    }
    public void Run()
    {
        System.out.println("INside Base Run");
    }
}

class Derived extends Base    
{
    public int X,Y;
   
    public void Gun()
    {
        System.out.println("Inside Derived gun");
    }
    public void Run()
    {
        System.out.println("INside Base Run");
    }
    public void Mun()
    {
        System.out.println("INside Base Mun");
    }
}
class RMD
{
    public static void main(String A[]) 
    {
       Base bobj = new Derived();  //Upcasting Allowed
       
       bobj.Fun();
       bobj.Gun();
       bobj.Sun();
       bobj.Run();
       bobj.Mun();  
    }
}
