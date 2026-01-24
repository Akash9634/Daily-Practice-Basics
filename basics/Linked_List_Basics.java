import java.util.*;

public class Main {
  public static class Node {
    int data;
    Node next;

  }

  public static class LinkedList {
    Node head;
    Node tail;
    int size;

    void addLast(int val) {
      Node temp = new Node();
      temp.data = val;
      temp.next = null;
      if (size == 0) {
        head = tail = temp; // because linked list is empty
        size++;
      } else {
        tail.next = temp;
        tail = temp;
        size++;
      }
    }

    void display() {
      Node temp = head;
      for (int i = 0; i < size; i++) {
        System.out.println(temp.data);
        temp = temp.next;
      }
    }

    void size() {
      Node temp = head;
      int length = 0;

      while (temp != null) {
        length++;
        temp = temp.next;
      }
      System.out.println(length);
    }

    void removeFirst(){
      if(head==null){
        System.out.println("list is empty");
      }
      else if(size==1){
        head = null;
        tail = null;
        size = 0;
      }
      else{
        head = head.next;
        size--;
      }
    }

    void getFirst(){
      System.out.println(head.data);
    }

    void getLast(){
      System.out.println(tail.data);
    }

    //0 based search
    void getAt(int idx){
      Node temp = head;
      if(head==null || idx<0 || size<=idx){
        System.out.println("-1");
      }

      else if(idx==0){
        System.out.println(temp.data);
      }
      else{
        for(int i = 0; i<idx; i++){
          temp=temp.next;
        }
        System.out.println(temp.data);
    }
      
    }

    void addFirst(int val){
      Node newNode = new Node();
      newNode.data = val;
      newNode.next = head;
      head = newNode;
      if(size==0){
        tail = newNode;
      }
      
      size++;
    }

    void addAtIndex(int idx, int val){
      if(idx>size || idx<0){
        System.out.println("invalid operation");
      }
      else if(idx==0){
        addFirst(val);
      }
      else if(idx==size){
        addLast(val);
      }
      else{
        Node newNode = new Node();
        newNode.data = val;
        Node temp = head;
        //traverse to the previous node of the index we want to add on
        for(int i=0; i<idx-1; i++){
          temp = temp.next;
        }
        newNode.next = temp.next; // newNode points to where temp is pointing 
        temp.next = newNode; // now temp will start pointing to newNode
        size++;
      }

      
    }

    void removeLast(){
      Node temp = head;
      for(int i=0; i<size-1; i++){
        temp = temp.next;
      }
      temp.next = null;
      tail = temp;
      size--;
    }

    private Node getNodeAt(int idx){
      Node temp = head;
      // if(head==null || idx<0 || size<=idx){
      //   System.out.println("-1");
      // }

      if(idx==0){
        return temp;
      }
      else{
        for(int i = 0; i<idx; i++){
          temp=temp.next;
        }
        return temp;
    }
    }

   void reverseLinkedList(){  //swapping the data of the nodes
    int li = 0;
    int ri = size-1;
    
    while(li<ri){
      Node left = getNodeAt(li);
      Node right = getNodeAt(ri);

      int temp = left.data;
      left.data = right.data;
      right.data = temp;

      li++;
      ri--;
    }
   }

   void reverseLinkedListPointer(){ //by using address pointer
    Node prev = null;
    Node curr = head;
    while(curr!=null){
      Node next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    Node temp = head;
    head = tail;
    tail = temp;
   }

  }

  public static void main(String[] args) {
    LinkedList ll = new LinkedList();
    ll.addLast(5);
    ll.addLast(6);
    ll.addLast(8);
    ll.addLast(10);


    //  ll.removeFirst();

    

    // System.out.println("first element is: ");
    // ll.getFirst();


    // System.out.println("element is: ");
    // ll.getAt(1);

    // ll.size();
    // ll.addFirst(67);
    
    // System.out.println();
    // ll.display();

    // ll.size();

    // ll.addAtIndex(2, 45 );
    // System.out.println();
    // System.out.println();



    // ll.display();


    // System.out.println();
    // System.out.println();

    // ll.removeLast();

    // ll.display();

    // System.out.println();
    // System.out.println();

    ll.reverseLinkedListPointer();
    ll.display();



   
    // System.out.println("done");

  }

}
