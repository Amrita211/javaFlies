import Binarytree.Binary;

import java.util.Scanner;

public class BinaryTreePractice {
    Node root;
    public class Node{
        int value;
        Node left;
        Node right ;
        public Node(int value){
            this.value = value;
        }
    }
    private void insertion(Scanner s){
        this.root = insertion(s, root);
    }
    private Node insertion(Scanner s , Node node){
        if(node == null){
            System.out.println("enter the value:-");
            int val= Integer.parseInt(s.nextLine());
            return new Node(val);
        }
        System.out.println("in which direction you want to add the node ");
        String dir = s.nextLine();
        if(dir.equals("left")){
            node.left = insertion(s,node.left);
        }
        else{
            node.right = insertion(s,node.right);
        }
        return node;
    }
//    diaplay the tree
    private void display(){
        display(root, "");
    }
    private void display(Node node, String indent){
        if(node==null){
        return;
        }
        System.out.println(indent+node.value);
        display(node.left , indent+"\t");
        display(node.right , indent+"\t");
    }
//    height of the tree
    public int height(){
        return height(root);
    }
    public int height(Node node){
        if(node==null){
            return 0;
        }
        return Math.max(height(node.left), height(node.right))+1;
    }
//    check the presence of a node
    private boolean checkNode(int value){
        return checkNode(value, root);
    }
    private boolean checkNode(int value, Node node){
        if(node == null){
            return false;
        }
        if(node.value == value){
            return true;
        }
        return checkNode(value, node.left) || checkNode(value, node.right);
    }
//    nodes at a particular level (0 1, 2, 3.....)
    private void nodeAtLevelK(int k){
        nodeAtLevelK(root, k);
    }
    private void nodeAtLevelK(Node node, int k){
        if(node==null){
            return;
        }
        if(k==0){
            System.out.print(node.value+" ");
        }
        nodeAtLevelK(node.left, k-1);
        nodeAtLevelK(node.right, k-1);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BinaryTreePractice bin = new BinaryTreePractice();
        bin.insertion(s);
        bin.insertion(s);
        bin.insertion(s);
//        bin.insertion(s);
//        bin.insertion(s);

        bin.display();

        System.out.println(bin.height());

        System.out.println(bin.checkNode(4));

        System.out.println("nodes at level k");
        bin.nodeAtLevelK(1);
    }
}
