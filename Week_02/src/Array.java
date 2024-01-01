public class Array {
    public static void main(AboutString[] args) {
        // One-Dimensional Array :-
        /*
        // creation of array :
        int []arr = {12,45,67}; // static array
        // update the value of any index :
        arr[2] = 54;
        System.out.println(arr[2]);

        // Dynamic creation of array :
        int []nums = new int[5]; // this will be created during run time with a size of 5 and all have initial value as 0
        nums[2] = 9;
        System.out.println(nums[2]);

        // printing the elements of the array :
        int[] values = {23,56,43,121,76,42};
        // to find length of an array --> array_name.length
        System.out.println("Length of given array : " + values.length);
        for(int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
        // Enhanced for loop --> for one-dimensional array
        for (int value : values) {
            System.out.println(value);
        }
        */

        // Multi-Dimensional Array :-
        /*
        // Static Creation of array :
        int[][] arr = {{1,4,5,3},
                {2,5,1,6},
                {5,8,9,3}};
        System.out.println(arr[2][2]);
        // length of row --> arr.length
        System.out.println("Length of Row : " + arr.length);
        // length of column --> arr[0].length
        System.out.println("Length of Column : " + arr[0].length);
        // printing all elements of the array :
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        // enhanced for loop --> for multi-dimensional array
        for (int[] n : arr) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }

        System.out.println();

        // Dynamic Creation of array :
        int[][] nums = new int[3][4];
        // assigning some random value using Math.random() --> it returns double so convert it into int
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums[0].length; j++) {
                nums[i][j] = (int)(Math.random()*10); // random value have range b/w 0 to 1 that's why multiply with 10 so that we can value b/w 0 to 9...
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

         */

        // Jagged Array :-
        /*
        Example : (2-d array having unfixed no. of columns)
        arr = {{2,3,5},{1,3,4,6},{2,6}}
        */
        int[][] arr = new int[3][];
        arr[0] = new int[3];
        arr[1] = new int[4];
        arr[2] = new int[2];

        // generating random values
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int)(Math.random()*10);
            }
        }

        System.out.println();

        for (int[] n : arr) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
