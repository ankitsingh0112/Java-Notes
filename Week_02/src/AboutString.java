public class AboutString {
    public static void main(String[] args) {
        // In java string is class
//        String name = new String("Ankit"); // we can create string in this way but this there is one more way which is more convenient
        String user = "Ankit";
        user = user + " Kumar";
        System.out.println("Hello " + user);
        System.out.println(user.charAt(3)); // to get char at index 3
        System.out.println(user.concat(" Singh")); // to concatenate strings
        System.out.println(user.toUpperCase()); // to convert in upper case

        /*
            Strings are of two types :
            1) Mutable string --> that can be changed
            2) Immutable string(StringBuffer and StringBuilder) --> that can't be changed

            the above example that we have seen are immutable strings means if we change the string then in the stack only the address
            will be changed and in the string constant pool the older string will be present as garbage

            for ex :-
            we are updating user in line 6 but in the string constant pool one new address will be created for updated user
            and the old one will remain same

            for more detail : https://www.javatpoint.com/difference-between-string-and-stringbuffer
        */

        // using String class
        System.out.println("Hashcode test of String:");
        String str="java";
        System.out.println(str.hashCode());
        str=str+"tpoint";
        System.out.println(str.hashCode());

        // using StringBuffer
        System.out.println("Hashcode test of StringBuffer:");
        StringBuffer sb=new StringBuffer("java");
        System.out.println(sb.hashCode());
        sb.append("tpoint");
        System.out.println(sb.hashCode());

        // with the help of this example we can see that string creates two different location in the memory
        // and StringBuffer is mutable so it changes in only one location....
    }
}
