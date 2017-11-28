// Demonstrates traversing lists of ListNodes.

public class ListNodeTraversals {
   public static void main(String[] args) {
      // for jGRASP debugger (so we can see other lists' names)
      ListNode dummy = new ListNode(-1);

      // 6 -> 42 -> 15 -> 7
      ListNode list = new ListNode(6, new ListNode(42, 
                      new ListNode(15, new ListNode(7))));
                      
//       System.out.println(list.data);
//       System.out.println(list.next.data);
//       System.out.println(list.next.next.data);

      // as long as there are nodes
      //    print node
      //    go to the next one
      
      // We started by simply updating list.  This 
      // gave us a destructive traversal.  The current
      // reference allows us to look at each node without
      // destroying the list.
      ListNode current = list;
      while (current != null) {
         System.out.println(current.data);
         current = current.next;
      }
   }
}