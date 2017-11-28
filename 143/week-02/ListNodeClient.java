// Demonstrates using ListNode objects to build chains of values.
public class ListNodeClient {
   public static void main(String[] args) {
      // for jGRASP debugger (so we can see other lists' names)
      ListNode dummy = new ListNode(-1);

      // Build this list: 6 -> 42 -> 15
      // ListNode list = new ListNode(); // 0
      // list.data = 6; // 6
      //
      // list.next = new ListNode(); // 6 -> 0
      // list.next.data = 42; // 6 -> 42
      //
      // list.next.next = new ListNode(); // 6 -> 42 -> 0
      // list.next.next.data = 15; // 6 -> 42 -> 15

      // constructors make this shorter:
      ListNode list = new ListNode(6, new ListNode(42, new ListNode(15)));
   }
}