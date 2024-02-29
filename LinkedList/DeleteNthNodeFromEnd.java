package LinkedList;

public class DeleteNthNodeFromEnd {
    

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
    
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
        }
        tail.next=newNode;
        tail=newNode;
        size++;
    }
    public void print(){
        if(head==null){
            System.out.println("LL is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println();
    }



    public void deleteNthfromEnd(int n){
        //calculate size
        int sizee=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            sizee++;

        }

        if(n==sizee){
            head=head.next; //removeFirst
            return;
        }
        //size-n
        int i=1;
        int iToFind=sizee-n;
        Node prev=head;
        while(i<iToFind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;

    }


    public static void main(String[] args) {
        Reverse ll=new Reverse();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();
        ll.deleteNthfromEnd(3);
        ll.print();


    }
}
