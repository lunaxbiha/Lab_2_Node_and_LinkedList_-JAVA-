//lab task 2
public class LabTask2 {
    
    // No need to submit this task
    public static Node wordDecoder( Node head ){
      
      int size=0;
      Node temp = head;
      
      
      while(temp!=null)
      {
        size+=1;
        temp=temp.next;
        
      }
      
      temp=head;
      
      int len = 13%size;
      int index =0;
      Node dummyhead = new Node(null);
      
      
      while(temp!=null){
        
        if(index%len==0 && index!=0){
          
          Node newNode = new Node(temp.elem);
          newNode.next=dummyhead.next;
          dummyhead.next=newNode;
          
        }
        index++;
        temp=temp.next;
      }
      
      
      return dummyhead;
      
  
    }

    //NOTE: if you find any issue with the driver code please inform AIB
    //DO NOT TOUCH THE DRIVER CODE BELOW
    public static void main(String[] args){
        System.out.println("==============Test Case 1=============");
        Node head = LinkedList.createList(new Character[]{'B', 'M', 'D', 'T', 'N', 'O', 'A', 'P', 'S', 'C'});
        System.out.print("Encoded Word: ");
        LinkedList.printLL(head);
        System.out.println("\nExpected output: null -> C -> A -> T");
        Node result = wordDecoder(head);
        System.out.println( "Your output: ");
        LinkedList.printLL(result); //This should print null -> C -> A -> T
        System.out.println();
        System.out.println("==============Test Case 2=============");
        head = LinkedList.createList(new Character[]{'Z', 'O', 'T', 'N', 'X'});
        System.out.print("Encoded Word: ");
        LinkedList.printLL(head);
        System.out.println("\nExpected output: null -> N");
        result = wordDecoder(head);
        System.out.println( "Your output: ");
        LinkedList.printLL(result); //This should print null -> N
        System.out.println();
    }
}
