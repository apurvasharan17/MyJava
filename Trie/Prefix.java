package Trie;

public class Prefix {
    static class Node{
        Node children[]=new Node[26];
        boolean eow=false;//eow=end of word
        int freq;

        Node(){
            for(int i=0;i<26;i++){
                children[i]=null;
            }
            this.freq=1;
        }
    }
    
    public static Node root=new Node();

    public static void insert(String word){//O(L),l:-length of word
        Node curr=root;
        for(int level=0;level<word.length();level++){
            int idx=word.charAt(level)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();
            }
            else{
                curr.children[idx].freq++;
            }
            curr=curr.children[idx];
        }

        curr.eow=true;
    }
    public static boolean search(String key){
        Node curr=root;
        for(int level=0;level<key.length();level++){
            int idx=key.charAt(level)-'a';
            if(curr.children[idx]==null){
                return false;
            }
            curr=curr.children[idx];
        }

        return curr.eow==true;
    }

    public static void findPrefix(Node root,String ans){
        if(root==null){
            return;
        }
        if(root.freq==1){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<root.children.length;i++){
            if(root.children[i]!=null){
                findPrefix(root.children[i], ans+(char)(i+'a'));
            }

        }
    }

    public static void main(String[] args) {
        String arr[]={"zebra","dog","duck","dove"};
        for(int i=0;i<arr.length;i++){
            insert(arr[i]);
        }
        root.freq=-1;
        findPrefix(root,"");
    }
}
