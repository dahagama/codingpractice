package macbook;


import java.util.*;

public class Solution {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep) {
        while (node != null) {
            System.out.print(node.data);

            node = node.next;

            if (node != null) {
                System.out.print(sep);
            }
        }
    }
    
    public static void reversePrint(SinglyLinkedListNode llist) {
    // Write your code here
        SinglyLinkedListNode previous=null;
        SinglyLinkedListNode currentNode=llist;
        SinglyLinkedListNode next=null;
        
        while(currentNode!=null){
            next=currentNode.next;
            currentNode.next=previous;
            previous=currentNode;
            currentNode=next;
        }
        while(previous != null) {
           System.out.println(previous.data);
           previous = previous.next;
            
       }
        
    }
    
    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
        // Write your code here
        if(llist==null) return null;
            SinglyLinkedListNode newNode= new SinglyLinkedListNode(data);
            
            if(position==0){
                newNode.next=llist;
                return newNode;
            }
            SinglyLinkedListNode c=llist;
            for (int i = 0; i < position - 1 && c.next != null; i++){
                c=c.next;
         }
                    newNode.next=c.next;
                    c.next=newNode;
       
            return llist;
        }
    
    public static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode llist) {
        // Write your code here
        if(llist==null) return llist;
         SinglyLinkedListNode currentNode=llist;
            while(llist.next!=null){
                if(llist.data==llist.next.data){
                    llist.next=llist.next.next;
                }else{
                       llist=llist.next;
                    }   
                }
            return currentNode;
        }

class Result {

    /*
     * Complete the 'reversePrint' function below.
     *
     * The function accepts INTEGER_SINGLY_LINKED_LIST llist as parameter.
     */

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */

    

}

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int tests = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int testsItr = 0; testsItr < tests; testsItr++) {
            SinglyLinkedList llist = new SinglyLinkedList();

            int llistCount = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < llistCount; i++) {
                int llistItem = scanner.nextInt();
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                llist.insertNode(llistItem);
            }

            reversePrint(llist.head);
        }

        scanner.close();
    }
}
