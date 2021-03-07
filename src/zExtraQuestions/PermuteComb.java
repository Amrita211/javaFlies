package zExtraQuestions;

public class PermuteComb {
    public static void main(String[] args) {
        int[] boxes = new int[3];
        permute(boxes,2,1);
        System.out.println();
        combination(1
                ,3,0,2,"");
    }
    public static void permute(int[] boxes, int totalitems, int currItem){
        if(currItem>totalitems){
            for (int i = 0; i <boxes.length ; i++) {
                System.out.print(boxes[i]);
            }
            System.out.println();
            return;
        }
        for (int i = 0; i <boxes.length ; i++) {
            if(boxes[i]==0){
                boxes[i]=currItem;
                permute(boxes,totalitems,currItem+1);
                boxes[i]=0;
            }
        }
    }

    
//    combination
    public static void combination(int currBox, int totBox, int currSel, int totSel, String res){
        if(currBox>totBox){
            if(currSel==totSel){
                System.out.println(res);
            }
            return;
        }
        combination(currBox+1,totBox,currSel+1,totSel,res+"i");
        combination(currBox+1,totBox,currSel,totSel,res+"-");
    }
}
