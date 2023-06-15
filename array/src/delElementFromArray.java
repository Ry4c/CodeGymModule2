import java.util.Arrays;
import java.util.Scanner;

public class delElementFromArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = {1, 5, 6, 89, 3, 3, 53, 3, 642, 7, 59, 3, 3};
        System.out.print("mang bao gom:");
        System.out.println(Arrays.toString(array));
        System.out.print("nhap phan tu can xoa: ");
        int element = input.nextInt();
        System.out.println(Arrays.toString(delElement(array, element)));
    }
    public static int[] delElement(int[] arr, int element){
        boolean flag = false;
        int count = 0;
        for (int i=0; i<arr.length; i++){
            if(arr[i] == element){
                flag = true;
                count ++;
                while (count == 1){
                    int[] newArr = new int[arr.length - 1];
                    System.arraycopy(arr, 0, newArr, 0, i);
                    System.arraycopy(arr, i+1, newArr, i, arr.length-1-i);
                    count--;
                    i--;
                    arr = newArr;
                }
            }
        }
        if (!flag){
            System.out.println("khong co phan tu");
        }
        return arr;
    }
}
