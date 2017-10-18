public class ArrayIntListClient {
   public static void main(String[] args) {
      // constructing lists
      ArrayIntList list1 = new ArrayIntList();
      ArrayIntList list2 = new ArrayIntList();
      
      
      // this is god awful -- we'd rather have an add method to simplify this process for the client
      /*
      list1.elementData[0] = 1;
      list1.elementData[1] = 82;
      list1.elementData[2] = 97;
      list1.size = 3;
      */
      
      // add 1, 82, 97 to list1
      list1.add(1);
      list1.add(82);
      list1.add(97);
      
      // add 7, -8 to list2
      list2.add(7);
      list2.add(-8);
      
      System.out.println(list1);
      System.out.println(list2);
      
      
      System.out.println("That's all folks...");
   }
}