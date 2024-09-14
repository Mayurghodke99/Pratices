class Demo{
    public int No1;
    public final int No2=21;

    public Demo()
    {
        No1 =11;
    }
}
class Final1
{
    public static void main(String Arg[])
    {
        Demo obj = new Demo();

        obj.No1++;
        obj.No2++;
    }
}