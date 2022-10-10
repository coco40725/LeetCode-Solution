import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Yu-Jing
 * @create 2022-10-10-上午 10:17
 */


public class MyHashMap {
    ArrayList<int[][]> list = null;
     ArrayList<Integer> key_list = null;
     public MyHashMap() {
         list = new ArrayList<>();
         key_list = new ArrayList<>();
     }

     public void put(int key, int value) {
         if (key_list.contains(key)){
             int index = getKeyIndex(key_list, key);
             list.set(index, new int[][]{{key, value}});

         }else{
             list.add(new int[][]{{key, value}});
             key_list.add(key);
         }
     }

    public int get(int key) {
        int index = getKeyIndex(key_list, key);
        if (index != -1){
            return list.get(index)[0][1];
        }else{
            return -1;
        }
     }

     public void remove(int key) {
         int index = getKeyIndex(key_list, key);
         if (index != -1){
             list.remove(index);
             key_list.remove(index);
         }
     }

     private int getKeyIndex(List<Integer> list, int target){
         for(int i = 0; i < list.size(); i++){
             if (list.get(i) == target) return i;
         }
         return -1;
     }

}

