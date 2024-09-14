import Marvellous.Arithematic;
import Infosystems.Mathematics;

class PPA
{
    public static void man(String Arg[])
    {
        Arithematic aobj = new Arithematic();
        Arithematic mobj = new Mathematics();

        System.out.println(aobj.Addition(11,10));
        System.out.println(aobj.Substraction(11,10));

        System.out.println(mobj.Multiplication(11,21));
        System.out.println(mobj.Division(11,21));

    }
}