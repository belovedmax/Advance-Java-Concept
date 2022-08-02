public class StringBuilderCapLen {
    public static void main(String[] args) {
        StringBuilder buffer = new StringBuilder("Hello, how are you?");

        System.out.printf("buffer =%s%n length = %d%n capacity = %d%n%n", buffer.toString(),buffer.length(), buffer.capacity());

        //.length counts the length of strings and even white space in the string-builder

        //guarantee that the string-builder has at least the specific capacity.
        buffer.ensureCapacity(75);


        //prints the capacity of this string-builder
        System.out.printf("New capacity = %d%n%n", buffer.capacity());

        //sets length of the new string
        buffer.setLength(19);
        System.out.printf("New length = %d%n buffer = %s%n", buffer.length(), buffer.toString());

        //this gets all the characters in buffer from 0 index - length of the string to the last index using for loop
        char[] chars = new char[buffer.length()];
        buffer.getChars(0,buffer.length(),chars,0);
        System.out.print("The characters are: ");
        for(char character :chars)
        System.out.print( character);

        //for set.CharAt
        System.out.println("");
        buffer.setCharAt(0, 'h');
        buffer.setCharAt(7,'H');
        buffer.setCharAt(15,'Y');
        System.out.printf("Set new letter in each of the starting of string:" + buffer.toString());

        //reverse buffer
        System.out.println("");
       //
        System.out.println("prints buffer backward:" + buffer.reverse());

        //insert
        buffer.reverse();

        System.out.println("print buffer and insert dear: " + buffer.insert(18," dear"));

        //delete a string from the buffer.

        System.out.println("delete hello from buffer: " + buffer.delete(0,7));









    }
}
