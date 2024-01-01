import java.util.Arrays;

public class ArraysInbuiltFun {
    public static void main(AboutString[] args) {
        int arr[] = {23,51,32,7,21};
        // to sort the array
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        // to get the length of the array
        System.out.println("Length of the array : " + arr.length);

        // to check whether the two arrays are equal or not
        int a1[] = {12,45,64,78};
        int a2[] = {12,4,64,78};
        boolean res = Arrays.equals(a1,a2); // it returns boolean value
        System.out.println(res);

        // to perform searching(binary search)
        int index = Arrays.binarySearch(arr, 32); // it returns the index of the key, if not found return -(insertion point)
        // insertion point means where the element(key) should be placed
        System.out.println(index);
    }
}
