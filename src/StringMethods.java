

public class StringMethods {
    public static void main(String[] args) {

        String [] s1 = {"start","stating", "ended","ending"};
        String s2 = "Happy";
        String s3 = "Birthday";
        String s4 = "abcdefghijklmabcdefghijklm";
        String s = "  fish  ";

        // Method Starts-with and ends-with

        for(String string : s1){
            if(string.startsWith("st"))
                System.out.printf("\"%s\" starts with \"st\"%n", string);
        }
        for(String string : s1){
            if(string.endsWith("ed"))
                System.out.printf("\"%s\" ends with \"ed\"%n", string);
        }

        // Method indexOF & lastIndexOf

        System.out.printf("c' is located at index %d %n", s4.indexOf('c'));

        System.out.printf("'a' is located at index %d%n", s4.indexOf('a',1));

        System.out.printf("'def' is located at index %d%n", s4.indexOf("def"));

        System.out.printf("Last 'def' is located at index %d%n", s4.lastIndexOf("def"));

        System.out.printf("Last 'def' is located at index %d%n", s4.lastIndexOf("def",25));

        System.out.printf("Last 'nothing' is located at index %d%n", s4.lastIndexOf("nothing"));

        //Extracting Substrings from strings

        System.out.printf("substring from index 20 end is %s%n", s4.substring(20));

        System.out.printf("substring from index 3 to 6  end is %s%n", s4.substring(3,6));

        System.out.printf("s2 concat with s3 %s%n", s2.concat(s3));
        //System.out.printf("Result of s1.concat(s2) = %s%n", s2 .concat(s3));

        //other Strings Method
        //.replace

        System.out.printf("Replace B with Z in s3 %s%n%n", s3.replace("B","Z"));

        //to.UpperCase

        System.out.printf("Print s3 in capital letter: %s%n%n", s3.toUpperCase());

        // to.LowerCase

        System.out.printf("prints s2 in lower case: %s%n%n", s2.toLowerCase());

        //trim,Trim removes excess whitespace

        System.out.printf("Trim removes excess whitespace:%s%n", s.trim());

    }
}
