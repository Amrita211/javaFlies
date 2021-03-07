package zExtraQuestions;
// a genric tree is that which have any number of of childs
import java.net.SecureCacheResponse;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class genericTree {

    private Node root;
    public void insertion(Scanner s){
        System.out.println("Enter the root value:");
        int val = s.nextInt();
        this.root = new Node(val);
        insertion(root,s);
    }
    private void insertion(Node node, Scanner s){
        while (true){
            System.out.println("want more node of "+node.value+" ?");
            boolean yes = s.nextBoolean();
            if(yes){
                System.out.println("Enter value of "+node.value);
                int val = s.nextInt();
                Node child = new Node(val);
                root.children.add(child);
                insertion(child,s);
            }
            else{
                break;
            }
        }
    }

    // displaying the tree
    public void display(){
        display(root,"");
    }
    private void display(Node node, String indent){
        System.out.println(indent+node.value);
        for (int i = 0; i <node.children.size() ; i++) {
            display(node.children.get(i),indent+"\t");
        }
    }

    // counting thr number of nodes
    public int count(){
        return count(root);
    }
    private int count(Node node){
        if(node==null){
            return 0;
        }
        int cnt=1;
        for (int i = 0; i <node.children.size() ; i++) {
            cnt+=count(node.children.get(i));
        }
        return cnt;
    }

    // level order tree
    public void levelOrder(){
        levelOrder(root);
    }
    private void levelOrder(Node node){
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty()){
            Node temp = queue.remove();
            System.out.print("removed value :"+temp.value+" ");
            for (int i = 0; i <temp.children.size() ; i++) {
                queue.add(temp.children.get(i));
            }
        }
    }
//    finding the maximum value in the tree
    public int findMax(){
        int max = root.value;
        return findMax(max,root);
    }
    private int findMax(int max, Node node){
        if(node==null){
            return 0;
        }
        for (int i = 0; i <node.children.size() ; i++) {
            if(max<node.children.get(i).value){
                max=node.children.get(i).value;
            }
        }
        return max;
    }
    public class Node{
        int value;
        ArrayList<Node> children;
        public Node(int value){
            this.value=value;

            this.children = new ArrayList<>();
        }
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        genericTree tree = new genericTree();

        tree.insertion(s);
//        tree.display();

//        System.out.println("NO. of nodes in tree "+tree.count());

//        System.out.println("Level order traversal");
//        tree.levelOrder();
//        tree.display();

        System.out.println("maximum value of node in the tree :");
        System.out.println(tree.findMax());
    }
}
