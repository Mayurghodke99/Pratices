class Demo extends Thread
{
    public void run()
    {
        
            int i=0;
            String name = Thread.currentThread().getName();
            for(i=0; i<=10; i++)
            {
                System.out.println("Running thread :"+name+" with value : "+i);
                Thread.sleep(1000);
            }
        
        
        
    }
}

public class Multi7
{
    public static void main(String args[]) 
    {
       System.out.println("Current thread is :"+Thread.currentThread().getName() ); 
       Demo obj1 = new Demo();
       Demo obj2 = new Demo();
       
       obj1.setName("PPA");
       obj2.setName("LB");

       System.out.println("Priority of obj1 is :"+obj1.getPriority());
       System.out.println("Priority of obj2 is :"+obj2.getPriority());

       obj1.setPriority(10);
       obj2.setPriority(10);

       obj1.start();
       obj2.start();
    }   
}
