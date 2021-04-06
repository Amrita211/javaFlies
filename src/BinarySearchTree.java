import java.util.Scanner;

public class BinarySearchTree {
    Node root;
    public class Node{
        Node left;
        Node right;
        int value;
        public Node(int value){
            this.value = value;
        }
    }
    public  void insertion(int key){
        this.root = insertion(key, root);
    }
    public Node insertion(int key , Node node){
        if(node==null){
            return new Node(key);
        }
//        System.out.println("enter the value");
//        int val = Integer.parseInt(s.nextLine());
        if(node.value >key){
            node.left = insertion(key,node.left);
        }
        else{
            node.right = insertion(key, node.right);
        }
        return node;
    }
    public void display(){
        display(root, " ");
    }
    public void display(Node node, String indent){
        if(node==null){
            return;
        }
//        preorder display
        System.out.println(indent+node.value);
        display(node.left,indent+"\t");
        display(node.right, indent+"\t");
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

//     finding the successor of a value/ key
    public int successor(int k){
        return successor(k , root);
    }
    public int successor(int k , Node node){
        if(node==null){
            return -1;
        }
        Node succ = null;
        Node curr = root;
        while(curr!=null){
            if(curr.value>k){
                if(succ == null || succ.value > curr.value){
                    succ = curr;
                }
                curr = curr.left;
            }
            else{
                curr = curr.right;
            }
        }
        return succ.value;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BinarySearchTree bin = new BinarySearchTree();
        bin.insertion(2);
        bin.insertion(1);
        bin.insertion(10);
        bin.insertion(80);
        bin.insertion(9);

        bin.display();

        System.out.println("height of the tree is: "+ bin.height());


        System.out.println("successor of 10 is : "+bin.successor(10));
        System.out.println("successor of 10 is : "+bin.successor(2));
    }
}
