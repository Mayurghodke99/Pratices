import java.util.Scanner;

class Exception1
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter thr first number : ");
        int No1 = sobj.nextInt();

        System.out.println("Enter thr second number : ");
        int No2 = sobj.nextInt();

        float Ans= No1/No2;

        System.out.println("Division is :"+Ans);
    }
}