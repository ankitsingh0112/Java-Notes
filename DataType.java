class DataType
{
    public static void main(String []args)
    {
        byte b = -127; // Range -> (-2^n-1 to -2^n-1 - 1) -> (-2^7 to 2^7 - 1) -> (-128 to 127)
        System.out.println(b);
        short s = 3276; // Range -> (-2^n-1 to -2^n-1 - 1) -> (-2^15 to 2^15 - 1) -> (-32768 to 32767)
        System.out.println(s);
        int i = 3244325; // Range -> (-2^n-1 to -2^n-1 - 1) -> (-2^31 to 2^31 - 1)
        System.out.println("i = " + i);
        long l = 434235L; // Range -> (-2^n-1 to -2^n-1 - 1) -> (-2^63 to 2^63 - 1) // l/L -> as suffix mandatory
        System.out.println(l);
        float f = 34.7f; // Range -> ?(to be find) // f -> as suffix mandatory
        System.out.println(f);
        double d = 54.987;
        System.out.println(d);
        char c = 'A';
        System.out.println(c);
        boolean bl = true;
        System.out.println(bl);
    }
}