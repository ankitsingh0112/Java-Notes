class literals{
    public static void main(String []args) {
        // int num = 0b101; // in binary
        // int num = 0x7E; // in hexadecimal
        // int num = 1_00_00_000; // we can seprate the 0's using '_' --> to easily know how many 0's are there...
        double num = 12e3; // 12 * 10 to the power 3
        System.out.println(num);
        char c = 'a';
        c++;
        System.out.println(c);
    }
}