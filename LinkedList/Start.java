package LinkedList;
public class Start {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
      //step1=create new node
      Node newNode=new Node(data);
        if(head==null){
            size++;
            head=tail=newNode;
            return; }
        //step2-newNodw next=head;
        newNode.next=head; //link
        //step3=> head=newNode
        head=newNode;
        size++;
    }

    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
        }
        tail.next=newNode;
        tail=newNode;
        size++;
    }


    public void add(int index,int data){

        if(index==0){
            addFirst(data);
            return;
        }
        size++;
        Node newNode=new Node(data);
        Node temp=head;
        int i=0;

        while(i<index-1){
            temp= temp.next;
            i++;
        }

        //i=index-1 ; temp->prev;
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public void print(){
        if(head==null){
            System.out.println("LL is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }


    public int removeFirst(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size==0){
            System.out.println("LL is empty");            
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        //prev : i=size-2;
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=prev.next.data; //tail.data
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }

    public int iterativeSearch(int key){
        Node temp=head;
        int i=0;

        while(temp!=null){
            if(temp.data==key){ //key found
                return i;
            }
            temp=temp.next;
            i++;
        }
        //key not found
        return -1;

    }
    public int helper(Node head,int key){
        if(head==null){
            return -1;

        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next,key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }
    public int recursiveSearch(int key){
        return helper(head,key);

    }
    public static void main(String[] args) {
      Start ll=new Start(); //classname should be there
      ll.addFirst(1);
      ll.addFirst(2);
      ll.addLast(3);
      ll.addLast(4);
      ll.add(2,9);
      ll.print();
      System.out.println(size);
      ll.removeFirst();
     
      ll.print();
      ll.removeLast();
      ll.print();
      System.out.println(size);


      System.out.println("Iterative Search:-"+ll.iterativeSearch(3));
      System.out.println("Iterative Search:-"+ll.iterativeSearch(10));
      System.out.println("Recursive Search:-"+ll.recursiveSearch(3));
      System.out.println("Recursive Search:-"+ll.recursiveSearch(10));
    }

    public void reverse() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'reverse'");
    }
}
