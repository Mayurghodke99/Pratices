import java.util.ArrayList;

public class ArrayDemo2 {
   public ArrayDemo2() {
   }

   public static void main(String[] var0) {
      ArrayList<Integer> may = new ArrayList<Integer>();

      may.add(20);
      may.add(30);
      may.add(40);

     
  
      System.out.println(may.indexOf(40));
      may.remove(50);
   }
}
