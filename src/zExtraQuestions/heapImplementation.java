package zExtraQuestions;

import java.util.ArrayList;

public class heapImplementation {
    ArrayList<Integer> list = new ArrayList<>();
    

    public void insert(int value){
        list.add(value);
        buildMaxHeap(list.size()-1);
    }

    private void buildMaxHeap(int index) {
        int p = getParentIndex(index);
        if(list.get(p)>list.get(index)){
            swap(list,p,index);
            buildMaxHeap(p);
        }
    }
    public void swap(ArrayList<Integer> list, int p, int index){
        int temp = list.get(p);
        list.set(p, list.get(index));
        list.set(index,temp);
    }
//    remove the list[0] value or can say remove root of heap tree
    public int remove(){
        int temp = list.get(0);
        list.set(0, list.get(list.size()-1));
        if(!list.isEmpty()){
            list.remove(list.size()-1);
            downheap(0);
        }
        return temp;
    }

    private void downheap(int i) {
        int min=i;
        int left = getLeftIndex(i);
        int right = getRightIndex(i);
        if(left<=list.size()-1 && list.get(left)<list.get(min)){ // here we can also write get(i) instead if get(min)
            min=left;
        }
        if(right<=list.size()-1 && list.get(right)<list.get(min)){
            min=right;
        }
        if(min!=i){
            swap(list,min,i);
        }
    }

    private int getRightIndex(int i) {
        return (i*2)+1;
    }

    private int getLeftIndex(int i) {
        return (i*2)+2;
    }

    private int getParentIndex(int index) {
        return (index-1)/2;
    }
    public void display(){
        System.out.println(list);
    }
    public static void main(String[] args) {
        heapImplementation heap = new heapImplementation();
        heap.insert(3);
        heap.insert(5);
        heap.insert(2);
        heap.insert(8);
        heap.insert(4);
        heap.display();

//        System.out.println(heap.remove());
//        heap.display();
////        System.out.println(heap.remove());


//        printing list in increasing order
        for (int i = 0; i <5 ; i++) {
            System.out.print(heap.remove()+" ");
        }
    }
}
