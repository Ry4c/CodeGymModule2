import java.util.Arrays;
public class minInArray {
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 6, 8, 135, 848};
        System.out.println("phan tu nho nhat la: "+ minValue(array) + " nam o vi tri:" + Arrays.binarySearch(array, minValue(array)));
    }
    public static int minValue(int[] arr){
        int min = arr[0];
        for (int i=1; i<arr.length; i++){
            if (arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
}
