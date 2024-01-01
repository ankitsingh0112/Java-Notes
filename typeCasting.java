public class typeCasting {
    public static void main(String []args) {
        byte b = 127;
        int a = b; // (this is implicit conversion...) // there will be no any problem bcoz the range of the int is bigger than the range of the byte
        // but if we try to convert a int value in byte then that will create problem so for performing that we need to
        // first convert the int value in byte by using type casting...
        int n = 12;
        // byte c = n; // this is not possible as we have mentioned earlier...
        byte c = (byte)n; // (this is explicit conversion...) // but by type casting it is possible
        // but but if we have value of int larger than the range of byte then the result will be in modulo form...
        // example : int a = 257 --> 257%256(range of byte) == 1
        // so the output will be 1;
        int k = 257;
        byte d = (byte)k;
        System.out.println(d);

        // now if we want to convert float value to int we can also do that but we might loss some data
        // ex :-
        float f = 5.6f;
        int m = (int)f;
        System.out.println(m);

        // type promotion :-
        byte x = 10;
        byte y = 30;
        // since x*y goes beyond the range of byte but it is inside the range of int so with any conversion we can directly store the result in int datatype
        // this is called as type promotion...
        int res = x*y;
        System.out.println(res);
    }
}
