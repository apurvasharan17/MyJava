package LinkedList;

public class Palindrome {
    
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

      //Slow-Fast Approach
      public Node findMid(Node head){
        Node slow=head;
        Node fast= head;
        while(fast!=null && fast.next !=null){
            slow=slow.next;//+1
            fast=fast.next.next;//+2
        }
        return slow; //slow is my midNode
    }

    public boolean checkPalindrome(){
        if(head==null || head.next==null){
            return true;
        }
        //step1 - find mid
        Node midNode=findMid(head);
        //step2 - reverse 2nd Half
        Node prev=null;
        Node curr=midNode;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right= prev;//right half head
        Node left=head;
        //step3 - check left half And RIght half
        while(right!=null){
            if(left.data !=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Palindrome ll=new Palindrome();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(2);
        ll.addLast(5);
        ll.print();
        System.out.println(ll.checkPalindrome());
    }

}
