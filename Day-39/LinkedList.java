import java.util.HashMap;
import java.util.HashSet;
import java.util.NoSuchElementException;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;

        Node(int value) {
            this.value = value;
        }
    }
     Node head;
    private Node tail;

    private int size;
    public void addLast(int item) {
        var node = new Node(item);
        if(isEmpty())
            head = tail = node;
        else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public void addFirst(int item) {
        var node = new Node(item);
        if(isEmpty())
            head = tail = node;
        else {
            node.next = head;
            head = node;
        }
        size++;
    }
    private boolean isEmpty(){
        return head==null;
    }

    public int valueOf(int index) {
        var current = head;
        int start = 0;
        while (current != null) {
            if(start == index)
                return current.value;
            current = current.next;
            start++;
        }
        return  -1;
    }
    public int indexOf(int value) {
        var current = head;
        int start = 0;
        while (current != null) {
            if(current.value == value)
                return start;
            current = current.next;
            start ++;
        }
        return  -1;
    }

    boolean contains(int value) {
        return indexOf(value) != -1;
    }

    public void removeFirst() {
        if(isEmpty())
            throw new NoSuchElementException();
        if(head == tail)
            head = tail = null;
        else {
            Node temp = head.next;
            head.next = null;
            head = temp;
        }
        size--;
    }

    public void removeLast() {
        if(isEmpty())
            throw new NoSuchElementException();
        if(head == tail)
            head = tail = null;
        else {
            Node current = head;

            while (current.next != tail)
                current = current.next;

            current.next = null;
            tail = current;
        }
        size--;
    }

    public int size() {
        return size;
    }

    public void reverse() {
        if(isEmpty())
            return;
        var previous = head;
        var current = head.next;

        while (current!=null) {
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        tail = head;
        tail.next = null;
        head = previous;
    }

    public void reverseK(int k) {

        if(head==null)
            return;

        if(k>size || k<=0)
            throw new IllegalStateException();

        if(k==1)
            return;

        var previous = head;
        var current = head.next;
        int index = 2;

        while (current!=null) {
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
            if(index==k) {
                head.next = current;
                head = previous;
                return;
            }
            index++;
        }
    }

    public void getKLast(int k) {
        if(isEmpty())
            throw new IllegalStateException();

        var first = head;
        var second = head;
        for(int i=0;i<k-1;i++) {
            second = second.next;
            if(second == null)
                throw new IllegalArgumentException();
        }
        while (second!=tail) {
            first = first.next;
            second = second.next;
        }
        System.out.println(first.value);
    }

    public void printMiddle() {
        if(isEmpty())
            throw new IllegalArgumentException();
        var first = head;
        var second = head;

        while (second != tail && second.next != tail) {
            first = first.next;
            second = second.next.next;
        }
        if(second == tail)
            System.out.println(first.value);
        else
            System.out.println(first.value+" "+first.next.value);
    }

    static LinkedList createLoop() {
        var list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        var backUp = list.tail;
        list.addLast(50);
        list.addLast(60);
        list.tail.next = backUp;
        return list;
    }

    boolean detectLoop() {
        var slow = head;
        var fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
                return true;
        }
        return false;
    }

//    boolean detectLoop() {
//        HashSet<Object> set = new HashSet<>();
//        var node = head;
//        while ( node.next != null && (!set.contains(node))){
//            set.add(node);
//            node = node.next;
//
//        }
//        return node.next != null;
//    }

    public void addAt(int index, int value) {



        if(index<0 || index>size)
            throw new IllegalArgumentException();

        if(index == 0) {
           addFirst(value);
           return;
        }
        if(index==size) {
            addLast(value);
            return;
        }
        else {
            var node = new Node(value);
            int start = 0;
            var current = head;
            while (start<index-1) {
                current = current.next;
                start++;
            }
            var temp = current.next;
            current.next = node;
            node.next = temp;
            size++;
        }
    }

    public int lastIndexOf(int value) {

        if(indexOf(value)==-1)
            return -1;
        else {
            var current = head;
            int start = 0;
            int index=0;
            while (current != null) {
                if (current.value == value)
                    index = start;
                start++;
                current = current.next;
            }

            return index;
        }
    }

    public int binToDec() {

        int result = 0;
        var current = head;
        while(current != null) {
            result *= 2;
            result += current.value;
            current = current.next;
        }
        return result;
    }

    public int binToDec1() {
        int result = 0;
        int start = size() - 1 ;
        var current = head;
        while (current != null) {
            int sum = (int) Math.pow(2,start);
            sum *= current.value;
            result += sum;
            current = current.next;
            start --;
        }
        return result;
    }

    public int binToDec2() {
        reverse();
        int result = 0;
        int start = 0;
        var current = head;
        while (current != null) {
            int sum = (int) Math.pow(2,start);
            sum *= current.value;
            result += sum;
            start++;
            current = current.next;
        }
        return result;
    }
    static int start = 0;
    Node current = head;
    public  void insertAt(int index, int value) {
        if(index==size) {
            addLast(value);
            return;
        }
        if(index<0 || index>size)
            throw new IllegalArgumentException();
        if(head == null)
            return;
        if(index == 0) {
            addFirst(value);
            return;
        }
        if(start == index) {
            var node = new Node(value);
            var temp = current.next;
            current.next = node;
            node.next = temp;
            size++;
        }
        current = current.next;
        start++;
        insertAt(index,value);
    }

    public  void traversal(Node node) {
        if(node == null)
            return;
        System.out.println(node.value);
        traversal(node.next);
    }

    public void remove(Node node) {
        if(node == null)
            throw new IllegalStateException();
        else if(node.next == null) {
            head = null;
            size--;
            return;
        } else if(node.next.next == null) {
            node.next = null;
            size--;
            return;
        }
        remove(node.next);
    }

    public void insert(int data) {
        var node = new Node(data);
        if(head == null) {
            head = node;
        } else if(node.value < head.value) {
            node.next = head;
            head = node;
        } else {
            Node current = head;
            while (current.next != null && current.next.value < node.value)
                current = current.next;
            node.next = current.next;
            current.next = node;
        }
        size++;
    }

    public static LinkedList joinTowLists(LinkedList l1, LinkedList l2) {
        if(l1.head==null) {
            l1.head = l2.head;
            return l1;
        } else if(l2.head == null)
            return l1;
        else {
            var current = l1.head;
            while (current.next != null)
                current = current.next;
            current.next = l2.head;
            return l1;
        }
    }
    public static LinkedList joinTowListsrec(LinkedList l1, LinkedList l2, Node node) {

        if(l1.head==null) {
            l1.head = l2.head;
            return l1;
        } else if(l2.head == null)
            return l1;
        else if(node.next == null){
            node.next = l2.head;
            return l1;
        }
        else {
            joinTowListsrec(l1, l2, node.next);
        }
        return l1;
    }

    public void swap() {
        if(size==1 || size==2)
            return;
        else {
            var current = head;
            int index = 1;
            while (current!=null){
                if(index%2==0) {
                    int temp = current.next.value;
                    current.next.value = current.value;
                    current.value = temp;
                    current = current.next.next;

                }
                else {
                    current = current.next;
                }
                index++;
            }
        }
    }

//    public void reverseKNodes(Node node,int k) {
//
//        if(head==null)
//            return;
//
//        if(k>size || k<=0)
//            throw new IllegalStateException();
//
//        if(k==1)
//            return;
//
//        var previous = node;
//        var current = previous.next;
//        var next = current.next;
//        int index = 0;
//
//        while ( index<k &&current!=null) {
//
//            current.next = previous;
//            previous = current;
//            current = next;
////            if(index==k) {
////                head.next = current;
////                head = previous;
////                break;
////            }
//            index++;
//        }
//        if(next!=null)
//            reverseKNodes(next,k);
//
//    }

    public Node reverseKNodes(Node node,int k) {

        if(head==null)
            throw new IllegalStateException();

        if(head.next==null) {
            return head;
        }


        Node previous=head;
        Node current=head.next;
        Node next=current.next;

        int count=1;

        while(count<k) {

            current.next=previous;
            previous=current;
            current=next;

            if(current==null)
                break;

            next=current.next;
            count++;
        }

        head.next=current;
        head=previous;
        return head;

    }
    Node reverse1(Node head, int k)
    {
        if(head == null)
            return null;
        Node current = head;
        Node next = null;
        Node prev = null;

        int count = 0;

        while (count < k && current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }

        if (next != null)
            head.next = reverse1(next, k);

        return prev;
    }

    void removeKthNode(int k){
        // Node temp = head;
        var p1 = head;
        var p2 = head;
        int i=0;
        while(i<=k){
            p1 = p1.next;
            i++;
        }
        if(p2.next == p1){
            p2 = p2.next;
            return;
        }
        while(p1.next != null){
            p1 = p1.next;
            p2 = p2.next;
        }

        var temp = p2.next.next;
        p2.next.next = null;
        p2.next = temp;
    }

    public Node segregate(Node node) {

        Node evenStart,evenEnd,oddStart,oddEnd;
        evenStart=evenEnd=oddEnd=oddStart=null;
        for(Node current = head;current!=null;current = current.next) {
            var x = current.value;
            if(x%2==0){
                if(evenStart==null)
                    evenStart=evenEnd=current;
                else {
                    evenEnd.next = current;
                    evenEnd = current;
                }
            } else {
                if(oddStart==null)
                    oddStart=oddEnd=current;
                else {
                    oddEnd.next = current;
                    oddEnd = current;
                }
            }
        }
        if(evenStart==null || oddStart==null)
            return head;
        evenEnd.next = oddStart;
        oddEnd.next = null;
        return evenStart;
    }

    public void removeDuplicates() {

        if(head == null)
            throw new IllegalStateException();

        var current = head;
        var newCurrent = current;
        while (current!=null){
            while (newCurrent.next!=null) {
                if(current.value == newCurrent.next.value) {
                    var temp = newCurrent.next.next;
                    newCurrent.next.next = null;
                    newCurrent.next = temp;
                }
                else
                    newCurrent = newCurrent.next;
            }
            current = current.next;
            newCurrent = current;
        }
    }

    public void removeDuplicates1() {
        if(head==null)
            throw new IllegalStateException();

        var current = head.next;
        var prev= head;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,head.value);
        int i=1;
        while (current!=null) {
            if(map.containsValue(current.value)) {
               var temp = current.next;
               current.next = null;
               prev.next = temp;
               current = prev.next;
            } else {
                map.put(i++,current.value);
                current = current.next;
                prev = prev.next;
            }
        }
    }
    Node backup;
    int size1 = 0;
    int size2 = 0;
    public  Node createList() {
        var list = new LinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(5);
         backup = list.tail;
        list.addLast(6);
        list.addLast(7);
        list.addLast(8);
        return list.head;
    }

    public Node createList1() {
        var list1 = new LinkedList();
        list1.addLast(7);
        list1.head.next = backup;
        return list1.head;
    }

    public void intersection(Node node1, Node node2) {
        var current = node1;
        var newCurrent = node2;
        var previous = newCurrent;
        while (current!=null) {
            while (newCurrent!=null) {
                if(current.value == newCurrent.value) {
                    System.out.println(current.value);
                    return;
                }
                newCurrent = newCurrent.next;
            }
            current = current.next;
            newCurrent = previous.next;
        }
    }
    public void intersection1(Node node1, Node node2) {
        HashSet<Object> set = new HashSet<Object>();
        var current = node1;
        while (current!=null) {
            set.add(current);
            current = current.next;
        }
        var current1 = node2;
        while (current1!=null) {
            if(set.contains(current1)) {
                System.out.println(current1.value);
                return;
            }
            current1 = current1.next;
        }
    }

 

    public Node lastNNodes(int n){

        if(n>size || n<1)
            throw new IllegalStateException();

       int start = size();
       var current = head;
       while (start>n) {
           current = current.next;
           start--;
       }
       return current;
    }

    public boolean isPalindrome(){
        if(isEmpty())
            throw new IllegalArgumentException();

        var first = head;
        var second = head;

        StringBuilder str = new StringBuilder();
        while (second != tail && second.next != tail) {
            str.append(first.value);
            first = first.next;
            second = second.next.next;
        }

        StringBuilder str1 = new StringBuilder();
        var current=first;

        if(second != tail)
            str.append(current.value);
        
        current = first.next;
        while (current!=null) {
            str1.append(current.value);
            current = current.next;
        }
        str1.reverse();
        return str.compareTo(str1) == 0;


    }

    public void removeDupl(){
        var current = head;
        var current1 = head;
        while (current!=null){
            while (current1.next!=null) {
                if(current.value == current1.next.value) {
                    var temp = current1.next.next;
                    current1.next.next = null;
                    current1.next = temp;
                } else {
                    current1 = current1.next;
                }
            }
            current = current.next;
            current1 = current;
        }
    }

    public Node lastNnodes(int n){

        if(n>size || n<0)
            throw new IllegalArgumentException();

        Node previous=head;
        Node current=head;

        if(n==0) {
            return previous;
        }

        for(int i=0;i<n;i++) {
            current=current.next;
        }
        if(current==null) {
           return previous;
        }

        while(current!=tail){
            previous=previous.next;
            current=current.next;
        }
        return previous.next;
    }

}