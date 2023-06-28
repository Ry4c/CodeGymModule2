package JCollectionFramework.src;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {7,2,1,6,5,9};

        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int pos = i;
            while (temp < array[pos] && pos > 0){
                array[pos] = array[pos-1];
                pos--;
            }
            array[pos] = temp;
        }
       /* int pos, x;
        for(int i = 1; i < array.length; i++){ //đoạn array[0] đã sắp xếp
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                array[pos] = array[pos-1]; // đổi chỗ
                pos--;
            }
            array[pos] = x;
        }*/
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}