

public class myLinkedList {
  Node head;

  
  int size = 0;

  int size(){
    Node temp = head;
    int count = 0 ;
    while(temp!=null){
       count++;
      temp = temp.next;
     
    }
    return count;
  }
  void getByIndex(int idx){

    Node temp = head;
    if(idx==0){
      System.out.println(head.data);
    }
    else{
    for(int i=0; i<idx; i++){
      temp = temp.next;
    }
  }
    System.out.println(temp.data);
  }
  void addnode(int data){
    Node n1 = new Node(data);
    if(head == null){
      head = n1;
    }
    else{
      Node temp = head;
      while(temp.next!=null){
        temp=temp.next;
      }
     temp.next = n1; 
    }
    size++;
  }

  public static void main(String[] args){
    myLinkedList ll = new myLinkedList();
    // System.out.println(ll.size());
    ll.addnode(2);
    ll.addnode(5);
    ll.addnode(10);
    // System.out.println(ll.size());
    ll.getByIndex(2);
  }
}
