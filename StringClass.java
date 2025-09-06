public class StringDemo {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = " World";
        String s3 = "   Java Programming   ";

        // length()
        System.out.println("Length of s1: " + s1.length());

        // concat()
        String s4 = s1.concat(s2);
        System.out.println("Concatenated: " + s4);

        // charAt()
        System.out.println("Character at index 1 in s1: " + s1.charAt(1));

        // substring()
        System.out.println("Substring of s4 (0-5): " + s4.substring(0, 5));

        // equals() & equalsIgnoreCase()
        System.out.println("s1 equals 'Hello'? " + s1.equals("Hello"));
        System.out.println("s1 equalsIgnoreCase 'hello'? " + s1.equalsIgnoreCase("hello"));

        // toUpperCase() and toLowerCase()
        System.out.println("Uppercase: " + s1.toUpperCase());
        System.out.println("Lowercase: " + s1.toLowerCase());

        // trim()
        System.out.println("Before trim: '" + s3 + "'");
        System.out.println("After trim: '" + s3.trim() + "'");

        // replace()
        System.out.println("Replace 'a' with 'o' in s3: " + s3.replace('a', 'o'));

        // split()
        String[] words = s3.trim().split(" ");
        System.out.println("Splitting s3 into words:");
        for(String w : words) {
            System.out.println(w);
        }
    }
}
