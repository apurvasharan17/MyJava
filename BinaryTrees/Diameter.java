package BinaryTrees;

public class Diameter {
    static class Node{ //O(n)
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1;
    }

    //Approach1
    // public static int diam(Node root){ //O(n^2)
    //     if(root==null){
    //         return 0;
    //     }
    //     int ldiam=diam(root.left);
    //     int rdiam=diam(root.right);
    //     int lh=height(root.left);
    //     int rh=height(root.right);
    //     int selfdiam=lh+rh+1;
    //     return Math.max(selfdiam,Math.max(ldiam,rdiam));
    // }


    static class Info{
        int diam;
        int ht;
         Info(int diam,int ht){
            this.diam=diam;
            this.ht=ht;
        }
    }
  
    public static Info diameter(Node root){
        if(root==null){
           return new Info(0,0); 
        }
        Info leftInfo=diameter(root.left);
        Info rightInfo=diameter(root.right);

        int diam=Math.max(Math.max(leftInfo.diam,rightInfo.diam),leftInfo.ht+rightInfo.ht+1);
        int ht=Math.max(leftInfo.ht,rightInfo.ht+1);
        return new Info(diam,ht);
    }
    public static void main(String[] args) {
        /*
            1
           / \
           2    3
          / \   /  \
          4  5  6   7
         */

        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
       root.right.right=new Node(7);
        // System.out.println(diam(root));
        System.out.println(diameter(root).diam);//diameter(root)->object
        System.out.println(diameter(root).ht);
    }
}


