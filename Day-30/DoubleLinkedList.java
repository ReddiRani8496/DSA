public class DoubleLinkedList {
    Node head;
     class Node {
        int value;
        Node up;
        Node next;
        Node(int value) {
            this.value = value;
        }
    }


    void addNext(int value) {
        var node = new Node(value);
        if(head==null) {
            head=node;
        } else {
            var current = head;
            while(current.next !=null)
                current = current.next;
            current.next = node;
        }
    }
    void addUp(int value) {
        var node = new Node(value);
        if(head == null) {
            head = node;
        } else {
            var current = head;
            while(current.up !=null)
                current = current.up;
            current.up = node;
        }
    }
    public void printNextNodes() {
         var current = head;
         while (current != null) {
             System.out.println(current.value);
             current = current.next;
         }
    }
    public void printUpNodes() {
         var current = head;
         while (current != null){
             System.out.println(current.value);
             current= current.up;
         }
    }

    public void add(int value) {
         var node = new Node(value);
         if(head == null)
             head = node;

         else if(value<head.value){
               var current = head;

               while (current.up != null) {
                   if(value>current.value) {
                       while (current.next != null && current.next.value < node.value)
                           current = current.next;
                       node.next = current.next;
                       current.next = node;
                       return;
                   }
                   current = current.up;
               }
               current.up = node;

         } else {
             Node current = head;
             while (current.next != null && current.next.value < node.value)
                 current = current.next;
             node.next = current.next;
             current.next = node;
         }
    }
}
