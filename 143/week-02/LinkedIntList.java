public class LinkedIntList {
   private ListNode front;

   // Initializes a new empty list.
   public LinkedIntList() {
      front = null;
   }

   // Adds the given value to the end of the list.
   public void add(int value) {
      if (front == null) {
         front = new ListNode(value);
      } else {
         ListNode current = front;
         while (current.next != null) {
            current = current.next;
         }

         current.next = new ListNode(value);
      }
   }

   // Returns the number of elements in this list
   public int size() {
      int count = 0;
      ListNode current = front;

      while (current != null) {
         count++;
         current = current.next;
      }

      return count;
   }

   // Returns the value at the given index.
   // Pre: 0 <= index < size
   // Throws NullPointerException if index >= size
   public int get(int index) {
      ListNode current = front;

      for (int i = 0; i < index; i++) {
         current = current.next;
      }

      return current.data;
   }

   // Returns a comma-separated String representation of this list.
   public String toString() {
      if (front == null) {
         return "[]";
      } else {
         String result = "[" + front.data;
         ListNode current = front.next;
         while (current != null) {
            result += ", " + current.data;
            current = current.next;
         }
         result += "]";
         return result;
      }
   }
}