package PersonMain;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Integer>arr=new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            arr.add(i);

        }
        int indexRemove=-1;
        for (int  k:arr) {

            if(k==5){
                indexRemove=k;
            }
        }
        arr.remove(indexRemove);
        for (int k:arr){
            System.out.println(k);
        }
    }
}
