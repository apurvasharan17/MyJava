package LinkedList;

public class LoopLL {
    
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

    public static void print(){
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

    public static boolean isCycle(){ //Floyed Cycle Finding Algorithm
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next; //+1;
            fast=fast.next.next; //+2;
            if(slow==fast){
                return true; //cycle exists
            }

        }
        return false; //cycle does not exist
    }

    
    public static void main(String[] args) {
        head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=head.next;
        //1->2->3->4->2;
        System.out.println(isCycle());


    }

}
