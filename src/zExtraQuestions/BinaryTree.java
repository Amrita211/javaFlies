package zExtraQuestions;

import java.util.Scanner;

public class BinaryTree {

    private Node root;

    //insertion
    public void insertion(Scanner s){
        this.root = insertion(s,root);
    }
    private Node insertion(Scanner s , Node node){
        if(node==null){
            System.out.println("Enter the value");
            int val = s.nextInt();
            return new Node(val);
        }
        System.out.println("want to add node in left or right ?");
        String dir = s.next();
        if(dir.equals("left")){
            node.left=insertion(s,node.left);
        }
        else{
            node.right=insertion(s,node.right);
        }
        return node;
    }

    //display
    public void display(){
        display(root," ");
    }
    private void display(Node node, String indent){
        if(node==null){
            return;
        }
        System.out.println(indent+node.value);
        display(node.left,indent+"\t");
        display(node.right,indent+"\t");
    }

    // height of the binary tree
    public int height(){
        return height(root);
    }
    private int height(Node node){
        if(node==null){
            return 0;
        }
        return Math.max(height(node.left),height(node.right))+1;
    }
    public class Node{
        int value;
        Node left;
        Node right;
        public Node(int value){
            this.value=value;
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BinaryTree binary = new BinaryTree();
        binary.insertion(s);
        binary.insertion(s);
        binary.insertion(s);
        binary.insertion(s);
        binary.insertion(s);

        binary.display();

        System.out.println("height of the tree is : "+ binary.height());
    }
}
