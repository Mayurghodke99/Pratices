public class ArrayPro {
   public ArrayPro() {
   }

   public static void main(String[] var0) {
      int[] var1 = new int[]{10, 20, 30, 40, 50};
      System.out.println("Number of elements in array are : " + var1.length);
      System.out.println(var1[0]);
      System.out.println(var1[1]);
      System.out.println(var1[2]);
      System.out.println(var1[3]);
      System.out.println(var1[4]);

      System.out.println(var1.indexOf(30));
   }
}